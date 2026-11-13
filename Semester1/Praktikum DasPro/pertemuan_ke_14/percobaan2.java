package pertemuan_ke_14;

import java.util.Scanner;
public class percobaan2 {    
    public static int hitungpangkat(int x, int y) {
        if (y == 0) {
            return (1);
        } else {
            return (x * hitungpangkat(x, y - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan, pangkat;

        System.out.print("Bilangan yang dihitung: ");
        bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        pangkat = sc.nextInt();
        
        System.out.println(hitungpangkat(bilangan, pangkat));
    }
}
