package Pertemuan_ke_10;

import java.util.Scanner;
public class SearchNilai04 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);

        System.out.print("masukan banyak nilai yang akan diinput: " );
        int n = str.nextInt();
        int [] arrayNilai = new int [n];

        for (int i =0; i < arrayNilai.length; i++) {
            System.out.print("masukan nilai mahasiswa ke-"+(i+1)+": ");   
            arrayNilai [i] = str.nextInt();
        }

        System.out.print("masukan nilai yang ingin dicari: ");
        int key = str.nextInt();
        int hasil = 0;

        System.out.println("--------------------------------------");
        for (int i =0; i < arrayNilai.length; i++) {
            if (key == arrayNilai[i]) {
                hasil = i;
                System.out.println("Nilai "+key+" ketemu di index ke-" +hasil);
            } else if (i == (arrayNilai.length-1) && key != arrayNilai[i] && hasil == 0 ) {  // maksut 0 adalah nihil
                // hasil == 0 dimaksutkan untuk kembali ke nilai inisialisasi: hasil == i (0)
                System.out.println("nilai tidak ditemukan");                               
            }
        }
        
    } 
}
    