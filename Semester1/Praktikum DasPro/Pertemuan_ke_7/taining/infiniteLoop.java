package Pertemuan_ke_7.taining;

import java.util.Scanner;
public class infiniteLoop {
    public static void main(String[] args) {
        int n=1;

        while (n >= 0 && n <=20000) { // kondisi didalam while merupakan sentinel
            System.out.println(n);
            n++;

        }
        System.out.println("Transaksi selelsai");
    }
}
