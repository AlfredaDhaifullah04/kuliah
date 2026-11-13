package Pertemuan_ke_13;

import java.util.Scanner;

import Pertemuan_ke_7.kafeDoWhile;
public class Percobaan6_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int p, l, t, L, vol;

        System.out.print("Masukan panjang: ");
        p = input.nextInt();
        System.out.print("Masukan lebar: ");
        l = input.nextInt();
        System.out.print("Masukan tinggi: ");
        t = input.nextInt();

        L = luasBalok(p, l);
        System.out.println("Luas persegi panjang adalah: " + L);

        vol = volumeBalok(p, l, t);
        System.out.println("Volume balok adalah: " + vol);
    }

    public static int luasBalok (int panjang, int lebar) {
        int luas = panjang * lebar;
        return luas;
    }
    public static int volumeBalok (int panjang, int lebar, int tinggi) {
        int volume = panjang * lebar * tinggi;
        return volume;
    }
}
