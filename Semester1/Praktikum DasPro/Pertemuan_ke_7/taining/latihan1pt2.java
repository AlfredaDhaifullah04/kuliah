package Pertemuan_ke_7.taining;

import java.util.Scanner;
public class latihan1pt2 {
    public static void main(String[] args) {
        Scanner hei = new Scanner(System.in);
        int totaBelSeminggu = 0;
        int durasuSehari = 0;
        int i=1;

        while (i <= 7) {
            System.out.println("Berapap durasi anda belajar dalam hari ke-: " + i);
            durasuSehari = hei.nextInt();
            
            if (durasuSehari > 10) {
                System.out.println("Mustahil!!, masukan ulang durasi anda belajar!");
                continue;
            } else {
             
            }
            i++;
            totaBelSeminggu += durasuSehari;
        }

        System.out.println("Total durasi belajar dalam seminggu adalah"+ totaBelSeminggu);
    }
}
