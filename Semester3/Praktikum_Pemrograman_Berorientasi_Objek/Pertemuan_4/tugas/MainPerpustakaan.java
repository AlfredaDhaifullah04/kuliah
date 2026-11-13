package Pertemuan_4.tugas;

public class MainPerpustakaan {
    public static void main(String[] args) {
        // Membuat pustakawan
        Pustakawan pustakawan = new Pustakawan("P001", "Budi Santoso", "Pagi");
        
        // Membuat perpustakaan
        Perpustakaan perpustakaan = new Perpustakaan("Perpustakaan Nasional", "Jl. Merdeka No. 1", pustakawan);
        
        // Menambah buku
        Buku buku1 = new Buku("ISBN001", "Pemrograman Java", "James Gosling");
        Buku buku2 = new Buku("ISBN002", "Struktur Data", "Robert Lafore");
        Buku buku3 = new Buku("ISBN003", "Algoritma", "Thomas Cormen");
        
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);
        
        // Mendaftarkan anggota
        Anggota anggota1 = new Anggota("A001", "Alice", "08123456789");
        Anggota anggota2 = new Anggota("A002", "Bob", "08129876543");
        
        perpustakaan.daftarAnggota(anggota1);
        perpustakaan.daftarAnggota(anggota2);
        
        // Menampilkan info perpustakaan
        System.out.println("=== INFO PERPUSTAKAAN ===");
        System.out.println(perpustakaan.info());
        System.out.println();
        
        // Proses peminjaman
        System.out.println("=== PROSES PEMINJAMAN ===");
        perpustakaan.layaniPinjaman("A001", "ISBN001");
        perpustakaan.layaniPinjaman("A001", "ISBN002");
        System.out.println();
        
        // Proses pengembalian
        System.out.println("=== PROSES PENGEMBALIAN ===");
        perpustakaan.layaniPengembalian("A001", "ISBN001");
        System.out.println();
        
        // Menampilkan info anggota
        System.out.println("=== INFO ANGGOTA ===");
        System.out.println(anggota1.info());
        System.out.println();
        
        // Menampilkan info buku
        System.out.println("=== INFO BUKU ===");
        System.out.println(buku1.info());
    }
}
