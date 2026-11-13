package Pertemuan_ke_9;
import java.util.Scanner;

public class tugas2modif {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);

        int jumlahCabang = 4;
        int jumlahAtletPerCabang = 5;
        String atlet[][] = new String[jumlahCabang][jumlahAtletPerCabang];
        String[] cabangOlahraga = {"Badminton", "basket", "tenis meja", "Bola Voli"};

        // Input data atlet
        for (int i = 0; i < jumlahCabang; i++) {
            System.out.println("Cabang Olahraga: " + cabangOlahraga[i]);
            for (int j = 0; j < jumlahAtletPerCabang; j++) {
                System.out.print("Masukkan nama atlet ke-" + (j+1) + ": ");
                atlet[i][j] = str.nextLine();
            }
            System.out.println();
        }

        System.out.println("-----------DATA ATLET PORSENI--------------");
        // Tampilkan data atlet
        for (int i = 0; i < jumlahCabang; i++) {
            System.out.println("Cabang Olahraga: " + cabangOlahraga[i]);
            for (int j = 0; j < jumlahAtletPerCabang; j++) {
                System.out.println("Atlet ke-" + (j+1) + ": " + atlet[i][j]);
            }
            System.out.println();
        }
    }
}
