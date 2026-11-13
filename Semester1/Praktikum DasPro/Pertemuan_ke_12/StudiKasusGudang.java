package Pertemuan_ke_12;

import java.util.Scanner;
public class StudiKasusGudang {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int jumlahJenis, jumlahLokasi, tambahanStok,menu;
        int indexJenis, indexLokasi;
        // Deklarasi variable

        System.out.print("Masukan jumlahh jenis barang: ");
        jumlahJenis = str.nextInt();
        System.out.print("Masukan jumlah lokasi penyimpanan: ");
        jumlahLokasi = str.nextInt();
        str.nextLine();
        // Deklarasi array untuk nama jenis barang
        System.out.println("Masukan nama jenis barang: ");
        String [] namaBarang = new String[jumlahJenis];

        for (int i = 0; i < jumlahJenis; i++) {
            System.out.print("Masukan nama barang ke-" +(i+1)+": " );
            namaBarang[i] = str.nextLine();
        }
        //Deklarasi array sekaligus memberi nama tempat lokasi setiap gudang  
        System.out.println("Masukan nama kota untuk setiap lokasi: ");
        String namaKota [] = new String[jumlahLokasi];
        
        for (int i =0; i < jumlahLokasi; i++) {
            System.out.print("Nama kota untuk lokasi "+ (i+1) +": ");
            namaKota[i] = str.nextLine();
        } 
        // Deklarasi array stok barang
        int stokBarang[][] = new int[jumlahJenis][jumlahLokasi];

        System.out.println("pilihan menu untuk dilakukan");
        System.out.println("1. restok barang");
        System.out.println("2. Informasi gudang");
        System.out.println("3. exit");

        do {
            // pilihan menu 
            System.out.print("pilian anda: ");
            menu = str.nextInt();
    
            if (menu == 1) {
                System.out.println("mengisi stok barang...");
                do {
                    System.out.print("jenis barang (0-"+(jumlahJenis-1)+"): ");
                    indexJenis = str.nextInt();
                    System.out.print("Lokasi (0-"+(jumlahLokasi-1)+"):  " );
                    indexLokasi = str.nextInt();

                    if (indexJenis > (jumlahJenis-1) || indexJenis < 0 || indexLokasi > (jumlahLokasi-1) || indexLokasi < 0) {
                        System.out.println("melebihi index yang ada");
                        continue;
                    }
                    System.out.print("berapa stok ditambah: ");
                    tambahanStok = str.nextInt();

                    // terus menambahkan total stok barang pada index tertentu
                    stokBarang[indexJenis][indexLokasi] += tambahanStok;  

                    System.out.print("Apakah masih mau restok? (yes/no) ");
                    str.nextLine();
                    String respon = str.nextLine();
                    if (respon.equalsIgnoreCase("no")) {
                        break;
                    }
                    
                } while (true);
    
            } else if (menu == 2) {
                // menampilkan TABEL total stok gudang
                System.out.println("Tabel Stok Gudang: ");
                System.out.print("\t");
                                 // menampilkan nama kota dalam sebaris
                for (int i = 0; i < namaKota.length; i++) {
                    System.out.print("\t"+namaKota[i]+" ");
                }
                System.out.println();
                // menampilkan nama barang 
                for (int i =0; i < stokBarang.length; i++) {
                    System.out.print(namaBarang[i] + "\t: ");
                    // menampilkan jumlah barang pada setiap lokasi
                    for (int k = 0; k < stokBarang[i].length; k++) {
                        System.out.print(stokBarang[i][k]+"\t\t");
                    }
                    System.out.println();
                }
                
                // menampilkan total stok pada setiap gudang
                System.out.println("Total stok untuk setiap gudang");
                for (int i =0; i < jumlahJenis; i++) {
                    // Deklarasi variable total barang sekaligus reset disetiap loop
                    int totalBarang = 0;
                    for (int k = 0; k < stokBarang[i].length; k++) {
                        // terus menambahkan total stok barang
                        totalBarang += stokBarang[i][k];
                    }
                    System.out.println(namaBarang[i]+"\t: " + totalBarang);
                }

                System.out.println("Lokasi dengan stok terbanyak untuk setiap jenis barang: ");
            
                for (int i = 0; i < stokBarang.length; i++) {
                    int indexmax = 0 ;
                    // mencari lokasi stok terbanyak
                    System.out.print(namaBarang[i] + "\t berada di: ");
                    for (int k = 0; k < stokBarang[i].length; k++) {
                        if (stokBarang[i][k] > stokBarang[i][indexmax]) {
                            indexmax = k;
                        }
                        
                    }
                    System.out.print(namaKota[indexmax]);
                    System.out.println();
                }
                
            } else if (menu == 3) {
                break;
            }

        } while (true); 
        


    }
}
