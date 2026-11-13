package Pertemuan_6;
public class dosen extends pegawai {
    private int jumlahSKS;
    private final int TARIF_SKS = 150000; // Tarif per SKS
    
    // Konstruktor
    public dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat); // Memanggil konstruktor Pegawai
        this.jumlahSKS = 0;
    }
    
    // Setter untuk SKS
    public void setSKS(int jumlahSKS) {
        this.jumlahSKS = jumlahSKS;
    }
    
    // Override method getGaji
    public int getGaji() {
        return jumlahSKS * TARIF_SKS;
    }
}
