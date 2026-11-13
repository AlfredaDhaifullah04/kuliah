package Pertemuan_ke_10.teori;

import java.util.Scanner;
public class Latihan3 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);

        String []bulan = {"januari", "februari","maret","april","mei","juni","juli","agustus","september","oktober","november","desember"};
        System.out.print("Masukan nomor bulan yang dimaksud: ");
        int angka = str.nextInt();

        angka = angka - 1;
        System.out.println(bulan[angka]);
    }
}
