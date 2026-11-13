package Pertemuan_ke_6;

import java.util.Scanner;
public class pemilihan2Percobaan2 {
    public static void main(String[] args) {
        Scanner ax = new Scanner (System.in);
        Scanner as = new Scanner(System.in);
        int pilihanMenu;
        String member = "";
        double diskon;
        double harga;
        double totalBayar;
        String qris;

        System.out.println("-------------------------");
        System.out.println("======MENU KAFE JTI======");
        System.out.println("-------------------------");
        System.out.println("1. RiceBowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Pakeet Bunding (RiceBowl + Ice Tea)");
        System.out.println("--------------------------------------");
        System.out.println();
        System.out.print("masukan angka dari menu yang dipilih:");
        pilihanMenu = ax.nextInt();
        System.out.print("Apakah punya member? (y/n): ");
        member = as.nextLine();
        System.out.println("Apakah metode pembayaran menggunakan Qris? (iya/tidak) ");
        qris = as.nextLine();
        System.out.println("---------------------------------------");
        
        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("mendapatkan diskokn 10%");
            if (pilihanMenu == 1){
                harga = 14000;
                System.out.println("Harga Ricebowl: " + harga);
            } else if (pilihanMenu == 2) {
                harga = 3000;
                System.out.println("harga Ice Tea: " +harga);
            } else if (pilihanMenu == 3) {
                harga = 15000;
                System.out.println("Harga bundling: " + harga);
            } else {
                System.out.println("Masukan pilihan menu dengan benar");
                return; //menghentikan eksekusi lebih lanjut jika pilihan salah
                
            } 
                if (qris.equalsIgnoreCase("iya")) {
                     totalBayar = (harga - (harga * diskon)) - 1000;
                System.out.println("Total bayar setelah diskon: " + totalBayar);
                } else {
                  totalBayar = harga - (harga * diskon);
                  System.out.println("Total bayar setelah diskon: " + totalBayar);
                }

            
        } else if (member.equalsIgnoreCase("n")) {
            if (pilihanMenu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl: " + harga);
            } else if (pilihanMenu == 2) {
                harga = 3000;
                System.out.println("harga Ice Tea: " + harga);
            } else if (pilihanMenu == 3) {
                harga = 15000;
                System.out.println("harga bundling " + harga);
            } else {
                System.out.println("Masukan pilihan menu dengan benar");
                return; // menghentikan eksekusi ebih lanjut bila pilihan salah
            }  
                if (qris.equalsIgnoreCase("iya")) {
                   System.out.println("Total bayar: " + (harga - 1000));
                } else {
                    System.out.println("total bayar: " + harga);
                }
        } else {
            System.out.println("member tidak valid");
        }
            System.out.println("-------------------------------------");


    }
}
