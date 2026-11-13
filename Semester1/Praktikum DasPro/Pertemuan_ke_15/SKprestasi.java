package Pertemuan_ke_15;

import java.util.Scanner;

public class SKprestasi {

    static int maxData = 100;
    static String [][] dataPrestasi = new String[maxData][5];
    // menggunakan tipe data String krn fleksibel dalam menampung data 
    static int jumlahData = 0;   // untuk menambhakan baris baru

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== PENCATATAN PRESTASI MAHASISWA ====");
        System.out.println("1. Tambah Data Prestasi");
        System.out.println("2. Tampilkan Semua Prestasi");
        System.out.println("3. Analisis Prestasi Berdasarkan Jenis");
        System.out.println("4. Keluar");

        do {    
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine();
    
            if (pilihan == 1) { 
                System.out.print("Masukan nama mahasiswa: ");
                String nama = sc.nextLine();
                System.out.print("Masukan Nim mahasiswa: ");
                String nim = sc.nextLine();
                System.out.print("Masukan urutan juara: ");
                String prestasi= sc.nextLine();
    
                String tingkat;
                do {
                    System.out.print("Masukan Tingkat Prestasi (Lokal/Nasional/Internasional): ");
                    tingkat= sc.nextLine();
                    if (tingkat.equalsIgnoreCase("lokal") || tingkat.equalsIgnoreCase("nasional") || tingkat.equalsIgnoreCase("internasional")) {
                        break;
                    } else {
                        System.out.println("tingkat tidak valid");
                    }
                    
                } while (true);

                String tahun;
                do {
                    System.out.print("Masukan Tahun Prestasi (2010 - 2024): ");
                    tahun = sc.nextLine();
                    int thnAngka = Integer.parseInt(tahun);
                    if (thnAngka >= 2010 && thnAngka <= 2024) {
                        break;
                    } else {
                        System.out.println("Tahun tidak valid");
                    }
                } while (true);
                // memanggil fungsi
                tambahData(nama, nim, prestasi, tingkat, tahun);
            } else if (pilihan == 2) {
                tampilkanData();
            } else if (pilihan == 3) {
                System.out.print("Masukkan Jenis Prestasi yang ingin dianalisis: ");
                    String jenisAnalisis = sc.nextLine();
                    analisisPrestasi(jenisAnalisis);
            } else if (pilihan == 4) {
                break;
            } else {
                System.out.println("Pilihan tidak valid");
            }
        } while (true);
    }

    // membuat fungsi untuk menginput data
    public static void tambahData (String nama, String nim, String prestasi, String tingkat, String tahun) {
        if (jumlahData < maxData ) {

            dataPrestasi[jumlahData][0] = nama;
            dataPrestasi[jumlahData][1] = nim;
            dataPrestasi[jumlahData][2] = prestasi;
            dataPrestasi[jumlahData][3] = tingkat;
            dataPrestasi[jumlahData][4] = tahun;
            jumlahData++;
            System.out.println("Data prestasi berhasil ditambahkan!");
        } else {
            System.out.println("Jumlah data telah maksimal!");
        }
    }

    // menampilkan data prestasi
    public static void tampilkanData() {
        if (jumlahData == 0 ) {
            System.out.println("Belum ada prestasi.");
        } else {
            System.out.println("===== DAFTAR PRESTASI MAASISWA =====");
            System.out.println("nama\t" + "Nim\t" + "juara\t" + "Tingkat\t" + "Tahun " );
            for (int i = 0; i < jumlahData; i++) {
                for (int k = 0; k < 5; k++) {
                    System.out.print(dataPrestasi[i][k] +" | ");
                }
                System.out.println();
            }
        }
    }

    // Analisis prestasi Berdasarkan jenis
    static void analisisPrestasi(String prestasi) {
        boolean ditemukan = false;
        System.out.println("== ANALISIS PRESTASI: " + prestasi + " ==");
        for (int i = 0; i < jumlahData; i++) {

            if (dataPrestasi[i][2].equalsIgnoreCase(prestasi)) {
                System.out.printf("Nama: %s | NIM: %s | Tahun: %s\n",
                        dataPrestasi[i][0], dataPrestasi[i][1], dataPrestasi[i][3]);
                ditemukan = true;
                
            }
        }

        if (ditemukan == false) {
            System.out.println("Tidak ada data dengan prestasi " + prestasi); 
        }
    }
}
