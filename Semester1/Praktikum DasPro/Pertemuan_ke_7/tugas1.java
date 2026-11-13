package Pertemuan_ke_7;

import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        Scanner nstr = new Scanner(System.in);
        String respon="";
        double totalBayar=0;
        double hargaSatuanT = 50000, omset=0;
        double tiketTerjual =0, tiketDibeli = 0;
        double diskon=0;  

        do {
            System.out.println("berapa tiket yang akan anda beli: ");
            tiketDibeli = nstr.nextInt();

            if (tiketDibeli <= 0) {
                System.out.println("inputan tidak valid, harap masukan ulang");
                continue;
            }

            if (tiketDibeli > 4 && tiketDibeli <= 10) {
                diskon = 0.10;
            } else if (tiketDibeli > 10) {
                diskon = 0.15;
            }
            totalBayar =(tiketDibeli* hargaSatuanT) - ((tiketDibeli*hargaSatuanT)*diskon);
            tiketTerjual= tiketTerjual + tiketDibeli;
            omset = omset+totalBayar;
            
            System.out.println("--------------------------------");
            System.out.println("diskon didapat: " + diskon);
            System.out.println("potongan harga didapat: " + (int) ((tiketDibeli*hargaSatuanT)*diskon));
            System.out.println("harga sebelum diskon: " +(int) (tiketDibeli*hargaSatuanT));
            System.out.println("Harga yang harus dibayar: " + (int) totalBayar);
            System.out.println("--------------------------------------");

            System.out.println("Apakah ada transaksi lagi? (ya/tidak)");
            respon= str.nextLine();
        } while (respon.equalsIgnoreCase("ya"));

        System.out.println("total tiket terjual: " + tiketTerjual);
        System.out.println("Omset dalam sehari: " + omset + "(harga dengan diskon)");
    }
}
