package pertemuan_ke_14;

import java.util.Scanner;

public class Tugas {
    public static int jumlahRekursif(int[] angka, int n) {
        if (n == 0) {
            return angka[0];
        } else {
            return angka[n] + jumlahRekursif(angka, n - 1);
        }
    }

    public static int jumlahIteratif(int[] angka) {
        int total = 0;
        for (int num : angka) {
            total += num;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int N = scanner.nextInt();

        int[] angka = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = scanner.nextInt();
        }

        // Pendekatan rekursif
        int totalRekursif = jumlahRekursif(angka, N - 1);
        System.out.println("Total dari " + N + " angka yang dimasukkan (rekursif) adalah: " + totalRekursif);

        // Pendekatan iteratif
        int totalIteratif = jumlahIteratif(angka);
        System.out.println("Total dari " + N + " angka yang dimasukkan (iteratif) adalah: " + totalIteratif);
    }
}
