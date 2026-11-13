package Pertemuan_ke_7.taining;

import java.util.Scanner;
public class latihan1 {
    public static void main(String[] args) {
        Scanner siuu = new Scanner(System.in);
        int seminggu = 7;
        int totbelajar = 0;
        int durasiSehari = 0, i =1;

        do {
            System.out.print("berapa lama anda belajar di hari ke- " + i +": ");
            durasiSehari = siuu.nextInt();
            if (durasiSehari > 10) {
                System.out.println("mustahil!!, masukan ulang durasi belajar");
                continue;
            } else {
               
            }
            i++;
            totbelajar += durasiSehari;
        } while (i <= seminggu);

        System.out.println("total belajar selama satu minggu adalah: " + totbelajar);
    }
}
