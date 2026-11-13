package Pertemuan_6;
public class pegawai {
    protected String nip;
    protected String nama;
    protected String alamat;
    
    // Konstruktor
    public pegawai(String nip, String nama, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }
    
    // Getter nama
    public String getNama() {
        return nama;
    }
    
    // Method getGaji (akan dioverride oleh subclass)
    public int getGaji() {
        return 0; // Default value, akan dioverride
    }
}
