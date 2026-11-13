package Pertemuan_ke_13.teori;

import java.util.Scanner;
public class Satu_B {
    Scanner str = new Scanner(System.in);
    static String nama = "Mulyadi";
    
    public static void Menu (String namaPelangggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelangggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian !");
        }
    }   

    public static void main(String[] args) {

        Menu(nama , true);
    }
}
