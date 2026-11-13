package Pertemuan_ke_13;

import java.util.Scanner;
public class mariana {
    public static void main(String[] args) {
        Scanner str = new Scanner (System.in);

        int [][] data = { // [5] [7]
            {20, 20, 25, 20, 10, 60, 10},
            {30, 80, 40, 10, 15, 20, 15},
            {5, 9, 20, 25, 10, 5, 45},
            {50, 8, 17, 18, 10, 30, 6},
            {15, 10, 16, 15, 10, 10, 55}
        };
        String menu[] = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};

        System.out.println("Pilihan menu: ");
        System.out.println("1. Menginputkan data penjualan");
        System.out.println("2. Menampilkan seluruh data penjualan seminggu");
        System.out.println("3. Menampilkan menu penjualan tertinggi");
        System.out.println("4. Menampilkan rata-rata penjualan untuk setiap menu");
        System.out.println("5. Exit program");
        System.out.print("pilihan anda: ");

        do {
            
            int pilih = str.nextInt();
            
            switch (pilih) {
            case 1: inputData(str);
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5: 
                break;
            default:
                break;
            }
        } while (true);
    }

    public static int inputData (Scanner sc) {
        System.out.println("masukan index makanan: ");
        
        return;
    }
}
