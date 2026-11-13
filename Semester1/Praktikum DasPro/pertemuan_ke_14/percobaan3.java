package pertemuan_ke_14;

import java.util.Scanner;

public class percobaan3 {
    
    public static double hitunglaba(double saldo, int tahun) {
        if (tahun == 0) {
            return(saldo);
        } else {
            return (1.11 * hitunglaba(saldo, tahun - 1));
        }
    }

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Jumlah saldo awal: ");
        double saldoAwal = str.nextDouble();
        System.out.print("Lamanya investasi (tahun) :");
        int tahun = str.nextInt();

        System.out.println("jumlah saldo setelah "+tahun+ " tahun : ");
        System.out.println(hitunglaba(saldoAwal, tahun));
    }
}
