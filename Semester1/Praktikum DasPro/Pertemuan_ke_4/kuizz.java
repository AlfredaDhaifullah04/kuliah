package Pertemuan_ke_4;
import java.util.Scanner;

public class kuizz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double koeberlari = 0.5, koeberenang = 0.04, koebersepeda = 0.03;
        double durasi, koefisien, beratBadan;
        double kalori;
        double menit;
        double kcptnRata;
        
       
        System.out.print("masukan durasi berlari: ");
        durasi = input.nextInt();
        System.out.print("masukan koefisien: ");
        koefisien = input.nextInt();
        System.out.print("masukan berat badan: ");
        beratBadan = input.nextInt();
        System.out.print("masukan kcptn");
        kcptnRata = input.nextDouble();

        kalori = ((durasi + koefisien + beratBadan) + ( kcptnRata * 0.5 ));


        System.out.print("hasil kalori: " + kalori);


    }
    
}
