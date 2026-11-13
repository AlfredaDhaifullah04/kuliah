package Pertemuan_ke_6;

import java.util.Scanner;
public class latihanTeori3 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        Scanner nstr = new Scanner (System.in);
        String merk = "";
        int harga = 0;
        String kategori = "";
        int size = 0;
        
        System.out.println("--------------------------------------");
        System.out.println("==========MERK SEPATU=================");
        System.out.println("1. Converse");
        System.out.println(" > kategori ");
        System.out.println("   -Slip on");
        System.out.println("   -High top");
        System.out.println("2. Sketcher");
        System.out.println(" > kategori ");
        System.out.println("   -Woman");
        System.out.println("   -Man");
        System.out.println("3. Nike");
        System.out.println(" > kategori ");
        System.out.println("   -Kids");
        System.out.println("   -Adult");
        System.out.println("--------------------------------------------");
        System.out.println("Masukan merk sepatu yang anda inginkan");
        merk = str.nextLine();
        System.out.println("Pilih kategori yang anda inginkan: ");
        kategori = str.nextLine();
        System.out.println("Pilih ukuran yang anda inginkan: ");
        size = nstr.nextInt();

        if (merk.equalsIgnoreCase("converse")) {
            if ( kategori.equalsIgnoreCase("Slip on")) {
                if (size == 36 ) {
                    harga = 800000;
                } else if (size == 37) {
                    harga = 800000;
                } else if (size == 38) {
                    harga = 800000;
                } else if (size == 39) {
                    harga = 800000;
                } else if (size == 40) {
                    harga = 800000;
                } else {
                    System.out.println("Size yang dipilih tidak tersedia");
                    return;
                }
            } else if (kategori.equalsIgnoreCase("High top")) {
                if (size == 40 ) {
                    harga = 1200000;
                } else if (size == 41) {
                    harga = 1200000;
                } else if (size == 42) {
                    harga = 1200000;
                } else if ( size == 43) {
                    harga = 1200000;
                } else if ( size == 44) {
                    harga = 1200000;
                } else {
                    System.out.println("Size yang dipilih tidak tersedia");
                    return;
                }
            } else {
                System.out.println("Kategori tidak tersedia");
                return;
            }
        } else if (merk.equalsIgnoreCase("Sketcher")) {
            if (kategori.equalsIgnoreCase("Woman")) {
                if (size == 36) {
                    harga = 1000000;
                } else if ( size == 37) {
                    harga = 1000000;
                } else if ( size == 38) {
                    harga = 1000000;
                } else if (size == 39) {
                    harga = 1000000;
                } else if (size == 40) {
                    harga = 1000000;
                } else if (size == 41) {
                    harga = 1000000;
                }else {
                    System.out.println("Size yang dipilih tidak tersedia");
                    return;
                }
            } else if (kategori.equalsIgnoreCase("Man")) {
                if (size == 41 ) {
                    harga = 1800000;
                } else if (size == 42) {
                    harga = 1800000;
                } else if ( size == 43) {
                    harga = 1800000;
                } else if (size == 44) {
                    harga = 1800000;
                } else {
                    System.out.println("size yang dipilih tidak tersedia");
                    return;
                }
            } else {
                System.out.println("Kategori tidak tersedia");
                return;
            }
        } else if ( merk.equalsIgnoreCase("Nike")) {
            if (kategori.equalsIgnoreCase("Kids")) {
                if (size == 36) {
                    harga = 750000;
                } else if (size == 37) {
                    harga = 750000;
                } else if ( size == 38) {
                    harga = 750000;
                } else if (size == 39) {
                    harga = 750000;
                } else if (size == 40) {
                    harga = 750000;
                } else {
                    System.out.println("size yang dipilih tidak tersedia");
                    return;
                }
            } else if (kategori.equalsIgnoreCase("Adult")) {
                if (size == 40) {
                    harga = 1500000;
                } else if (size == 41) {
                    harga = 1500000;
                } else if (size == 42) {
                    harga = 1500000;
                } else if (size == 43) {
                    harga = 1500000;
                } else if (size == 44) {
                    harga = 1500000;
                } else {
                    System.out.println("size yang dipilih tidak tersedia");
                    return;
                }
            } else {
                System.out.println("Kategori yang diinginkan tidak tersedia");
                return;
            }
        } else {
            System.out.println("Maaf, Kami tidak menjual merk sepatu yang anda inginkan");
            return;
        }
                System.out.println();
                System.out.println("merk: " + merk);
                System.out.println("kategori: " + kategori);
                System.out.println("size: " + size);
                System.out.println("harga: " +harga);
        
    }
}
