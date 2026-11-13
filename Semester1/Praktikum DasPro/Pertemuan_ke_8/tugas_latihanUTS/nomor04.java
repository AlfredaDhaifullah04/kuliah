package Pertemuan_ke_8.tugas_latihanUTS;

import java.util.Scanner;
public class nomor04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  i = 4 ; //  pencacah
        int n = 0 ;  
        int baris= 1; // nilai output tetap
        int z= 4; // nilai output pola bilangan yang terus bertambah

        System.out.println("masukan nilai n: ");
        n = sc.nextInt();

        for (;i < n;) {
            System.out.print(" " + baris + " " + z);
            i= i + 8; // pada putaran pertaman bernilai 12
            z = z + i; // pada putaran pertama bernilai 12
           
        }
    }
}
