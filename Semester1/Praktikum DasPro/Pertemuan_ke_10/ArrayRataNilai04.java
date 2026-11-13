package Pertemuan_ke_10;

import java.util.Scanner;
public class ArrayRataNilai04 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);

        System.out.print("Masukan berapa jumlah semua mahasiswa: ");
        int n = str.nextInt();

        int [] nilaiMHS = new int [n];
        double total=0;
        double rata2=0; 
        int i =0;

        int mahasiswaLulus =0;
        double rataMhsLulus= 0;
        int totalNilaiMhsLulus =0;
        
        for ( i =0; i < nilaiMHS.length; i++) {
            System.out.print("masukan nilai mahasiswa ke-"+ (i)+": ");
            nilaiMHS[i] = str.nextInt(); 
            total += nilaiMHS[i];
            
            if (nilaiMHS[i] > 70) {
                mahasiswaLulus++;
                totalNilaiMhsLulus =  totalNilaiMhsLulus + nilaiMHS[i];
            }
        }
            rataMhsLulus = (double) totalNilaiMhsLulus / mahasiswaLulus;

        rata2 = total/nilaiMHS.length;
        System.out.println("Rata rata nilai seluruh mahasiswa: " + rata2);
        System.out.println("jumlah mahasiswa dinyatakan lulus: " + mahasiswaLulus);
        System.out.println("Rata nilai mahasiswa lulus: " + rataMhsLulus);
    }
}
