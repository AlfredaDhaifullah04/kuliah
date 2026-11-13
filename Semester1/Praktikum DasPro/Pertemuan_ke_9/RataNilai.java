package Pertemuan_ke_9;

import java.util.Scanner;
public class RataNilai {
    public static void main(String[] args) {
        Scanner nstr = new Scanner(System.in);
        int i = 1, j ;
        float nilai =0f, totalNilai=0, rataNilai=0;

        while (i <= 5) {
            System.out.print("Input nilai mahasiswa ke-"+i+": ");
            System.out.println();
            totalNilai = 0;
            j = 1;
            for (;j <=5;) {
                System.out.print("Nilai ke-"+ j + ": ");
                int nilaiMHS = nstr.nextInt();
                if (nilaiMHS < 0 || nilaiMHS > 100) {
                    System.out.println("nilai tidak valid");
                    continue;
                }
                j++;
                totalNilai += nilaiMHS;
            }
            rataNilai = totalNilai / 5;
            System.out.println("Rata nilai mahasiswa ke-" + i + ": " + rataNilai);
            i++;
        }
    }
}
