package Pertemuan_ke_13;

public class pertanyaan2 {
    public static void TampilHinggakei (int i) {
        for (int j = 1; j <= i ; j++) {
            System.out.println(j);
        }
    }   

    public static int jumlah (int bil1, int bil2) {
        return (bil1 + bil2); // 2
    }

    public static void tampilJumlah (int bil1, int bil2) {
        TampilHinggakei(jumlah(bil1, bil2));
    }

    public static void main(String[] args) {
        int temp = jumlah(1,1); // 2
        tampilJumlah(temp, 5);
    }
}
