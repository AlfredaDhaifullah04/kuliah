public class Pembayaran {
    private double jumlah;
    private String metode;
    private String tanggal;

    public Pembayaran(double jumlah, String metode, String tanggal) {
        this.jumlah = jumlah;
        this.metode = metode;
        this.tanggal = tanggal;
    }

    public double getJumlah() { return jumlah; }
    public void setJumlah(double jumlah) { this.jumlah = jumlah; }

    public String getMetode() { return metode; }
    public void setMetode(String metode) { this.metode = metode; }

    public String getTanggal() { return tanggal; }
    public void setTanggal(String tanggal) { this.tanggal = tanggal; }

    public String info() {
        return "Pembayaran: Rp" + jumlah + " via " + metode + " pada " + tanggal;
    }
}
