package Pertemuan_ke_6;

import java.util.Scanner;
public class pemilihan2Percobaan104 {
    public static void main(String[] args) {
        Scanner alpred =new Scanner (System.in);
        double tahun;

        System.out.println("masukan tahun: ");
        tahun = alpred.nextDouble();

        if ((tahun % 4 ) == 0 ) {
            if ((tahun % 100) != 0)
                System.out.println("tahun kabisat");
            else {
                if ((tahun % 400) == 0 ) {
                    System.out.println("tahun KabisaT");
                } else {
                    System.out.println("bukan TAHUN kabisat");
                }
            } 
        } else 
         System.out.println("bukan tahun kabisat");
    }
}
