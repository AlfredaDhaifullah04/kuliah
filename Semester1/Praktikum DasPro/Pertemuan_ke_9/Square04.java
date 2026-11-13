package Pertemuan_ke_9;

import java.util.Scanner;
public class Square04 {
    public static void main(String[] args) {
        Scanner nstr = new Scanner(System.in);

        System.out.print("MAsukan nilai n: ");
        int n = nstr.nextInt();

        for (int iOuter =1; iOuter <= n; iOuter++) {

            for (int i = 0; i <= n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        nstr.close();
    }
}
