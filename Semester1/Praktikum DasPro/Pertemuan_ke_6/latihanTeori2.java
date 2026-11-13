package Pertemuan_ke_6;

import java.util.Scanner;
public class latihanTeori2 {
    public static void main(String[] args) {
      Scanner str = new Scanner(System.in);
      Scanner nstr = new Scanner (System.in);
      int jumlah;
      String jenis, hari;
      double diskon = 0;

      System.out.println("Hari membeli buku: ");
      hari = str.nextLine();
      System.out.println("Jenis buku apa yang anda beli ? ");
      jenis = str.nextLine();
      System.out.println("berapa jumlah buku yang anda beli ? ");
      jumlah = nstr.nextInt();

      if (hari.equalsIgnoreCase("rabu")) {
        if (jenis.equalsIgnoreCase("kamus")) {
            diskon = 0.10;
            if (jumlah > 2) {
                diskon = 0.10 + 0.02;
            }
        } else if( jenis.equalsIgnoreCase("novel")) {
            diskon = 0.07;
            if (jumlah > 3) {
                diskon = 0.07 + 0.02;
            } else if (jumlah <= 3) {
                diskon = 0.07 + 0.01;
            }
        } else if (jumlah > 3) {
            diskon = 0.05;
        } else {
            diskon = 0;
        }

      } else {
        diskon = 0;
      }

      System.out.println("-------------------------------------------");
      System.out.println("hari membeli buku: " + hari);
      System.out.println("Jenis buku yang dibeli: " + jenis);
      System.out.println("jumla buku yang dibeli: " + jumlah);
      System.out.println("Diskon yang diperoleh: " + (diskon * 100) + "%");
      System.out.println("--------------------------------------------");

    }
}
