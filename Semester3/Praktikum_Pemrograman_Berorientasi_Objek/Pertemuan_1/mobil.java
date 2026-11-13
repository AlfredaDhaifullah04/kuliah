public class mobil extends kendaraan {

    int jumlahPintu;
    String tipeMesin;
    String bahanBakar;

    public void setPintu (int value) {
        jumlahPintu += value;
    }

    public void setMesin (String value) {
        tipeMesin = value;
    }
    public void SetBBM (String value) {
        bahanBakar = value;
    }

    public void cetak() {
        super.cetak();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
        System.out.println("Tipe Mesin: " + tipeMesin);
    }

}
