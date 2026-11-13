package Pertemuan_4.tugas;

import java.util.ArrayList;
import java.util.List;

public class Perpustakaan {
    private String nama;
    private String alamat;
    private List<Buku> buku;
    private List<Anggota> anggota;
    private Pustakawan pustakawan;
    
    public Perpustakaan(String nama, String alamat, Pustakawan pustakawan) {
        this.nama = nama;
        this.alamat = alamat;
        this.pustakawan = pustakawan;
        this.buku = new ArrayList<>();
        this.anggota = new ArrayList<>();
    }
    
    public String info() {
        return "Perpustakaan: " + nama + "\nAlamat: " + alamat + 
               "\nJumlah Buku: " + buku.size() + 
               "\nJumlah Anggota: " + anggota.size() +
               "\nPustakawan: " + pustakawan.getNama();
    }
    
    public void tambahBuku(Buku bukuBaru) {
        buku.add(bukuBaru);
        System.out.println("Buku " + bukuBaru.getJudul() + " berhasil ditambahkan");
    }
    
    public void daftarAnggota(Anggota anggotaBaru) {
        anggota.add(anggotaBaru);
        System.out.println("Anggota " + anggotaBaru.getNama() + " berhasil didaftarkan");
    }
    
    public void layaniPinjaman(String idAnggota, String isbnBuku) {
        Anggota anggota = cariAnggota(idAnggota);
        Buku buku = cariBuku(isbnBuku);
        
        if (anggota != null && buku != null) {
            pustakawan.layaniPinjam(anggota, buku);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
    
    public void layaniPengembalian(String idAnggota, String isbnBuku) {
        Anggota anggota = cariAnggota(idAnggota);
        Buku buku = cariBuku(isbnBuku);
        
        if (anggota != null && buku != null) {
            pustakawan.layaniKembali(anggota, buku);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
    
    private Anggota cariAnggota(String id) {
        for (Anggota a : anggota) {
            if (a.getId().equals(id)) {
                return a;
            }
        }
        return null;
    }
    
    private Buku cariBuku(String isbn) {
        for (Buku b : buku) {
            if (b.getIsbn().equals(isbn)) {
                return b;
            }
        }
        return null;
    }
    
    // Getter methods
    public List<Buku> getBuku() { return buku; }
    public List<Anggota> getAnggota() { return anggota; }
}
