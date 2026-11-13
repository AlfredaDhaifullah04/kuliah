package pertemuan_ke_14;

public class Percobaan1 {
    
    public static int faktorialRekrusif(int n) {
        if (n == 0) {
            return n;
        } else {
            return (n * faktorialRekrusif(n -1));
        }
    }
    public static int faktorialIteratif(int n) {
        int faktor = 1;
        for (int i = n; i >= 1; i--) {
            faktor = faktor * i;
        }
        return faktor;
    }

    public static void main(String[] args) {
        System.out.println(faktorialRekrusif(5));
        System.out.println(faktorialIteratif(5));
    }
}
