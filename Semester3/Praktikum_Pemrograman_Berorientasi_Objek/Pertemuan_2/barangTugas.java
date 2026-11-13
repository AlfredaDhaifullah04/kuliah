package Pertemuan_2;

public class barangTugas {
    String kode;
    String namaBarang;
    int hargaDasar;
    double diskon;

    public void tampilkanData () {
        System.out.println("kode : " +kode);
        System.out.println("Nama barang : " + namaBarang);
        System.out.println("Harga dasar : " + hargaDasar);
        System.out.println("Diskon yang didapat : " + diskon);
        System.out.println("-----------------------");
        System.out.println("harga yang harus dibayarkan : " + hitungHargaJual());
    }

    public double hitungHargaJual() {
        double hargaJual = hargaDasar - (diskon * hargaDasar);
        return hargaJual;
    }

    public static void main(String[] args) {
        barangTugas brg = new barangTugas();
        brg.kode = "1ER23";
        brg.namaBarang = "Spare Part";
        brg.hargaDasar = 400000;
        brg.diskon = 0.05;
        brg.tampilkanData();
    }
}
