package Pertemuan_4.tugas;

import java.util.ArrayList;
import java.util.List;

public class Anggota {
    private String id;
    private String nama;
    private String telp;
    private List<Buku> pinjaman;
    
    public Anggota(String id, String nama, String telp) {
        this.id = id;
        this.nama = nama;
        this.telp = telp;
        this.pinjaman = new ArrayList<>();
    }
    
    public String info() {
        return "ID: " + id + "\nNama: " + nama + 
               "\nTelepon: " + telp + "\nJumlah Pinjaman: " + pinjaman.size();
    }
    
    public void pinjam(Buku buku) {
        if (buku.isTersedia()) {
            buku.pinjam();
            pinjaman.add(buku);
            System.out.println(nama + " berhasil meminjam " + buku.getJudul());
        } else {
            System.out.println("Buku tidak tersedia untuk dipinjam");
        }
    }
    
    public void kembalikan(Buku buku) {
        if (pinjaman.contains(buku)) {
            buku.kembalikan();
            pinjaman.remove(buku);
            System.out.println(nama + " berhasil mengembalikan " + buku.getJudul());
        } else {
            System.out.println("Buku tidak ditemukan dalam daftar pinjaman");
        }
    }
    
    // Getter methods
    public String getId() { return id; }
    public String getNama() { return nama; }
    public List<Buku> getPinjaman() { return pinjaman; }
}
