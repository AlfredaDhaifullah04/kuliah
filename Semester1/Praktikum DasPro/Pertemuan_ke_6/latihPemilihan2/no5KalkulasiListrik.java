package Pertemuan_ke_6.latihPemilihan2;

import java.util.Scanner;
public class no5KalkulasiListrik {
    public static void main(String[] args) {
        Scanner awok = new Scanner(System.in);
        int penggunaanLKwh = 0;
        int tarif = 0;
        int totbayar = 0;
        int denda = 0;

        System.out.println("berapa kwh dalam sebulan: ");
        penggunaanLKwh = awok.nextInt();

        if (penggunaanLKwh < 100) {
            tarif = 1000; //per Kwh
        } else if (penggunaanLKwh >=100 && penggunaanLKwh <=500) {
            tarif = 1200; //per Kwh
        } else if (penggunaanLKwh > 500 && penggunaanLKwh <= 1000) {
            tarif = 1500; // per Kwh
        } else if ( penggunaanLKwh > 1000) {
            tarif = 1500;
            denda = 100000;
        }
        
        totbayar = (penggunaanLKwh * tarif) + denda;
        System.out.println(penggunaanLKwh* tarif);
        System.out.println("Tota Kwh dalam sebulan: " + penggunaanLKwh);
        System.out.println("Total yang harus dibayar Rp: " + totbayar );
    }
}
