package Pertemuan_3;
public class member {
    private String nomorKTP;
    private String nama;
    private double limitPinjaman;
    private double jumlahPinjaman;
    
    // Konstruktor
    public member (String nomorKTP, String nama, double limitPinjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }
    
    // Getter methods
    public String getNomorKTP() {
        return nomorKTP;
    }
    
    public String getNama() {
        return nama;
    }
    
    public double getLimitPinjaman() {
        return limitPinjaman;
    }
    
    public double getJumlahPinjaman() {
        return jumlahPinjaman;
    }
    
    // Method untuk meminjam uang
    public void pinjam(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah pinjaman harus positif");
            return;
        }
        
        if (jumlahPinjaman + jumlah > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
        } else {
            jumlahPinjaman += jumlah;
            System.out.println("Pinjaman berhasil ditambahkan");
        }
    }
    
    // Method untuk mengangsur pinjaman
    public void angsur(double jumlah) {
        // Validasi minimal angsuran 10% dari jumlah pinjaman saat ini
        double minimalAngsuran = jumlahPinjaman * 0.1;
        if (jumlah < minimalAngsuran) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
            System.out.println("Minimal angsuran saat ini: " + minimalAngsuran);
            return;
        }
        
        if (jumlah > jumlahPinjaman) {
            System.out.println("Jumlah angsuran melebihi pinjaman");
        } else {
            jumlahPinjaman -= jumlah;
            System.out.println("Angsuran berhasil dilakukan");
        }

    }
}
