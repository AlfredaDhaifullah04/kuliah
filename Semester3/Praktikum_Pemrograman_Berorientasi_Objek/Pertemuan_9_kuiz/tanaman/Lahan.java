package tanaman;

public class Lahan {
    private String nama;
    private int ukuran;
    private String jenisTanah;
    private Tanaman tanaman;

    public Lahan(String nama, int ukuran, String jenisTanah) {
        this.nama = nama;
        this.ukuran = ukuran;
        this.jenisTanah = jenisTanah;
    }

    public void tanamTanaman(Tanaman t) {
        this.tanaman = t;
        System.out.println("🌾 Menanam " + t.getClass().getSimpleName() + " di " + nama + "...");
    }
}
