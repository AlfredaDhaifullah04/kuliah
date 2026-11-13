import java.util.ArrayList;

public class Kursus {
    private String judul;
    private String deskripsi;
    private double harga;
    private Instruktur instruktur;
    private ArrayList<Konten> daftarKonten = new ArrayList<>();

    public Kursus(String judul, String deskripsi, double harga, Instruktur instruktur) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.instruktur = instruktur;
    }

    public String getJudul() { return judul; }
    public void setJudul(String judul) { this.judul = judul; }

    public String getDeskripsi() { return deskripsi; }
    public void setDeskripsi(String deskripsi) { this.deskripsi = deskripsi; }

    public double getHarga() { return harga; }
    public void setHarga(double harga) { this.harga = harga; }

    public Instruktur getInstruktur() { return instruktur; }
    public void setInstruktur(Instruktur instruktur) { this.instruktur = instruktur; }

    public void tambahKonten(Konten k) {
        daftarKonten.add(k);
    }

    public String info() {
        String info = "Kursus: " + judul + " (" + deskripsi + ")\n";
        info += "Harga: Rp" + harga + "\n";
        info += instruktur.info() + "\n";
        info += "Daftar Konten:\n";
        for (Konten k : daftarKonten) {
            info += "- " + k.info() + "\n";
        }
        return info;
    }
}
