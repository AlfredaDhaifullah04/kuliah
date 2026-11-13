package Pertemuan_ke_9.teori;

public class teoriNesLop2 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n;i++) {  //  loop level 1         outer loop
            for (int j = 0;j < n; j++) {  // loop level 2            inner loop
                for (int k = 0;k < n; k++) {  // loop level 3
                    System.out.print("^"); //statement
                }
                System.out.println(); // statement
            }
            for (int l = 0; l < n; l++) { // loop level 2
                System.out.print("&");  //statement
            }
            System.out.println(); //statement
        }
    }
}
