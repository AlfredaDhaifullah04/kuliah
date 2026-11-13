import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Instruktur
        Instruktur instruktur1 = new Instruktur("Andi", "andi@mail.com", "Pemrograman");
        Instruktur instruktur2 = new Instruktur("Citra", "citra@mail.com", "Desain Grafis");

        // Kursus 1
        Kursus kursus1 = new Kursus("Java OOP", "Belajar konsep OOP di Java", 200000, instruktur1);
        kursus1.tambahKonten(new Konten("Pengenalan OOP", "Video", 30));
        kursus1.tambahKonten(new Konten("Inheritance", "Artikel", 15));

        // Kursus 2
        Kursus kursus2 = new Kursus("UI/UX Dasar", "Belajar desain aplikasi", 150000, instruktur2);
        kursus2.tambahKonten(new Konten("Dasar UI", "Video", 25));

        // Peserta 1
        Peserta budi = new Peserta("Budi", "budi@mail.com");
        budi.daftarKursus(kursus1);
        budi.tambahPembayaran(new Pembayaran(200000, "Transfer Bank", "25-09-2025"));

        // Peserta 2
        Peserta dewi = new Peserta("Dewi", "dewi@mail.com");
        dewi.daftarKursus(kursus1);
        dewi.daftarKursus(kursus2);
        dewi.tambahPembayaran(new Pembayaran(200000, "E-Wallet", "26-09-2025"));
        dewi.tambahPembayaran(new Pembayaran(150000, "Kartu Kredit", "26-09-2025"));

        // Daftar
        ArrayList<Peserta> daftarPeserta = new ArrayList<>();
        daftarPeserta.add(budi);
        daftarPeserta.add(dewi);

        ArrayList<Kursus> daftarKursus = new ArrayList<>();
        daftarKursus.add(kursus1);
        daftarKursus.add(kursus2);

        // OUTPUT
        System.out.println("=== DATA PESERTA ===");
        for (Peserta p : daftarPeserta) {
            System.out.println(p.info());
        }

        System.out.println("=== DATA KURSUS ===");
        for (Kursus k : daftarKursus) {
            System.out.println(k.info());
        }
    }
}
