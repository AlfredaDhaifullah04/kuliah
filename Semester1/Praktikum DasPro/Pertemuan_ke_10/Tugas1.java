package Pertemuan_ke_10;

import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int totalNilai = 0;
        int nilaiTinggi = 0;
        int nilaiRendah = 100;

        System.out.print("berapa banyak nilai mahasiswa yang akan diimput: ");
        int n = str.nextInt();

        int [] nilaiMHS = new int[n];

        for (int i = 0; i < nilaiMHS.length; i++) {
            System.out.print("masukan nilai mahasiswa ke-" +(i+1)+ ": ");
            nilaiMHS[i] = str.nextInt();
            totalNilai +=  nilaiMHS[i];

            if (nilaiMHS[i] > nilaiTinggi) {
                nilaiTinggi = nilaiMHS[i];
            } else if (nilaiMHS[i] < nilaiRendah) {
                nilaiRendah = nilaiMHS[i];
            }
        }

        double rata = totalNilai / nilaiMHS.length;
        
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < nilaiMHS.length; i++) {
            System.out.println("Nilai mahasiswa ke-" +(i+1)+ " adalah " + nilaiMHS[i]);
        }
        System.out.println("Rata rata selurh nilai mahasiswa adalah: " + rata);
        System.out.println("Nilai tertinggi yaitu: " + nilaiTinggi);
        System.out.println("Nilai terendah yaitu: " + nilaiRendah);
        str.close();
    }
}
