package Pertemuan_ke_9;
import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        Scanner nstr = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        int jumlahPoltek =0, cabor = 4;
        String namaAtlet= "";

        System.out.print("masukan jumlah politeknik yang mendaftar: ");
        jumlahPoltek = nstr.nextInt();

        for (int i = 1; i <= jumlahPoltek; i++) {
            System.out.println("POLITEKNIK KE-"+i+": ");
             for (int j = 1; j <= cabor; j++) {
                if ( j == 1) {
                    System.out.println("------------BADMINTON-------------");
                    for (int k =1; k < 5;k++) {
                        System.out.print("masukan nama pemain ke-" + k+": ");
                        namaAtlet = str.nextLine();
                    }
                } else if ( j == 2) {
                    System.out.println("------------TENIS MEJA-------------");
                    for (int k =1; k < 5; k++ ) {
                        System.out.print("masukan nama pemain ke-" + k+": ");
                        namaAtlet = str.nextLine();
                    } 
                } else if (j == 3) {
                    System.out.println("------------BASKET-------------");
                    for (int k =1; k < 5; k++ ) {
                        System.out.print("masukan nama pemain ke-" + k+": ");
                        namaAtlet = str.nextLine();
                    }
                } else if ( j == 4) {
                    System.out.println("------------VOLY-------------");
                    for (int k =1; k < 5; k++ ) {
                        System.out.print("masukan nama pemain ke-" + k+": ");
                        namaAtlet = str.nextLine();
                    }
                }
            }
            System.out.println();
        }
    }
}
