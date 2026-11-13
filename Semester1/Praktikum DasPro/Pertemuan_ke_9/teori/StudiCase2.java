package Pertemuan_ke_9.teori;

import java.util.Scanner;
public class StudiCase2 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);

         
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for ( int i = 10; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
