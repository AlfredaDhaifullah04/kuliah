# PANDUAN PENYELESAIAN JOBSHEET 2 - ETL SCD (Slowly Changing Dimension)

File ini berisi panduan langkah-langkah dan jawaban atas seluruh Tugas (1 s.d. 5) dalam Jobsheet 2.
Buka berkas `.ktr` di folder ini menggunakan **Spoon / Pentaho Data Integration (File → Open)**.

---

## DAFTAR BERKAS `.KR` YANG DIBUAT

| No | Berkas | SCD | Tabel Target | Deskripsi |
|----|--------|-----|--------------|-----------|
| 1 | `2.1_Generate_DimDate_SCD0.ktr` | Type 0 | `DimDate` | Generate 1826 baris tanggal (01-01-2003, 5 tahun) |
| 2 | `2.2_SCD1_DimProduct_Overwrite.ktr` | Type 1 | `dimProduct` | Overwrite semua field selain key |
| 3 | `2.2_SCD2_DimCustomer_AddNewRow.ktr` | Type 2 | `dimCustomer` | city = Type 2 (isCurrent), customerName & phone = Type 1 |
| 4 | `2.3_SCD3_DimProduct_AddNewColumn.ktr` | Type 3 | `dimProduct` | productName saat ini + priorProductName (1 data sebelumnya) |

> **Penting:** Sebelum Run, atur terlebih dahulu koneksi di Spoon:
> - `conn_oltp_legendvehicle` → database `legendvehicle` (OLTP)
> - `conn_dw_legendvehicle` → database `dw_legendvehicle` (DW)
> Gunakan Connection type **MySQL** dan access **Native (JDBC)**, lalu klik **Share** agar bisa digunakan di transformasi lain.

---

## TUGAS 1 - Import database & diagram

1. Buat database `legendvehicle` dan `dw_legendvehicle` di phpMyAdmin/MySQL.
2. Import file `.sql` masing-masing database.
3. Buka phpMyAdmin → pilih database → tab **Designer** → buat diagram relasi tabel untuk keduanya.
4. Screenshot diagram dan simpan sebagai laporan.

---

## 2.1 - Generate dan Load Rows untuk DimDate (SCD Type 0)

### Alur transformasi (`2.1_Generate_DimDate_SCD0.ktr`)

```
Generate Rows → Add Sequence → Calculator → Select Values → Database Lookup → Table Output
```

### Konfigurasi setiap step

| Step | Apa yang diatur |
|------|-----------------|
| **Generate Rows** | Limit = **1826**. Tambahkan field `CurrentDate`, type **Date**, format `dd-MM-yyyy`, nilai awal `01-01-2003`. |
| **Add Sequence** | Nama field = `incrementDay`, start value = **0**, increment by = **1**. |
| **Calculator** | Buat 4 field baru:<br>• `streamDate` = CurrentDate + incrementDay<br>• `streamYear` = Year dari streamDate<br>• `streamMonth` = Month dari streamDate<br>• `streamDay` = Day of month dari streamDate |
| **Select Values** | Tab **Remove**, hapus field `CurrentDate` dan `incrementDay` (tidak diperlukan lagi). |
| **Database Lookup** | Connection `conn_dw_legendvehicle`, lookup table `DimDate`. Bandingkan `streamDate` (dari stream) dengan `date` (dari tabel DimDate). |
| **Table Output** | Hubungkan dari output **Error** (baris yang gagal di-lookup = tanggal belum ada). Connection `conn_dw_legendvehicle`, schema `dw_legendvehicle`, tabel `DimDate`. Aktifkan **Specify database fields**, mapping:<br>• `streamDate` → `date`<br>• `streamYear` → `year`<br>• `streamMonth` → `month`<br>• `streamDay` → `day` |

### Tugas 2 (2.1) - Penjelasan setiap step

| Step | Fungsi dalam transformasi |
|------|---------------------------|
| **1. Generate Rows** | Menghasilkan sejumlah baris data kosong sesuai limit (1826 baris) sebagai aliran data awal. |
| **2. Add Sequences** | Menambahkan angka urut (sequence) ke setiap baris, disimpan di field `incrementDay` (mulai 0, bertambah 1). Digunakan untuk mendorong tanggal ke hari berikutnya. |
| **3. Calculator** | Melakukan perhitungan pada field: menambahkan `incrementDay` ke `CurrentDate` untuk menghasilkan `streamDate`, lalu mengekstrak tahun, bulan, dan tanggal dari `streamDate`. |
| **4. Select Values** | Memilih field mana yang akan diteruskan ke step selanjutnya. Di sini digunakan untuk **menghapus** `CurrentDate` dan `incrementDay` karena sudah tidak diperlukan. |
| **5. Database Lookup** | Mengecek apakah suatu tanggal sudah tersimpan di tabel `DimDate` dengan mencocokkan `streamDate` dengan field `date` di database. |
| **6. Table Output** | Menyimpan baris yang tidak berhasil di-lookup (tanggal yang belum ada) ke tabel `DimDate` melalui error handling step. |

### Tugas 2 (no. 18) - Cek keberhasilan
Transformasi sukses jika tabel `DimDate** terisi **1826 data**.

---

## 2.2 - SCD Type 1 – Overwrite (`dimProduct`)

### Alur transformasi (`2.2_SCD1_DimProduct_Overwrite.ktr`)

```
Table Input → Select Values → Database Lookup
                                   ├─(error)→ Table Output (Insert baru)
                                   └─(main) → Update (Overwrite)
```

### Konfigurasi

| Step | Apa yang diatur |
|------|-----------------|
| **Table Input** | Connection `conn_oltp_legendvehicle`. Query join `products` dan `productLines` (karena DW menggunakan star schema). Contoh: `SELECT p.productCode, p.productName, p.productLine, ..., pl.textDescription FROM products p JOIN productLines pl ON p.productLine = pl.productLine`. |
| **Select Values** | Pilih dan rename field dengan prefix `stream…` (misal `productName` → `streamProductName`) agar tidak ambigu. |
| **Database Lookup** | Connection `conn_dw_legendvehicle`, lookup table `dimProduct`. Bandingkan `productCode` dari stream dengan `productCode` di `dimProduct` (primary key). |
| **Table Output** | Dari output **Error** (productCode belum ada). Insert baris baru ke `dimProduct`. Aktifkan Specify database fields + Get fields. |
| **Update** | Dari output **Main** (productCode sudah ada). Connection, schema, tabel, dan key = `productCode`. Tentukan field yang di-update (Update fields) — semua field atribut kecuali key. Gunakan tombol **Get update fields** untuk bantu. |

### Tugas 3 (SCD Type 1)

1. **Save dan run**, screenshot Step Metrics pada Execution Results.
2. Periksa apakah data produk sudah tersimpan di `DimProduct`.
3. **Insert 1 produk baru** di tabel `products` (OLTP) dan **update 1 data produk** (misal ubah `productName` atau category). Run ulang transformasi, screenshot Step Metrics.
4. **Apakah ada duplikasi data produk? Mengapa?**  
   **Tidak ada duplikasi.** Karena SCD Type 1 menggunakan **overwrite**: jika `productCode` sudah ada di `dimProduct`, data akan di-update (baris sama, nilai ditimpa); jika belum ada, baru di-insert satu baris. Primary key `productCode` mencegah duplikasi.
5. **Modifikasi step Update agar `buyPrice` menggunakan SCD Type 0.**  
   - Pada step **Update**, **hapus `buyPrice` dari daftar Update fields** (jangan di-update di DW meskipun berubah di OLTP), atau tambahkan **Filter rows** sebelum Update sehingga baris yang hanya berubah `buyPrice` tidak diproses.  
   - Setelah modifikasi, ubah data di OLTP, run ulang, screenshot Step Metrics. Pastikan `buyPrice` di DW **tidak berubah** meskipun ada perubahan di OLTP.

---

## 2.2 - SCD Type 2 – Add New Row (`dimCustomer`)

### Alur transformasi (`2.2_SCD2_DimCustomer_AddNewRow.ktr`)

```
Table Input → Add Constant → Select Values → Database Lookup
                                   ├─(error) → Table Output (customer baru)
                                   └─(main)  → Filter Rows (city berubah?)
                                                ├─ false → Update (customerName & phone, Type 1)
                                                └─ true  → Update 2 (isCurrent=false untuk city lama)
                                                                           → Table Output (baris baru, isCurrent=true)
```

### Konfigurasi

| Step | Apa yang diatur |
|------|-----------------|
| **Table Input** | Ekstrak dari tabel `customers` (OLTP). |
| **Add Constant** | Tambahkan `streamTrue` = `Y` dan `streamFalse` = `N` untuk mengecek nilai `isCurrent`. |
| **Select Values** | Rename field dengan prefix `stream…` (misal `city` → `streamCity`). |
| **Database Lookup** | Cek apakah customer sudah tersimpan dengan `isCurrent = true`. Key: `customerNumber` dan `isCurrent`. Tambahkan kolom `city` dan `id_dimCustomer` untuk step selanjutnya. |
| **Table Output** | Dari output **Error** (customer baru) → insert baris baru ke `dimCustomer` dengan `isCurrent = Y`. |
| **Filter Rows** | Cek apakah ada perubahan nilai `city`: bandingkan `streamCity` (dari OLTP) dengan `city` (dari DimCustomer). |
| **Update** | Dari output **False** (city tidak berubah): update `customerName` dan `phone` (Type 1). Key: `customerNumber`. |
| **Update 2** | Dari output **True** (city berubah): set `isCurrent = false` untuk data city lama, lookup by `id_dimCustomer`. |
| **Table Output** | Dari output `Update 2` → insert baris baru untuk customer yang sama dengan city baru, `isCurrent = Y`. |

### Tugas 4 (SCD Type 2)

1. Save dan run, screenshot Step Metrics.
2. **Insert 1 baris baru** pada tabel `customers` di OLTP. Modifikasi `phone` pada satu customer dan `city` pada customer lain.
3. Run ulang, screenshot Step Metrics. **Berapa baris baru yang ditambahkan pada `DimCustomer`?**  
   - 1 baris untuk customer baru yang di-insert di OLTP.
   - 1 baris baru untuk customer yang `city`-nya berubah (baris lama di-expire, baris baru disisipkan).  
   - Perubahan `phone` **tidak** menambah baris baru (hanya update in-place karena Type 1).
4. **Percobaan: jika The keys to look up the values pada langkah 14 diubah seperti pada langkah 16, apakah paket ETL masih bekerja dengan benar?**  
   - Langkah 14 (Update) sebaiknya menggunakan key `customerNumber`, sedangkan langkah 16 (Update 2 / expire) menggunakan key `id_dimCustomer`.  
   - Jika keduanya diubah menjadi `id_dimCustomer`: Update pada langkah 14 masih bisa bekerja asalkan `id_dimCustomer` tersedia dari lookup. Namun secara konsep, `customerNumber` adalah business key yang lebih tepat untuk mengidentifikasi customer, sedangkan `id_dimCustomer` adalah surrogate key untuk baris tertentu. Paket ETL masih dapat bekerja teknis, tetapi logika tidak tepat untuk Type 2 karena kita perlu expire baris lama berdasarkan `id_dimCustomer`, bukan memperbarui semua baris customer.

---

## 2.3 - SCD Type 3 – Add New Column (`dimProduct`, priorProductName)

### Prasyarat
Pada tabel `dimProduct` di database `dw_legendvehicle`, tambahkan kolom:
```sql
ALTER TABLE dimProduct ADD priorProductName VARCHAR(100) NULL;
```

### Modifikasi transformasi (`2.3_SCD3_DimProduct_AddNewColumn.ktr`)

Modifikasi transformasi SCD Type 1 sebelumnya:
1. Tambahkan **Select Values** kemudian rename `productName` menjadi `streamProductName` (hindari ambigu).
2. Update **Database Lookup**: tambahkan field `productName` dari tabel `DimProduct` (digunakan untuk mengupdate `priorProductName`).
3. Update **Table Output**: mapping kolom insert.
4. Update **Update**: `productName` diupdate berdasarkan `streamProductName` (dari OLTP); `priorProductName` diupdate berdasarkan `productName` sebelumnya (nilai lama dari lookup).

### Tugas 5 (SCD Type 3)

1. Save dan run, screenshot Step Metrics.
2. Lakukan perubahan `productName` di OLTP. Run ulang, screenshot Step Metrics. Periksa apakah `productName` dan `priorProductName` di `DimProduct` berhasil diupdate (productName = baru, priorProductName = lama).
3. **Tanpa melakukan perubahan data di OLTP, run kembali transformasi. Mengapa `priorProductName` tetap diupdate meskipun tidak ada perubahan?**  
   Karena step Update dieksekusi untuk setiap baris yang lewat tanpa memeriksa apakah nilai benar-benar berubah. Jadi `priorProductName` terus ditimpa oleh `productName` lama padahal tidak ada perubahan.
4. **Perbaikan:** Tambahkan step **Filter rows** sebelum Update. Konfigurasi filter hanya melewatkan baris jika `streamProductName` berbeda dengan `productName` (nilai lama). Screenshot konfigurasi step yang ditambahkan dan dimodifikasi.

---

## CATATAN PENTING UNTUK PRAKTIKUM

1. Buka setiap `.ktr` di **Spoon**, lalu lakukan **Edit → New → Database Connection** untuk membuat `conn_oltp_legendvehicle` dan `conn_dw_legendvehicle` sesuai kredensial MySQL laptop Anda.
2. Klik kanan connection → **Share** agar tersedia di transformasi lain.
3. Di setiap step database, klik tombol **Get fields** untuk membantu mapping otomatis, lalu sesuaikan nama kolom.
4. Simpan transformasi sebelum dijalankan (**Run**).
5. Screenshot semua **Step Metrics** pada **Execution Results** dan **Preview Data** sebagai bukti pelaksanaan tugas, lalu masukkan ke laporan praktikum.

Selamat mengerjakan praktikum BI!
