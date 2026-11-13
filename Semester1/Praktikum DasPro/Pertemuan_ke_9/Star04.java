package Pertemuan_ke_9;

import java.util.Scanner;
public class Star04 {
    public static void main(String[] args) {
        Scanner nstr = new Scanner(System.in);
        System.out.print("masukan nilai N: ");
        int n = nstr.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.print("*");
        }
        nstr.close();
    }
}
