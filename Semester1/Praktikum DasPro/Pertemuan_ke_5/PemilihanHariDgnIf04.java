 package Pertemuan_ke_5;

 import java.util.Scanner;
public class PemilihanHariDgnIf04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dayType;
        String hari;

        System.out.println("masukan angka hari: ");
        hari = sc.nextLine();

        switch (hari.toLowerCase()) {
            case "1": 
            case "2": 
            case "3": 
            case "4": 
            case "5":
              dayType = "weekday";   
                break;
            case "6":
            case "7":
              dayType = "weekEnd";
                 break;
            default:
              dayType = "angka tidak valid";
                break;
        }
        System.out.println("number " + hari + " is a " + dayType);
    }
}