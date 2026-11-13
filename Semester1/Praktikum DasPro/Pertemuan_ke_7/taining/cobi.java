package Pertemuan_ke_7.taining;

import java.util.Scanner;
public class cobi {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int matkul =0;
        double nilai, rata, total = 0;
        int i = 1;

        System.out.println("berapa jumlah matkul yang ada: ");
        matkul = sc.nextInt();

        for (; i <= matkul; i++) {
            System.out.println("Masukan nilai mata kuliah ke-" + i + ":");
            nilai = sc.nextDouble();
            total +=  nilai;
            
        }

        rata = total/matkul;
        System.out.println("Rata - rata nilai: " + rata);
        sc.close();
    }
}
