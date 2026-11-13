package Pertemuan_ke_5;

import java.util.Scanner;
public class PemilihanAngka22 {
    public static void main(String[] args) {
        Scanner siuuu = new Scanner (System.in);
         
        double angka = 5.5;
        String hasil;

        hasil = (angka % 2 == 0 ) ? "Bilangan positif" : "Bilangan Negatif";
        System.out.println(angka + "adalah" + hasil);

        siuuu.close();
    }
}
