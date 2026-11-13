package Pertemuan_ke_8.tugas_latihanUTS;

import java.util.Scanner;
public class nomor01 {
    public static void main(String[] args) {
        Scanner hei = new Scanner(System.in);
        int n =0;
        int i =0 ; // i menjadi pencacahan
        
        System.out.print("nilai n : " );
        n = hei.nextInt();

        for (;n > i ; n --) {

            if (n % 3 == 1) {
                System.out.println("Stop");
                continue;
            } else {

            }
            System.out.println(n);
            
        }

        System.out.println("selesai");
    }
}
