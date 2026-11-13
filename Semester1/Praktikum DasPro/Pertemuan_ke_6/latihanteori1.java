package Pertemuan_ke_6;

public class latihanteori1 {
    public static void main(String[] args) {
        int bil1 = 28;
        int bil2 = 54;
        int bil3 = 90;
        int maxBil = 0 ;

        if (bil1 > bil2) {
            maxBil = bil1;
        } else if (bil2 > bil1) {
            maxBil = bil2;
        } 

        if (bil2 > bil3) {
            maxBil = bil2;
        } else if (bil3 > bil2) {
            maxBil = bil3;
        }

        System.out.println("Bilangan terbesar adalah: " + maxBil);
    }
}

                 /*    int bil1 = 90;         OPSI 2
                    int bil2 = 54;
                    int bil3 = 60;
                    int maxbil = 0;

                    if (bil1 > bil2) {
                        maxbil = bil1;
                    } else {
                        maxbil = bil2;
                    }

                    if (bil2 > bil3) {
                        maxbil = bil2;
                    } else {
                        maxbil =bil3;
                    }

                    System.out.println("bilangan terbesar adalah: " + maxbil); */


                    /* int bil1 = 13;                    DENGAN OPERATOR LOGIKA
                        int bil2 = 54; 
                        int bil3 = 55;
                        int maxbil = 0;

                        if (bil1 > bil2 && bil1>bil3) {
                            maxbil = bil1;
                        } else if (bil2 > bil1 && bil2 > bil3) {
                            maxbil = bil2;
                        } else if (bil3 > bil1 && bil3 > bil2) {
                            maxbil = bil3;
                        }

                        System.out.println("bilangan terbesar adalah: " + maxbil); */