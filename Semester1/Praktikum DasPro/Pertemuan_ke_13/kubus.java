package Pertemuan_ke_13;

import java.util.Scanner;
public class kubus {
    public static int volumeKubus (int p ) {
        int volume = p * p * p;
        return volume;
    }

    public static int luasPermukaanKubus (int s) {
        int luas = 6 *s*s;
        return luas;
    }

    public static void main(String[] args) {
        Scanner str = new Scanner (System.in);
        System.out.println("Masukan panjang sisi: ");
        int sisi = str.nextInt();

        int volumKBS = volumeKubus(sisi);
        System.out.println("Volume kubus adalah: " + volumKBS);
        int luasBLK = luasPermukaanKubus(sisi);
        System.out.println("Luas permukaan kubus adalah: " + luasBLK);
    }
}
