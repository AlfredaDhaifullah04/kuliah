import java.util.ArrayList;
// Tambahkan import Kursus jika berada di package berbeda, misal:
// import your.package.name.Kursus;

public class Peserta extends User {
    private ArrayList<Kursus> daftarKursus = new ArrayList<>();
    private ArrayList<Pembayaran> daftarPembayaran = new ArrayList<>();

    public Peserta(String nama, String email) {
        super(nama, email);
    }

    public void daftarKursus(Kursus k) {
        daftarKursus.add(k);
    }

    public void tambahPembayaran(Pembayaran p) {
        daftarPembayaran.add(p);
    }

    public double hitungTotalPembayaran() {
        double total = 0;
        for (Pembayaran p : daftarPembayaran) {
            total += p.getJumlah();
        }
        return total;
    }

    public String info() {
        String info = "Peserta: " + super.info() + "\n";
        info += "Kursus yang diikuti:\n";
        for (Kursus k : daftarKursus) {
            info += "- " + k.getJudul() + " (Rp" + k.getHarga() + ")\n";
        }
        info += "Total Pembayaran: Rp" + hitungTotalPembayaran() + "\n";
        return info;
    }
}
