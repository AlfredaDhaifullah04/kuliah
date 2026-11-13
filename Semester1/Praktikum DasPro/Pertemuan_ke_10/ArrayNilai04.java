package Pertemuan_ke_10;

import java.util.Scanner;
public class ArrayNilai04 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int [] nilaiAkhir = new int[10];

        for (int i =0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukan nilai ke-" + i+": ");
            nilaiAkhir[i] = str.nextInt();
        }

        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70 ) {
                System.out.println("mahasiswa ke-"+i+" Lulus!");
            } else {
                System.out.println("mahasiswa ke-"+i+" tidak lulus!");
            }

        }
        str.close();
    }
}
