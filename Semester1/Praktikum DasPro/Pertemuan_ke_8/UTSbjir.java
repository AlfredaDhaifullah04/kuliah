package Pertemuan_ke_8;

import java.util.Scanner;
public class UTSbjir {
    public static void main(String[] args) {     
        Scanner nstr= new Scanner(System.in);   // membuat Scanner
        
        // Deklarasi
        int ronde = 1;
        int nyawaZ =0,nyawaTS = 0,nyawaTP=0;
        int poinSZ =0, poinST = 0;

        System.out.println("Zombi vs Plant");
        System.out.println("----------------------------------");
        System.out.print("nyawa zombie: " );
        nyawaZ = nstr.nextInt(); 
        System.out.print("Poin serangan zombie: "); 
        poinSZ = nstr.nextInt();
        System.out.print("nyama tanaman pelindung: ");
        nyawaTP = nstr.nextInt();
        System.out.print("nyawa tanaman penyerang: ");
        nyawaTS = nstr.nextInt();
        System.out.print("Poin serangan tanaman penyerang: ");
        poinST = nstr.nextInt();
        System.out.println("------------------------------------");
        System.out.println("pertarungan Tanaman vs Zombie !");
        System.out.println("--------------------------------------");

        do { 
          System.out.println();
            System.out.println("Ronde " + ronde);

          if (nyawaTP >= 0) {
            System.out.println("-------------------"); 
            System.out.println("Tanaman penyerang menyerang zombie!");
            nyawaZ= nyawaZ - poinST;
            System.out.println("nyawa zombie sekarang: " + nyawaZ);
            System.out.println("zombie menyerang tanaman pelindung");
            nyawaTP = nyawaTP - poinSZ;
            System.out.println("Nyawa tanaman pelindung: " + nyawaTP);
          } else if (nyawaTP <= 0) {
            System.out.println("-------------------"); 
            System.out.println("Tanaman penyerang menyerang zombie!");
            nyawaZ= nyawaZ - poinST;
            System.out.println("nyawa zombie sekarang: " + nyawaZ);
            System.out.println("zombie menyerang tanaman penyerang");
            nyawaTS = nyawaTS - poinSZ;
            System.out.println("Nyawa tanaman penyerang : " + nyawaTS);
          }
            ronde++;
            nyawaTP= nyawaTP + 0;
            nyawaTS = nyawaTS + 0;
            nyawaZ = nyawaZ + 0;

            if (nyawaZ <= 0 || nyawaTS <=0) {
                break;
            } 
            
            
        } while (true) ;

        System.out.println();
        System.out.println("-------------------------------------------");
         if (nyawaZ <= 0) {
            System.out.println("Zombie telah mati, Tanaman pemenang !!");
         } else if (nyawaTS <= 0) {
            System.out.println(" Tanaman telah hancur, Zombie menang !!");
         }
         System.out.println(); 
         nstr.close();
    }
}
