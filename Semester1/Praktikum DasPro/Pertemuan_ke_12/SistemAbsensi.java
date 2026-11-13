package Pertemuan_ke_12;

import java.util.Scanner;
public class SistemAbsensi {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);

        String [] namaHari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        // menentukan jumlah seluruh siswa dalam satu kelas
        System.out.print("Masukan jumlah siswa dalam satu kelas: ");
        int jumlahSiswa = str.nextInt();
        // Deklarasi array ehadiran siswa
        String []namaSiswa = new String[jumlahSiswa];
        
        // melakukan list daftar nama siswa
        System.out.println("Memasukan daftar nama siswa: ");
        str.nextLine();
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Nama siswa ke-" + (i+1)+ ": ");
            namaSiswa[i]= str.nextLine();
        }
        // melakukan absensi dalam seminggu
        System.out.println("isi status kehadiran dengan kata 'HADIR'atau'ABSEN'");
        // mengakumulasi kehadiran siswa 
        int akumulasi[] = new int[jumlahSiswa];
        // Deklarasi status kehadiran siswa
        String status[][] = new String[jumlahSiswa][namaHari.length]; 
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("-------siswa atas nama " + namaSiswa[i]+"-----------");
            int j = 0;
            for (int k = 0; k < namaHari.length; k++) {
                System.out.print(namaHari[k] + " Status kehadiran\t: ");
                status[i][k] = str.nextLine();
                if (status[i][k].equalsIgnoreCase("absen")) {
                    j = j + 1;
                }
            }
            akumulasi [i] = j ;
        }

        System.out.println("pilah menu yang dapat anda pilih: ");
        System.out.println("1. menampilkan data siswa dalam seminggu");
        System.out.println("2. meliihat akumulasi absensi siswa dalam seminggu");
        
        do {
            System.out.print("Pilihan anda: ");
            int menu = str.nextInt();
            str.nextLine();
            
            if (menu == 1) {
                System.out.println("Data kehadiran tiap siswa");
                // menampilkan nama hari dalam satu minggu
                System.out.print("\t");
                for (int i = 0; i < namaHari.length; i++) {
                    System.out.print(namaHari[i] + "\t");
                }
                System.out.println();

                for (int i = 0; i < status.length; i++) {
                    System.out.print(namaSiswa[i] + "\t:");
                    for (int k = 0; k < status[i].length; k++) {
                        System.out.print(status[i][k]+ "\t");
                    }
                    System.out.println();
                }
            } else if (menu == 2) {
                System.out.println("Akumulasi ketidakgadiran / absen siswa dalam satu minggu ");
                for (int i = 0; i < namaSiswa.length; i++) {
                    System.out.println(namaSiswa[i] + "\t: absen sebanyak " + akumulasi[i] + " dalam seminggu" );
                }
                System.out.println("=======================================");
                for (int i = 0; i < namaSiswa.length; i++) {
                    if (akumulasi[i] > 3) {
                        System.out.println(namaSiswa[i] + " Tidak hadir lebih dari 3 hari");
                    }
                }
            } else if (menu == 3) {
                break;
            }
        } while (true);

    }
}
