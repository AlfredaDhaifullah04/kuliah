package Pertemuan_ke_5;

import java.util.Scanner;
public class PemilihanBilangan {
    public static void main(String[] args) {
        Scanner ahay = new Scanner(System.in);
        
        System.out.print("masukan angka: ");
        int angka = ahay.nextInt();

        if (angka % 2 == 0) {
            System.out.println("angka " + angka + " temasuk bilangan genap");
        } else {
            System.out.println("angka " + angka + " termasuk bilangan ganjil");
        }
    }
}