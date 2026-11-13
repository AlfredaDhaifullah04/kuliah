package Pertemuan_ke_6;

import java.util.Scanner;
public class pemilihan2percobaan3 {
    public static void main(String[] args) {
        Scanner alpred2 = new Scanner (System.in);
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        System.out.println("Masukan kategori: ");
        kategori = alpred2.nextLine();
        System.out.println("Masukan besarnya penghasilan: ");
        penghasilan = alpred2.nextInt();

        if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 2000000) 
                pajak = 0.1;
            else if (penghasilan <= 3000000)
                pajak = 0.15;
            else 
                pajak = 0.2;
            gajiBersih = (int) (penghasilan - (pajak*penghasilan));
            System.out.println("pajak: " + (pajak*penghasilan) );
            System.out.println("Penghasilan bersih: " + gajiBersih);

        } else if (kategori.equals("pebisnis")) {
            if (penghasilan <= 2500000)
                pajak = 0.15;
            else if (penghasilan <= 3500000)
                pajak = 0.2;
            else 
                pajak = 0.25;
            gajiBersih = (int) (penghasilan - (pajak*penghasilan));
           
            System.out.println("Penghasilan Bersih: " + gajiBersih);
        } else 
            System.out.println("Masukan kategori salah");



    }
}
