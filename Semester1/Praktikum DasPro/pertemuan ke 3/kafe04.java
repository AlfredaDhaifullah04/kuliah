import java.util.Scanner;
public class kafe04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean keanggotaan;
        int jmlKopi,jmlTeh, jmlRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;
        float diskon = 10 / 100;
        double totalHarga,nominalBayar;
        int nominalInt;
        byte totalByte;

        System.out.print("Masukan keanggotaan (true/false): ");
        keanggotaan = input.nextBoolean();
        System.out.print("Masukan jumlah pembelian kopi: ");
        jmlKopi = input.nextInt();
        System.out.print("Masukan jumlah pembelian teh: ");
        jmlTeh = input.nextInt();
        System.out.print("Masukan jumlah pembelian roti: ");
        jmlRoti = input.nextInt();

        totalHarga = (jmlKopi * hargaKopi) +  (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
        nominalBayar = totalHarga - (diskon * totalHarga);
        totalByte = (byte) totalHarga;
        nominalInt = (int) nominalBayar;
         

        System.out.println("keanggotaan pelanggan: " + keanggotaan);
        System.out.println("Item pembelian: " + jmlKopi + " kopi: " + jmlTeh + " Teh: " + jmlRoti + " Roti: ");
        System.out.println("Nominal bayar Rp: " + nominalBayar);
        System.out.println("Nominal bayar dalam (int): Rp" + nominalInt);
        System.out.println("Total harga (dalam byte): Rp" + totalByte);
    }
}
