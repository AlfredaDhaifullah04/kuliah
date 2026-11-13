package Pertemuan_ke_10.teori;

import java.util.Scanner;
public class latihan4 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);

        int nilai[] = new int [10];
        int total =0;

        for (int i =0; i < nilai.length; i++) {
            System.out.print("masukan nilai ke-" + (i+1)+": ");
            nilai[i] = str.nextInt();
            total += nilai[i];
        }

        double rata = total/nilai.length;
        System.out.println("Rata: " + rata);
    }
}
