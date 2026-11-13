package Pertemuan_ke_8.tugas_latihanUTS;

public class nomor08 {
    public static void main(String[] args) {
        int bil1 = 3;
        int bil2 = 2;
        int hasil = 0;
        int i =0, n=2;

        for(;i <= n;) {
            hasil = bil1+bil2;
            hasil = hasil + bil2 + bil1;
            hasil = hasil + bil2 + bil1;
            i++;
        } 
        System.out.println(hasil);
    }
}
