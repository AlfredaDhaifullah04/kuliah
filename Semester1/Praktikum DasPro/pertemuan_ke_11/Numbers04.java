package pertemuan_ke_11;

import java.util.Arrays;
import java.util.Scanner;
public class Numbers04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int [][] myNumbers = new int[n][]; 
        myNumbers[0] = new int [5];
        myNumbers[1]= new int [3];
        myNumbers[2]= new int [1];

        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));   // ganti sout dengan myNumbers
        }

        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("panjang baris ke-" +(i + 1)+": " + myNumbers[i].length);
        }


        // BARIS 23 KEBAWAH MENCOBA

        System.out.println("nilai n baru: ");
        n = sc.nextInt();
        myNumbers = new int[n][];

        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));   // ganti sout dengan myNumbers
        }

        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("panjang baris ke-" +(i + 1)+": " + myNumbers[i].length);
        }

    }
}
