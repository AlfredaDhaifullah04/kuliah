package Pertemuan_ke_6.latihPemilihan2;

import java.util.Scanner;
public class no2KategoriUmr {
    public static void main ( String []args) {
        Scanner hawik = new Scanner (System.in);
        int umur = 0;

        System.out.println("masukan umur pengunjung: "); 
        umur = hawik.nextInt();

        if (umur < 3) {
            System.out.println("tiket gratis");
        } else if (umur >=3 && umur <=12) {
            System.out.println("Tiket anak");
        } else if (umur >= 13 && umur <= 59) {
            System.out.println("Tiket dewasa");
        } else if (umur > 60) {
            System.out.println("Tiket lansia");
        }
    }
}
