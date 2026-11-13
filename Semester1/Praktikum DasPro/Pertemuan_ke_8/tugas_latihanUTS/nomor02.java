package Pertemuan_ke_8.tugas_latihanUTS;

import java.util.Scanner;
public class nomor02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i =1, kali = 1;
        int n = 0; //inpiut Scanner

        System.out.print("masukan nilia n: "); 
        n = sc.nextInt();

        for (;i <= n;) {
            System.out.println(i + "*");
            i++;
        }
        
    }
}
