package Pertemuan_ke_9;

import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        Scanner nstr = new Scanner(System.in);

        System.out.print("masukan nilai n:");
        int n = nstr.nextInt();

        int i = 0;
        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
