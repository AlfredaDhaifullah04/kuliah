package Pertemuan_ke_6.latihPemilihan2;

import java.util.Scanner;
public class no4PenentuanPajak {
    public static void main(String[] args) {
        Scanner alamak = new Scanner(System.in);
        int mesin = 0;
        double pajak= 0;
        String jenis= "";

        System.out.println("Masukan jenis kendaraan anda: ");
        jenis= alamak.nextLine();
        System.out.println("masukan cc mesin anda: ");
        mesin = alamak.nextInt();

        if (jenis.equalsIgnoreCase("Motor")) {
            if (mesin < 150) {
                pajak = 0.01;
            } else if (mesin >= 150 && mesin <= 250) {
                pajak = 0.02;
            } else if (mesin > 250) {
                pajak = 0.05;
            }
        } else if (jenis.equalsIgnoreCase("Mobil")) {
            if (mesin < 1000) {
                pajak = 0.03;
            } else if (mesin >= 1000 && mesin <= 2000) {
                pajak = 0.05;
            } else if (mesin > 2000) {
                pajak = 0.07;
            }
        } else {
            System.out.println("Jenis kendaraan anda tidak dikenali");
        }

        System.out.println("jenis kendaraan: " + jenis);
        System.out.println("Besar pajak: " + (pajak*100) + "% dari harga kendaraan anda");
    }
}