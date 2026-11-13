package Pertemuan_ke_13;

public class PengunjungCave04 {
    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar nama pengunjung: ");
        for (String b : namaPengunjung) {
            System.out.println("- " + b);
        }
    }

    public static void main(String[] args) {
        daftarPengunjung("andi", "supri", "citra");
    }
}
