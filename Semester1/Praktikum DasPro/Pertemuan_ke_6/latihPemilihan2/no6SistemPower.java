package Pertemuan_ke_6.latihPemilihan2;

import java.util.Scanner;
public class no6SistemPower {
    public static void main(String[] args) {
        Scanner wei = new Scanner (System.in);
        int serangan = 0;
        int pertahanan = 0;
        int kecepatan = 0;
        String peringkat = "";

        System.out.println("berapa elemen kekuatan serangan karakter anda: "); 
        serangan = wei.nextInt();
        System.out.println("Berapa elemen kekuatan pertahanan karakter anda: ");
        pertahanan = wei.nextInt();
        System.out.println("berapa elemen kekuatan kecepatan karakter anda: ");
        kecepatan = wei.nextInt();

        if (serangan > 70 && pertahanan > 50) {
            peringkat = "tank";
        } else if (kecepatan > 80 && serangan > 50) {
            peringkat = "Assasin";
        } else if (pertahanan > 70 && kecepatan > 40) {
            peringkat = "Guardian";
        } else if (serangan > 50 && pertahanan > 40 && kecepatan > 50) {
            peringkat = "warrior";
        }

        System.out.println("Title yang didapatkan hero anda: " + peringkat);
    }
}
