package Pertemuan_ke_7;

import java.util.Scanner;
public class siakadFor04 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        double nilai, totnilai = 0;
        double tertinggi = 100, terendah = 0;
        int lulus=0,tidakLulus=0;
        int i =1;

        for (;i <=10;) {
           System.out.print("masukan nilai mahasiswa ke-"+i+": "); 
           nilai = str.nextDouble();

           if (nilai > tertinggi) {
            tertinggi = nilai;
           } 
            if (nilai < terendah) {
            terendah = nilai;
           }
           totnilai = nilai+totnilai;

           if (nilai >= 60) {
            lulus++;
           } else {
            tidakLulus++;
           }
           i++;
        }
        System.out.println("Nilai teringgi mahasiswa: " + tertinggi);
        System.out.println("Nilai terendah mahasiswa: " + terendah);
        System.out.println("banyak mahasiswa lulus: " + lulus);
        System.out.println("banyak mahasiswa tidak lulus: " + tidakLulus);
        
    }
}
