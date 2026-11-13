package Pertemuan_2;

public class Persewaan {
    int id;
    String nama;
    String namaGame;
    int harga;
    int lamaSewa;

    public void tampilPeminjaman() {
        System.out.println("Id peminjaman : " + id);
        System.out.println("Nama peminjam : " + nama);
        System.out.println("Nama game     : " + namaGame);
        System.out.println("Harga sewa    : " + harga);
        System.out.println("Lama sewa     : " + lamaSewa);
        System.out.println("---------------------------");
        System.out.println("Total yang harus dibayar : " + (harga*lamaSewa));
    }
}
