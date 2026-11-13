package Pertemuan_ke_8.tugas_latihanUTS;

import java.util.Scanner;
public class nomor03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1; //  pencacah penambah bilangan output
        int plus = 0;  // bilangan output
        int n = 0;
        int baris = 1;

        System.out.println("masukan nilai n : " );
        n = sc.nextInt();

        for (;i <= n;) { // i = 1
            plus =plus+i;
            System.out.println( "nilai i / nilai tambah: "+i+" nilai plus: "+plus+" nilai baris: " + baris);

            i= i +2;
            baris++;
        }
    }
}
