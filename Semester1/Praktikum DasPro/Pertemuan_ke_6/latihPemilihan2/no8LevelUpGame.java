package Pertemuan_ke_6.latihPemilihan2;

import java.util.Scanner;
public class no8LevelUpGame {
    public static void main(String[] args) {
        Scanner wei = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        int poin = 0, level = 0;
        String item1 = "", item2 = "";

        System.out.println("berapa level anda saat ini: ");
        level = wei.nextInt();
        System.out.println("berapa poin yang anda miliki?: ");
        poin = wei.nextInt();

        if ( level == 1) {
            if ( poin > 1000) {
                System.out.println("anda dapat naik level");
            } else {
                System.out.println("anda tidak dapat naik level");
            }
        } else if (level == 2) {
            if (poin > 3000) {
                System.out.println("Apakah anda memiliki Health potion? (iya/tidak)");
                item1 = str.nextLine();
                if (item1.equalsIgnoreCase("iya")) {
                    System.out.println("anda dapat naik level");
                } else {
                    System.out.println("anda tidak dapat naik level");
                }
            } else {
                System.out.println("Poin anda tidak cukup, anda tidak dapat naik level");
            }
        } else if (level == 3) {
            if (poin > 5000) {
                System.out.println("Apakah anda memiliki Health potion? (ya/tidak)");
                item1 = str.nextLine();
                System.out.println("Apakah anda memiliki Mana potion juga? (ya/tidak)");
                item2 = str.nextLine();
                if (item1.equalsIgnoreCase("ya") && item2.equalsIgnoreCase("ya")) {
                    System.out.println("Anda dapat naik level");
                } else {
                    System.out.println("Anda tidak dapat naik level");
                }
            } else {
                System.out.println("poin anda tidak cukup, Anda tidak dapat naik level");
            }
        } else {
            System.out.println("Level anda tidak valid");
        }

        str.close(); wei.close();


    }
}
