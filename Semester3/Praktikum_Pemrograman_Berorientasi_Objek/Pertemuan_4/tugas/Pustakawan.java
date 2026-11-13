package Pertemuan_4.tugas;

public class Pustakawan {
    private String id;
    private String nama;
    private String shift;
    
    public Pustakawan(String id, String nama, String shift) {
        this.id = id;
        this.nama = nama;
        this.shift = shift;
    }
    
    public String info() {
        return "ID: " + id + "\nNama: " + nama + "\nShift: " + shift;
    }
    
    public void layaniPinjam(Anggota anggota, Buku buku) {
        System.out.println("Pustakawan " + nama + " melayani peminjaman:");
        anggota.pinjam(buku);
    }
    
    public void layaniKembali(Anggota anggota, Buku buku) {
        System.out.println("Pustakawan " + nama + " melayani pengembalian:");
        anggota.kembalikan(buku);
    }
    
    // Getter methods
    public String getNama() { return nama; }
}
