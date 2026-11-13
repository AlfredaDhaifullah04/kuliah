package Pertemuan_ke_7;

import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int jenis=0, durasi = 0, total =0;
        int totalomset=0;
        
        do {
            totalomset += total ;
            System.out.println("omseet " + totalomset);
            System.out.println("Masukan jenis kenaraan anda: ");
            System.out.println("1. mobil");
            System.out.println("2. motor");
            System.out.println("0. keluar");
            jenis= str.nextInt();
            if (jenis == 1) {
                System.out.println("berapa durasi anda parkir? ");
                durasi = str.nextInt();
                total = durasi *3000;
                if (durasi > 5 ) {
                total = 12000;
                }
                System.out.println("harga yang harus dibayar: " +total);
                
            } else if (jenis == 2) {
                System.out.println("berapa durasi anda parkir? ");
                durasi = str.nextInt();
                total = durasi *2000;
                if (durasi > 5 ) {
                    total = 12000;
                }
                System.out.println("harga yang harus dibayar: " +total);
                
            }
        } while (jenis !=0);

        System.out.println("total penjualan:" + totalomset);
        str.close();
    }
}
