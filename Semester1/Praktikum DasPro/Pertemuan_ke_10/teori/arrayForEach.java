package Pertemuan_ke_10.teori;

import java.util.Scanner;
public class arrayForEach {
    public static void main(String[] args) {
        //membuat arrray motor
        String[] motor = new String[6];

        Scanner sc = new Scanner(System.in);

        // Mengisi data ke dalam array
        for (int i = 0; i < motor.length; i++) {
            System.out.print("Masukan nama motor ke-" + i+": ");
            motor[i] = sc.nextLine();
        }
        System.out.println("----------------------------");
        System.out.println("Nama motor yang sudah dimasukan: ");

        // menampilkan array
        for (String b : motor) {
            System.out.println(b);
        }
    }
}
