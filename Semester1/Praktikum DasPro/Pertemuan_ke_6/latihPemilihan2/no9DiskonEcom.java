package Pertemuan_ke_6.latihPemilihan2;

import java.util.Scanner;
public class no9DiskonEcom {
    public static void main(String[] args) {
        Scanner nstr = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        String mtdbyr = "";
        double totbel = 0;
        double diskon = 0;
        double ongkir = 0;
        
        System.out.println("Metode pembayaran apa yang ingin anda pilih: ");
        System.out.println("1. Kartu kredit");
        System.out.println("2. Transfer bank");
        System.out.println("3. COD");
        mtdbyr = str.nextLine();
        System.out.println("masukan total belanjaan anda: ");
        totbel = nstr.nextDouble();

        if (mtdbyr.equalsIgnoreCase("kartu kredit")) {
            if (totbel > 1000000) {
                diskon = 0.10;
                ongkir = 0;
            } else if (totbel < 500000){
                diskon = 0;
                ongkir = 50000;
            } else {
                System.out.println("Tidak ada diskon yang anda dapatkan");
            }
        } else if (mtdbyr.equalsIgnoreCase("transfer bank")) {
            if (totbel > 500000) {
                diskon = 0.05;
                ongkir = 20000;
            } else if (totbel < 500000) {
                diskon = 0;
                ongkir = 50000;
            } else {
                System.out.println("Tidak ada diskon yang didapatkan");
            }
        } else if (mtdbyr.equalsIgnoreCase("COD")) {
            if (totbel < 500000) {
                diskon = 0;
                ongkir = 50000;
            } else {
                diskon = 0;
                ongkir = 30000;
            }
        } else {
            System.out.println("Metode pembayaran tidak tersedia");
        }

        double totpem = totbel - (totbel * diskon) + ongkir;
        
        System.out.println("--------------------------------------------");
        System.out.println("Nominal yang harus anda bayar Rp: " + totpem);
        System.out.println("diskon yang anda dapat :" +diskon+ "%"+ " dengan nominal: "+ (totbel*diskon));
        System.out.println("ongkir yang harus dibayar: " + ongkir) ;

    }
}
