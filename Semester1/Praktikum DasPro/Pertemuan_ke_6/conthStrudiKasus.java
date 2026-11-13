package Pertemuan_ke_6;
/*Sebuah sistem dibuat untuk menentukan pakaian dan peralatan yang harus
dibawa pengguna sesuai dengan kondisi cuaca. Jika suhu lebih dari 27oC, maka
pengguna disarankan memakai dress, kemudian dilakukan pengecekan apakah
saat ini hujan, jika hujan maka pengguna disarankan untuk membawa payung,
sedangkan jika tidak hujan maka pengguna disarankan untuk memakai
sunscreen. Namun, jika suhu kurang dari atau sama dengan 27oC, maka
pengguna disarankan memakai celana panjang */
import java.util.Scanner;
public class conthStrudiKasus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner aw = new Scanner(System.in);
        int suhu;
        String hujan;

        System.out.println("Masukan suhu: ");
        suhu = sc.nextInt();
        

        if (suhu > 27) {
            System.out.println("memakai dress");
            
            System.out.println("apakah hujan/ (y/n)");
            hujan = aw.nextLine();

            if (hujan.equals("y")) {
                System.out.println("menbawa payung");
            } else {
                System.out.println("memakai Sunscreen");
            }
        } else {
            System.out.println("memakai celana panjang");
        } 

        
    }
}
