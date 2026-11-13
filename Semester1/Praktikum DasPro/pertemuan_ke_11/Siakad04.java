package pertemuan_ke_11;

import java.util.Scanner;
public class Siakad04 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);

        int n = 0;
        int k = 0;
        System.out.print("Masukan berapa jumlah mahasiswa: ");
        n = str.nextInt();
        System.out.print("Masukan berapa jumkah ata kuliah: ");
        k = str.nextInt();
        int [][] nilai = new int [n][k];  // [i][j]

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-"+(i+1));
            double totalperSiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah "+(j+1)+": ");
                nilai [i][j] = str.nextInt();
                totalperSiswa += nilai [i][j];
            }

            System.out.println("Nilai rata-rata: " + totalperSiswa / n );
        }

        System.out.println("=========================================");
        System.out.println("Rata-rata nilai setiap mata kuliah:");

        for (int i = 0; i < nilai.length; i++) {   // baris 
            double totalperMatkul = 0;

            for (int j = 0; j < nilai[i].length; j++) {      // kolom
                totalperMatkul += nilai[i][j];
            }

            System.out.println("Mata kuliah "+(i+1)+": " + totalperMatkul / k);
        }
    }
}
