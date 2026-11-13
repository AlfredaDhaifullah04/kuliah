package Pertemuan_ke_7.taining;

import java.util.Scanner;
public class kafeDoWhTeori {
    public static void main(String[] args) {
        Scanner aw = new Scanner(System.in);
        int totalpenjualan = 0, i = 1, harga;

       do {
        System.out.println("masukan harga minuman: ");
        harga = aw.nextInt();
        totalpenjualan += harga;
        i++;

       } while (harga != 0); // (!= tidak sama dengan) jika dua nilai yang didandingkan tidak sama, maka hasilnya true

       System.out.println("total penjualan: " + totalpenjualan);
    }
}
