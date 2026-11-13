// File: Pemain.java
package kelompok_9;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Pemain {
    private String nama;
    private int uang;
    private int energi;
    // Sistem penyimpanan hasil panen
    private Map<String, Integer> inventori;
    private static final Map<String, Integer> HARGA_JUAL = Map.of(
        "🌾Padi", 5,  // Harga 1 Padi = 5
        "Jagung", 3   // Harga 1 Jagung = 3
    );

    public Pemain(String nama) {
        this.nama = nama;
        this.uang = 200;
        this.energi = 100;
        this.inventori = new HashMap<>();
    }

    public void aksiTanam(Tanaman t, Lahan l) {
        if (energi >= 10) {
            l.tanam(t);
            energi -= 10;
        } else {
            System.out.println("Energi tidak cukup untuk menanam!");
        }
    }

    public void aksiSiram(Lahan l) {
        if (energi >= 5) {
            l.siram();
            energi -= 5;
        } else {
            System.out.println("Energi tidak cukup untuk menyiram!");
        }
    }

    public void aksiPupuk(Lahan l) {
        if (energi >= 5) { // Asumsi pupuk butuh 5 energi
            l.pupuk(); // Panggil metode pupuk di Lahan
            energi -= 5;
        } else {
            System.out.println("Energi tidak cukup untuk memupuk!");
        }
    }
    
    // --- CONTOH OVERLOADING ---
    // Overloading 1: Memanen satu lahan spesifik
    public void aksiPanen(Lahan l) {
        if (energi >= 10) {
            HasilPanen hasil = l.panenTanaman();
            if (hasil != null) {
                tambahKeInventori(hasil);
                energi -= 10;
            }
        } else {
            System.out.println("Energi tidak cukup untuk memanen!");
        }
    }

    // Overloading 2: Memanen semua lahan yang ada di daftar
    public void aksiPanen(List<Lahan> daftarLahan) {
        System.out.println(nama + " mencoba memanen semua lahan...");
        for (Lahan l : daftarLahan) {
            // Memanggil metode overloading (1)
            aksiPanen(l); 
        }
    }
    // --- AKHIR OVERLOADING ---

    private void tambahKeInventori(HasilPanen hasil) {
        // getOrDefault digunakan untuk mengambil nilai lama, atau 0 jika belum ada
        int jumlahLama = inventori.getOrDefault(hasil.getNama(), 0);
        inventori.put(hasil.getNama(), jumlahLama + hasil.getJumlah());
    }

    public void aksiJualSemuaHasilPanen() {
        if (inventori.isEmpty()) {
            System.out.println(nama + " tidak memiliki hasil panen untuk dijual.");
            return;
        }

        int totalPendapatan = 0;
        
        System.out.println("\n📦 " + nama + " menjual hasil panen:");
        
        for (Map.Entry<String, Integer> entry : inventori.entrySet()) {
            String namaHasil = entry.getKey();
            int jumlah = entry.getValue();

            // Dapatkan harga jual dari map HARGA_JUAL. Jika tidak ditemukan, harganya 0.
            int hargaPerUnit = HARGA_JUAL.getOrDefault(namaHasil, 0);
            
            int nilaiJualItem = jumlah * hargaPerUnit;
            totalPendapatan += nilaiJualItem;

            System.out.println("  - Menjual " + jumlah + "x " + namaHasil + " | Harga $" + hargaPerUnit + " | Pendapatan: $" + nilaiJualItem);
        }
        
        // Perbarui status pemain
        this.uang += totalPendapatan;
        this.inventori.clear(); // Kosongkan inventori setelah semua terjual
        
        System.out.println("🎉 Penjualan berhasil! Total Uang bertambah: $" + totalPendapatan);
        System.out.println("   Uang sekarang: $" + this.uang);
    }

    public void tidur() {
        this.energi = 100; // Pulihkan energi
        System.out.println(nama + " tidur dan energi pulih.");
    }
    
    public void tampilkanStatus() {
        System.out.println("=== Status Pemain ===");
        System.out.println("👨‍🌾 Nama: " + nama);
        System.out.println("❤️  Energi: " + energi);
        System.out.println("💰 Uang: " + uang);
        System.out.println("🎒 Inventori: " + inventori);
        System.out.println("=====================");
    }
}