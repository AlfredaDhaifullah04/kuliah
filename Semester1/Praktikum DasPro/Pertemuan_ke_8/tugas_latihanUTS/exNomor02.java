package Pertemuan_ke_8.tugas_latihanUTS;

import java.util.Scanner;
public class exNomor02 {
    public static void main(String[] args) {
        Scanner aw = new Scanner (System.in);
        int i =1;
        int n = 0; // 'n' didapatkan dari output
        int kali =1;
        int baris = 1;
        
        System.out.println("masukan nilai n : " );
        n = aw.nextInt();

        for (;i <= n;) {
            kali = kali +i;
            
            System.out.println("baris ke- "+ baris+"nilai kali adalah: " + kali);
            baris++;
            i++;
        }            // coba ngerjakan nomor 2 jadi seperti ini 
    }
}
