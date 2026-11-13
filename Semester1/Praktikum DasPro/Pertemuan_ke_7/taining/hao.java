package Pertemuan_ke_7.taining;
import java.util.Scanner;

public class hao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double jmlhTiket, TotalTiket = 0, hargaTiket, totalHarga = 0;
        double diskon = 0;
        char respon='y';
        double hargaSatuanTiket = 50000;

        while (respon=='y') {
            System.out.println("Masukan jumlah tiket: ");
            jmlhTiket=sc.nextInt();
            if (jmlhTiket <= 0) {
                System.out.println("Input Invalid");
                continue;
            } else {
                if (jmlhTiket >= 10) {
                    diskon =  0.15;
                } else if (jmlhTiket > 4) {
                    diskon =  0.1;
                } else {
                    diskon = 0;
                }

                hargaTiket = (hargaSatuanTiket* jmlhTiket) -((hargaSatuanTiket*jmlhTiket)*diskon);
                TotalTiket = TotalTiket + jmlhTiket;
                totalHarga = totalHarga + hargaTiket;

                System.out.println("------------------------------------------");
                System.out.println("Diskon: " +diskon);
                System.out.println("Potongan harga didapat : " + (int)((hargaSatuanTiket*jmlhTiket)*diskon));
                System.out.println("total harga sebelum diskon: " + (int) (hargaSatuanTiket*jmlhTiket));
                System.out.println("Total harga setelah diskon: " + (int)hargaTiket);
                System.out.println("-------------------------------------------");
                System.out.println("Transaksi lagi? (y/n): " );
                respon = sc.next().charAt(0);

            }
        }
        System.out.println("Total tiket: " + (int) TotalTiket);
        System.out.println("Total harga: " + (int)totalHarga);
        
    }
}