package Pertemuan_ke_10;

import java.util.Scanner;
public class tugas3 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String [] menuMakan = {"Nasi goreng","Mie goreng", "Roti bakar", "Kentang goreng", "Teh tarik", "Cappucino", "Chocolat ice"};

        System.out.println("======DAFTAR MENU======");
        for (int i =0; i < menuMakan.length; i++) {
            System.out.println((i+1)+"."+menuMakan[i]);
        }

        String pesanan = "";
        System.out.print("masukan nama makanan yang ingin anda pesan: ");
        pesanan = str.nextLine();
        // String hasil = "";  (opsional)      // variable hasil digunakan untuk mengeluarkan output "makanan tidak tersedia"
        // jika tidak ada variable hasil, maka output "makanan tidak tersedia" akan terus keluar walaupun pesanan tersedia di dalam menu
        
        System.out.println("-------------------------------------------");
        for (int i =0; i < menuMakan.length;i++) {
            if (pesanan.equalsIgnoreCase(menuMakan[i])) {
                // hasil = pesanan;    // variable hasil dilakukan update agar tidak menjadi variable kosong / "" 
                System.out.println("makanan yang anda inginkan tersedia");
                break;
            } else if (i == (menuMakan.length-1) &&  pesanan != menuMakan[i] ) {  // hasil == 0;  di letakan pada kondisi else if
                System.out.println("makanan yang anda inginkan tidak tersedia");
            }
        }

        str.close();
    }
}
