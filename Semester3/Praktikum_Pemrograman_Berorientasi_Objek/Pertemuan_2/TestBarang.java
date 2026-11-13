package Pertemuan_2;

public class TestBarang {
    public static void main(String[]args) {
        Barang brg1 = new Barang();
        brg1.namaBarang = "Pensil";
        brg1.jenisBarang = "ATK";
        brg1.stok = 10;
        brg1.tampilBarang();
        // menampilkan dan mengisi argumen untuk menambahkan stok barang
        System.out.println("Stok Baru adalah : " + brg1.tambahStok(20));
    }
}
