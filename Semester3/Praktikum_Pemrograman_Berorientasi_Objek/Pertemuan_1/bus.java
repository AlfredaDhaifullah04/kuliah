public class bus extends kendaraan {
    int jumlahPintu;
    String bahanBakar;
    int kapasitas;

    public void setPintu (int value) {
        jumlahPintu = value;
    }

    public void setBBM (String value) {
        bahanBakar = value;
    }
    public void setKapac (int value) {
        kapasitas = value;
    }

    public void cetak() {
        super.cetak();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
        System.out.println("Bahan bakar: " + bahanBakar);
        System.out.println("Kapasitas: " + kapasitas);
    }
}
