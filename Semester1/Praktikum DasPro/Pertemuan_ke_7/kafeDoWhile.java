package Pertemuan_ke_7;

import java.util.Scanner;
public class kafeDoWhile {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        Scanner nstr = new Scanner (System.in);
        int kopi ;
        int teh ;
        int roti ;
        String namaPelan;
        double hargaroti = 20000, hargateh = 7000, hargakopi = 12000;
        double totalbayar;
        
        do {
            System.out.print("Masukan nama pelanggan: (ketik 'batal' untuk keluar)");
            namaPelan = nstr.nextLine();
            if (namaPelan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan");
                break;
            }
            System.out.print("jumlah kopi: ");
            kopi = str.nextInt();
            System.out.print("jumlah teh: ");
            teh = str.nextInt();
            System.out.print("jumlah roti: ");
            roti = str.nextInt();

            totalbayar= (kopi*hargakopi)+ (teh*hargateh)+ (hargaroti* roti);
            System.out.println("Total yang harus dibayar: Rp " + totalbayar);
            str.nextLine(); // berfungsi spy input String setelah int dapat dilakkukan  
                            // dapat juga membuat 2 Scanner untuk tipe data String dan non String 
        } while (true); //kondisi
        System.out.println("semua transaksi selesai. ");
    }
}
