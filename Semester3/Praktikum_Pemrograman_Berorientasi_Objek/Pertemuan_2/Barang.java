package Pertemuan_2;

public class Barang {
    public String namaBarang;
    public String jenisBarang;
    public int stok;

    public void tampilBarang() {
        System.out.println("Nama Barang  : " + namaBarang);
        System.out.println("Jenis Barang : " + jenisBarang);
        System.out.println("Stok       : " + stok);
    }

    public int tambahStok (int value) {
        int stokbaru = stok + value;
        return stokbaru;
    }
}
