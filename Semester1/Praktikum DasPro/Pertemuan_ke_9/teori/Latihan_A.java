package Pertemuan_ke_9.teori;

public class Latihan_A {
    public static void main(String[] args) {
        
        
        int i = 0;
        do {

            int j = 10;
            do {
                System.out.print("*");
                j--;
            } while (j > i);
            System.out.println();

            i++;
        } while (i < 10);
    }
}
