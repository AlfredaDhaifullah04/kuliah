package Pertemuan_ke_9.teori;

public class StudiCaseWhile2 {
    public static void main(String[] args) {
        
        int i = 0;
        while (i <= 10) {
            
            int j = 0;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        int k = 0;
        while (k <=10) {

            int j = 11;
            while (j >= k) {
                System.out.print("*");
                j--;
            }
            System.out.println();
            k++;
        }
    }
}
