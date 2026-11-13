package Pertemuan_ke_13;

import java.util.Scanner;
public class kafe04 {
    static double diskon = 0;
    static double diskonMember = 0;
    public static void mEnu(String namaPelanggan, boolean isMember, String kodePromo) {
        
        System.out.println("Selamat datang, " + namaPelanggan +" !");
        
        if (namaPelanggan.equalsIgnoreCase("mahez") || namaPelanggan.equalsIgnoreCase("sumbul")) {
            diskonMember = 0.1;
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            diskon = 0.5;
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            diskon = 0.3;
        } else {
            System.out.println("Kode invalid");
        }
        System.out.println("========Menu Resto Kafe========");
        System.out.println("1. kopi hitam - Rp 15,000");
        System.out.println("2. Cappucino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh tarik - Rp 12,000");
        System.out.println("5. Roti bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===============================");
        System.out.println("Silahkan pilih menu yang anda inginkan. ");
    }   

    public static double hitungTotalHarga (int pilihanMenu, int banyakItem) {
        int [] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
                
        double hargaTotal = (hargaItems[pilihanMenu - 1] * banyakItem) - ((hargaItems[pilihanMenu - 1] *banyakItem )* (diskon+diskonMember));
        return hargaTotal;
    }
    
    public static void main(String[] args) {
        Scanner str = new Scanner (System.in);

        System.out.print("Masukan nama anda: ");
        String nama = str.nextLine();
        System.out.print("Masukan kupon yang anda miliki: ");
        String kode = str.nextLine();

        mEnu(nama,false, kode);

        double totalHarga = 0;
        double totalBayar = 0;
        System.out.print("nomor 0 utk keluar,  ");
        while (true) {
            
            System.out.print("Masukan nomor menu yang anda pilih: ");
            int pilihanMenu = str.nextInt();

            if (pilihanMenu == 0) {
                break;
            }
            if (pilihanMenu < 0 || pilihanMenu > 6) {
                System.out.println("Nomor pilihan invalid");
            }
            System.out.print("Masukan jumlah item yang anda pesan: ");
            int banyakItem = str.nextInt();
            
            totalHarga = hitungTotalHarga(pilihanMenu, banyakItem);
            System.out.println("harga pesanan \t\t: Rp" + (int)totalHarga);
            totalBayar += totalHarga;
            totalHarga = 0;
        }
        System.out.println("=====================================================");
        System.out.println("diskon didapat: " + ((diskon+diskonMember)*100) + "%");
        System.out.println("Total yang harus dibayarkan adalah: Rp" + (int)totalBayar);
    }
    
}
