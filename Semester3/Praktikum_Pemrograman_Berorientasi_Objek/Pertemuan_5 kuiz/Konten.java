public class Konten {
    private String judul;
    private String tipe;
    private int durasi;

    public Konten(String judul, String tipe, int durasi) {
        this.judul = judul;
        this.tipe = tipe;
        this.durasi = durasi;
    }

    public String getJudul() { return judul; }
    public void setJudul(String judul) { this.judul = judul; }

    public String getTipe() { return tipe; }
    public void setTipe(String tipe) { this.tipe = tipe; }

    public int getDurasi() { return durasi; }
    public void setDurasi(int durasi) { this.durasi = durasi; }

    public String info() {
        return judul + " [" + tipe + ", " + durasi + " menit]";
    }
}
