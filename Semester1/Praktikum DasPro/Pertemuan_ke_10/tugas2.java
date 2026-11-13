package Pertemuan_ke_10;

import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        Scanner nstr = new Scanner(System.in);
        int jumlahPesanan =0;
        int totalBayar = 0;

        System.out.print("berapa jumlah pesanan anda: ");
        jumlahPesanan = nstr.nextInt();  //menentukan panjang element pada array pesanan dan harga 

        String pesanan []= new String[jumlahPesanan];  // deklarasi array untuk nama pesanan
        for (int i =0; i < pesanan.length;i++) {
            System.out.print("Masukan nama makanan yang di inginkan: ");
            pesanan [i] = str.nextLine();  // [i] = sebagai index

        }

        int harga[];  // deklarasi array untuk harga setiap pesanan
        harga = new int[jumlahPesanan];
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("masukan harga setiap pesanan: ");
            harga[i] = nstr.nextInt();   // [i] = sebagai penentu index 
            totalBayar += harga[i];
        }

        str.close(); nstr.close();
        
        System.out.println("========================================================");
        for (int i = 0; i < jumlahPesanan;i++ ) {
            System.out.println("makanan yang dipesan:" +pesanan[i]+ " dengan harga: " + harga[i]);
        }
        System.out.println("----------------------------------------------------------");
        System.out.println("Total biaya yang harus dibayar adalah: " + totalBayar);
    }
}
