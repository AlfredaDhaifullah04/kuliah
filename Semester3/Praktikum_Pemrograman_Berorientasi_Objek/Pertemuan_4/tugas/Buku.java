package Pertemuan_4.tugas;

public class Buku {
    private String isbn;
    private String judul;
    private String penulis;
    private boolean tersedia;
    
    public Buku(String isbn, String judul, String penulis) {
        this.isbn = isbn;
        this.judul = judul;
        this.penulis = penulis;
        this.tersedia = true;
    }
    
    public String info() {
        String status = tersedia ? "Tersedia" : "Dipinjam";
        return "ISBN: " + isbn + "\nJudul: " + judul + 
               "\nPenulis: " + penulis + "\nStatus: " + status;
    }
    
    public void pinjam() {
        if (tersedia) {
            tersedia = false;
            System.out.println("Buku " + judul + " berhasil dipinjam");
        } else {
            System.out.println("Buku " + judul + " sedang tidak tersedia");
        }
    }
    
    public void kembalikan() {
        tersedia = true;
        System.out.println("Buku " + judul + " berhasil dikembalikan");
    }
    
    // Getter methods
    public String getIsbn() { return isbn; }
    public String getJudul() { return judul; }
    public boolean isTersedia() { return tersedia; }
}
