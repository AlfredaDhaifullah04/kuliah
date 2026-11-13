package Pertemuan_ke_6.latihPemilihan2;

import java.util.Scanner;
public class no7eCommerce {
    public static void main(String[] args) {
        Scanner yow = new Scanner(System.in);
        String kategori = "";
        String barang1 = "", barang2 = "",barang3 = "";
        int budget = 0;

        System.out.println("kategori produk yang seperti apa yang anda inginkan?: ");
        kategori = yow.nextLine();
        System.out.println("Rentang harga berpapa yang anda telah siapkan untuk barang yang anda cari: ");
        budget = yow.nextInt();

        if (kategori.equalsIgnoreCase("Elektronik")) {
            if (budget > 5000000) {
                barang1 ="Laptop";
                barang2 = "Smartphone";
            } else if (budget < 5000000) {
                barang1 = "headphone";
                barang2 = "Mouse";
                barang3 = "Keyboard";
            }
        } else if (kategori.equalsIgnoreCase("Fashion")) {
            if (budget > 500000) {
                barang1 = "jaket kulit";
                barang2 = "Sepatu branded";
            } else if (budget < 500000) {
                barang1 = "Kaos";
                barang2 = "Celana jeans";
            }
        } else if (kategori.equalsIgnoreCase("Makanan")) {
            if (budget > 200000) {
                barang1 = "Paket katering Premiun";
            } else if (budget < 200000) {
                barang1 = "Makanan ceoat saji";
            }
        } else {
            System.out.println("kategori yang anda maksud tidak tersedia");
        }


        System.out.println("barang " + barang1+" "+ barang2 +" "+ barang3 );
    }
}
