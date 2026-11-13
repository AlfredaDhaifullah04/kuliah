package Pertemuan_ke_5;

import java.util.Scanner;
public class kafe04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu;
        String ukuranCup;
        int jumlah;
        boolean keanggotaan;
        

        System.out.print("masukan menu: ");
        menu = sc.nextLine();
        System.out.print("masukan ukuran cup: ");
        ukuranCup = sc.nextLine();
        System.out.print("Masukan jumlah: ");
        jumlah = sc.nextInt();
        System.out.print("masukan kanggotaan (true/false): ");
        keanggotaan = sc.nextBoolean();

        double hargaMenu = 0;
        
        switch (menu.toLowerCase()) {
            case "kopi":
                hargaMenu = 12000;
                break;
            case "teh":
                hargaMenu = 7000;
            case "coklat":
                hargaMenu = 20000;
                break;
            default:
                menu ="Pilihan tidak tersedia";
                break;
        }
        double toalHarga = hargaMenu * jumlah;

        switch (ukuranCup.toUpperCase()) {
            case "S":
                break;
            case "M":
                break;
            case "L":
                break;
            default: ukuranCup = "size cup yang dipilih tidak tersedia";
                break;

        }
        double diskon = keanggotaan ? 0 : 0.1;
        double nominalBayar = toalHarga - ( diskon * toalHarga);

        System.out.println("Item Pembelian "+ jumlah +", "+ menu +" dengan ukuran cup " + ukuranCup);
        System.out.println("Nominal bayar Rp " + nominalBayar);
    }
}
