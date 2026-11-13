package Pertemuan_ke_13;

import java.util.Scanner;
public class mariana2 {

    static String menu[] = {"kopi", "Teh", "Es degan", "Roti bakar", "Gorengan"};


    static int [][] data = { // [5] [7]
        {20, 20, 25, 20, 10, 60, 10},
        {30, 80, 40, 10, 15, 20, 15},
        {5, 9, 20, 25, 10, 5, 45},
        {50, 8, 17, 18, 10, 30, 6},
        {15, 10, 16, 15, 10, 10, 55}
    };

    static Scanner str = new Scanner(System.in);
    public static void main(String[] args) {
        

        System.out.println("Pilihan menu: ");
        System.out.println("1. Menginputkan data penjualan");
        System.out.println("2. Menampilkan seluruh data penjualan seminggu");
        System.out.println("3. Menampilkan menu penjualan tertinggi");
        System.out.println("4. Menampilkan rata-rata penjualan untuk setiap menu");
        System.out.println("5. Exit program");
        

        do {
            System.out.print("Pilihan anda: ");
            int pilihan = str.nextInt();
            System.out.println("======================");

            if (pilihan == 1) {
                inputData();
            } else if (pilihan == 2) {
                allData();
            } else if (pilihan == 3) {
                penjualanTinggi();
            } else if (pilihan == 4) {
                rataPenjualan();
            } else if (pilihan == 5) {
                break;
            }

        } while (true);
    }

    public static void inputData () {
        System.out.print("Masukan index makanan: ");
        int idx = str.nextInt();
        System.out.print("hari ke berapa?: ");
        int idxHR = str.nextInt(); 
        System.out.print("Masukan jumlah: ");
        int jmlh = str.nextInt();

        data[idx][idxHR -1] += jmlh ;
        
    }

    public static void allData () {
        System.out.print("\t");
        for (int i = 0; i < 7; i++) {
            System.out.print("hariKe" + (i+1)+"  ");
        }
        System.out.println();
        for (int i = 0; i < data.length; i++) {
            System.out.print(menu[i]+"\t: ");
            for (int k = 0; k < data[i].length; k++) {
                System.out.print( data[i][k] + "  ");
            }
            System.out.println();
        }
    }

    public static void penjualanTinggi () {
        for (int i = 0; i < data.length; i++) {
            for (int k = 0; k < data[i].length; k++) {
                System.out.print(data[k][i]); 
            }
            System.out.println();
        }
    }

    public static void rataPenjualan () {
        int total = 0;
        for (int i = 0; i < data.length; i++){
            total = 0;
            for (int k = 0; k < data[i].length; k++) {
                total += data[i][k];
            }
            System.out.println("Rata penjualan " + menu[i]+ " : " + (total/menu.length));
        }
    }
}
