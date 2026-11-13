package pertemuan_ke_11;

import java.util.Scanner;
public class tugasModif {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);

        int jumlahResponden = 5;
        int jumlahPertanyaan = 6;

        int data [][] = new int[jumlahResponden][jumlahPertanyaan];
        int totalNilaiPertanyaan = 0;
        int totalNilaiResponden [] = new int[jumlahResponden];
        int totalNilaiSeluruhResponden = 0;
        double rataKeseluruhan =0;
        
        for (int i = 0; i < jumlahResponden; i++) {
            System.out.println("responden "+(i+1));
            // memberikan rating setiap pertanyaan
            totalNilaiPertanyaan =0;
            for (int j = 0; j < jumlahPertanyaan;) {
                System.out.print("masukan nilai rating pertanyaan ke-: "+(j+1)+": ");
                data[i][j] = str.nextInt();
                
                if (data[i][j] < 1 || data[i][j] > 5) {
                    System.out.println("gagal, masukan ulang");
                    continue;
                } else {
                    totalNilaiPertanyaan += data[i][j];
                }
                j++;
            }
            totalNilaiResponden [i]+= totalNilaiPertanyaan;
        }
        // menghitung nilai rata setiap responden
        double rataSetiapResponden [] = new double[jumlahResponden];
        for (int i = 0; i < totalNilaiResponden.length; i++ ) {
            rataSetiapResponden [i]= totalNilaiResponden[i] / jumlahResponden;
        }
        
        // menghitung rata rata setiap pertanyaan
        double rataSetiapPertanyaan[] = new double[jumlahPertanyaan];
        for (int i = 0; i < rataSetiapPertanyaan.length; i++) {
            // rataSetiapPertanyaan[i] = totalNilaiPertanyaan / jumlahPertanyaan;
            rataSetiapPertanyaan
        }

        for (int i = 0; i < totalNilaiResponden.length; i++) {
            totalNilaiSeluruhResponden += totalNilaiResponden[i];
        }
        // menghitung rata keseluruhan
        rataKeseluruhan = (totalNilaiPertanyaan + totalNilaiSeluruhResponden) / (jumlahResponden + jumlahPertanyaan);

        System.out.println("========================================");
        System.out.println("Rata nilai setiap responden: " + rataSetiapResponden);
        System.out.println("Rata nilai setiap peretanyaan: " + rataSetiapPertanyaan);
        System.out.println("Rata keseluruhan: " + rataKeseluruhan);

    } 
}

