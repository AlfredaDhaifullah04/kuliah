package Pertemuan_ke_7.taining;

import java.util.Scanner;
public class lulusWhile {
    public static void main(String[] args) {
        Scanner hei = new Scanner(System.in);
        int jumlahMhhs = 20;
        int lulus=0, tidakLulus=0;
        double nilai;
        int i = 1;

        while (i <= jumlahMhhs){
            System.out.println("Masukan nilai mahasiswa ke-"+i+":" );
            nilai = hei.nextDouble();

            if (nilai >= 65) {
                lulus++;
            } else if (nilai < 65 && nilai >0) {
                tidakLulus++;
            }

            i++;
            
        }
        System.out.println("Jumlah mahasiswa Lulus: " + lulus);
        System.out.println("jumlah mahasiswa tidak lulus: " + tidakLulus);
        hei.close();
    }
}
