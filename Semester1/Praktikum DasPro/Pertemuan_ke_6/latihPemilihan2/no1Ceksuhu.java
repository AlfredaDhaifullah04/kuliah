package Pertemuan_ke_6.latihPemilihan2;

import java.util.Scanner;
public class no1Ceksuhu {
    public static void main(String[] args) {
        Scanner scp1 = new Scanner(System.in);
        int suhu = 0;

        System.out.println("masukan berapa derajat suhu saat ini: ");
        suhu = scp1.nextInt();

        if (suhu < 18) {
            System.out.println("Ruangan terlalu dingin");
        } else if ( suhu >= 18 && suhu <= 26) {
            System.out.println("Suhu ruangan normal");
        } else if (suhu > 26) {
            System.out.println("Ruangan terlalu panas");
        }
    }
}
