package Pertemuan_ke_7.taining;

import java.util.Scanner;
public class latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bonus=0;
        int jamkerja;
        int gajiHarian;
        int gajiBulanan=0;
        double totGajiHari = 0;
        int i = 1;

        System.out.println("berapa gaji harian anda?: ");
        gajiHarian = sc.nextInt();

        do {
            System.out.print("Berapa lama anda bekerja dalam sehari? (ketik '0' utk keluar)");
            jamkerja = sc.nextInt();
            if (jamkerja > 8) {
                bonus = 0.2;
            }

            if (jamkerja <0) {
                System.out.println("masukan ulang jam kerja anda");
                continue;
            }
            totGajiHari = gajiHarian+ (gajiHarian*bonus);
            gajiBulanan =  gajiBulanan + (int) totGajiHari;
            System.out.println("total gaji didapat hari ke: "+ i+ " adalah: " + totGajiHari);
            i++;

        } while (jamkerja != 0);

        System.out.println("bonus didapat: " + (gajiHarian*bonus));
        System.out.println("total gaji selama satu bulan: " + gajiBulanan);
    }
}
