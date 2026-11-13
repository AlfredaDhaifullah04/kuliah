package Pertemuan_ke_15;

import java.util.Scanner;
public class cb1 {
    static int MAX_DATA = 100;
    static String[][] dataPrestasi = new String[MAX_DATA][4];
    static int jumlahData = 0;

    // Fungsi untuk menambahkan data prestasi
    public static void tambahData(String nama, String nim, String jenis, String tahun) {
        if (jumlahData < MAX_DATA) {
            dataPrestasi[jumlahData][0] = nama;
            dataPrestasi[jumlahData][1] = nim;
            dataPrestasi[jumlahData][2] = jenis;
            dataPrestasi[jumlahData][3] = tahun;
            jumlahData++;
            System.out.println("Data prestasi berhasil ditambahkan!");
        } else {
            System.out.println("Kapasitas data penuh!");
        }
    }

    // Fungsi untuk menampilkan semua data prestasi
    static void tampilkanData() {
        if (jumlahData == 0) {
            System.out.println("Belum ada data prestasi.");
        } else {
            System.out.println("== DAFTAR PRESTASI MAHASISWA ==");
            for (int i = 0; i < jumlahData; i++) {
                System.out.printf("Nama: %s | NIM: %s | Jenis: %s | Tahun: %s\n",
                        dataPrestasi[i][0], dataPrestasi[i][1], dataPrestasi[i][2], dataPrestasi[i][3]);
            }
        }
    }

    // Fungsi untuk menganalisis prestasi berdasarkan jenis
    static void analisisPrestasi(String jenis) {
        boolean ditemukan = false;
        System.out.println("== ANALISIS PRESTASI: " + jenis + " ==");
        for (int i = 0; i < jumlahData; i++) {
            if (dataPrestasi[i][2].equalsIgnoreCase(jenis)) {
                System.out.printf("Nama: %s | NIM: %s | Tahun: %s\n",
                        dataPrestasi[i][0], dataPrestasi[i][1], dataPrestasi[i][3]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada data prestasi dengan jenis " + jenis);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        do {
            System.out.println("==== PENCATATAN PRESTASI MAHASISWA ====");
            System.out.println("1. Tambah Data Prestasi");
            System.out.println("2. Tampilkan Semua Prestasi");
            System.out.println("3. Analisis Prestasi Berdasarkan Jenis");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine(); 

            switch (menu) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Jenis Prestasi (Lokal/Nasional/Internasional): ");
                    String jenis = sc.nextLine();
                    System.out.print("Masukkan Tahun Prestasi: ");
                    String tahun = sc.nextLine();
                    tambahData(nama, nim, jenis, tahun);
                    break;

                case 2:
                    tampilkanData();
                    break;

                case 3:
                    System.out.print("Masukkan Jenis Prestasi yang ingin dianalisis: ");
                    String jenisAnalisis = sc.nextLine();
                    analisisPrestasi(jenisAnalisis);
                    break;

                case 4:
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    break;

                default:
                    System.out.println("Menu tidak valid! Silakan pilih lagi.");
            }
        } while (menu != 4);

        sc.close();
    }
}

