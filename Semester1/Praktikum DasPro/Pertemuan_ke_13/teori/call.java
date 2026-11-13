package Pertemuan_ke_13.teori;

public class call {
    public static void main(String[] args) {
        int hasil = hitung (10,2);      
        System.out.println("Hasil akhirnya adalah " + hasil);  
    }

    static int tambah (int x, int y) {
        int z = x+y;
        return z;
    }

    static int hitung (int c, int d) {
        int e;
        c*= 2;
        d*= 2;
        e= tambah (c,d);
        return e;
    }
}