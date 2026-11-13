package Pertemuan_ke_8.tugas_latihanUTS;

import java.util.Scanner;
public class nomor05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;  // nilai pencacah penambah
        int z = 3;  // pola bilangan yang terus bertambah
        int baris = 0;      
        int n = 13; // nilai inputan
     

        // System.out.println("berapa nilai n: " ); 
        // n= sc.nextInt();

        for (;i <= n;) {
            System.out.println("baris ke-" + i +" pola bilangan: " + z);
            z = z+i;
            i= i+2; // = 3

            
            baris++; 
        }
    }
}
