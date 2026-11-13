package Pertemuan_ke_9;

import java.util.Scanner;
public class tugas2_2 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        Scanner nstr = new Scanner(System.in);
        int politeknik =0;
        String atletBadminton ="";
        String atletTenisMeja ="";
        String atletBasket = "";
        String atletVoli = "";
        
        System.out.print("berapa jumlah politeknik yang mendaftar? : ");
        politeknik = nstr.nextInt();
        
        for (int i =1; i <= politeknik; i++) {
            System.out.println("POLITEKNIK KE "+i);
            System.out.println("--------------BADMINTON--------------");
            for ( int k = 1; k <= 5; k++) {         // 5 adalah jumlah atlet terbaik
                System.out.print("Masukan nama atlet ke-" +k+": " );
                String bdmn = str.nextLine();
                atletBadminton += "Politeknik ke-"+i+", atlet ke-" +k+" Nama atlet: "+bdmn+ "\n" ;    
            }
            System.out.println("---------------TENIS MEJA----------");
            for ( int k = 1; k <= 5; k++) {         // 5 adalah jumlah atlet terbaik
                System.out.print("Masukan nama atlet ke-" +k+": " );
                String tnsmj = str.nextLine();
                atletTenisMeja += "Politeknik ke-"+i+", atlet ke-"+k+" Nama atlet: "+tnsmj+ "\n" ;    
            }
            System.out.println("-----------BASKET----------------");
            for ( int k = 1; k <= 5; k++) {         // 5 adalah jumlah atlet terbaik
                System.out.print("Masukan nama atlet ke-" +k+": " );
                String bskt= str.nextLine();
                atletBasket += "Politeknik ke-"+i+", atlet ke-"+k+" Nama atlet: "+bskt+ "\n" ;    
            }
            System.out.println("---------------BOLA VOLY--------------");
            for ( int k = 1; k <= 5; k++) {         // 5 adalah jumlah atlet terbaik
                System.out.print("Masukan nama atlet ke-" +k+": " );
                String vly= str.nextLine();
                atletVoli += "Politeknik ke-"+i+", atlet ke-"+k+" Nama atlet: "+vly+ "\n" ;    
            }
            
            System.out.println();
        }
        System.out.println();
        System.out.println("Data nama atlet yang terdaftar");
        System.out.println("atlet badminton : \n"+ atletBadminton + "\n");
        System.out.println("atlet tenis meja: \n"+atletTenisMeja+ "\n");
        System.out.println("atlet basket: \n" + atletBasket+"\n");
        System.out.println("atlet voly: \n" + atletVoli+"\n");
    }
}
