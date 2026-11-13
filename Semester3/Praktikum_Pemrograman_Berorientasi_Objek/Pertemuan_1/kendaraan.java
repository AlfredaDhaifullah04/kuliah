public class kendaraan {
    int kecepatan;
    int jumlahRoda;
    String warna;

    public void plusSpeed(int tambah) {
        kecepatan = kecepatan + tambah;
    }

    public void minusSpeed(int kurang) {
        kecepatan = kecepatan - kurang;
    }

    public void jumlahRoda (int value) {
        jumlahRoda = jumlahRoda+value;
    }

    public void setwarna (String warn) {
        warna = warn;
    }

    public void cetak() {
        System.out.println("Kecepatan: " + kecepatan);
        System.out.println("Jumlah Roda: " + jumlahRoda);
        System.out.println("Warna: " + warna);
    }
}
