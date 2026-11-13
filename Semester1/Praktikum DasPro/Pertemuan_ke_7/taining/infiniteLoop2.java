package Pertemuan_ke_7.taining;

import java.util.Scanner;
public class infiniteLoop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNilai = 0, mhs = 0, nilai;

        do {
            System.out.println("Masukan nilai diluar rentang (0-100) untuk berhenti");
            nilai = sc.nextInt();
            if (nilai >= 0 && nilai <= 100) {
                totalNilai+= nilai;
                mhs++;
            }
        } while (nilai >= 0 );

        if (mhs > 0) {
            double rataRata = (double) totalNilai / mhs;
            System.out.println("Rata - Rata nilai: " + rataRata);
            System.out.println("Total mahasiswa" + mhs);
        } else {
            System.out.println("Tidak ada nilai yang dimasukan");
        }
        sc.close();
    }
}
