package Pertemuan_ke_6;

import java.util.Scanner;
public class latihanTeori3pt2 {
    public static void main(String[] args) {
       Scanner str = new Scanner(System.in);
       Scanner nstr = new Scanner(System.in);
       String merk = "";
       String kategori = "";
       int size = 0;
       int harga = 0;

       System.out.println("masukan merk sepatu yang anda inginkan: ");
       merk = str.nextLine();
       System.out.println("masukan kategori: ");
       kategori = str.nextLine();
       System.out.println("masukan size yang akan anda beli: ");
       size = nstr.nextInt();

       if ( merk.equalsIgnoreCase("converse")) {
         if (kategori.equalsIgnoreCase("slip on")) {
            switch (size) {
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                    harga = 800000;
                    break;
                default: System.out.println("size yang dipilih tidak tersedia");
                    break;
            }
          } else if (kategori.equalsIgnoreCase("High top")) {
            switch (size) {
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                    harga = 1200000;
                    break;
                default: System.out.println("size yang dipilih tidak tersedia");
                    break;
            }
          } else {
            System.out.println("Kategori yang dipilih tidak tersedia");
          }
        } else if (merk.equalsIgnoreCase("Sketcher")) {
            if (kategori.equalsIgnoreCase("woman")) {
                switch (size) {
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                        harga = 1000000; 
                        break;
                    default: System.out.println("size yang dipilih tidak tersedia");
                        break;
                }
            } else if (kategori.equalsIgnoreCase("Man")) {
                switch (size) {
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                        harga = 1800000;
                        break;
                    default: System.out.println("size yang dipilih tidak tersedia");
                        break;
                }
            } else {
                System.out.println("Kategori yang dipilih tidak tersedia");
            }
        } else if (merk.equalsIgnoreCase("Nike")) {
            if (kategori.equalsIgnoreCase("Kids")) {
                switch (size) {
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                        harga = 750000;
                        break;
                    default: System.out.println("size yang dipilih tidak tersedia");
                        break;
                }
            } else if (kategori.equalsIgnoreCase("Adult")) {
                switch (size) {
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                        harga = 1500000;
                        break;
                    default: System.out.println("size yang dipilih tidak tersedia");
                        break;
                }
            } else {
                System.out.println("Kategori yang dipilih tidak tersedia");
            }
        } else {
            System.out.println("Merk yang dipilih tidak tersedia");
        }

        System.out.println("----------------------------------------");
       System.out.println("size yang dipilih: " + size);
       System.out.println("kategori yang dipilih: " + kategori);
       System.out.println("harga yang harus dibayar adalah: " + harga);
       System.out.println("-----------------------------------------");
    } 
}
