package Pertemuan_ke_9;

import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
        Scanner nstr = new Scanner(System.in);

        System.out.print("masukan nilai n: ");
        int n = nstr.nextInt();

        for (int i = 1; i <= n; i++) {   // 'i' sebagai baris
            for (int j =1 ; j <= n; j++) {   // 'j' sebagai jumlah output dalam 1 baris
               if (i == 1 || i == n || j == 1 || j == n) {
                System.out.print(" "+n);
               } else {
                System.out.print("  ");
               }
            }
            System.out.println();
        }
    }
}
