package Pertemuan_4.percobaan2;

public class Mobil {
    private String merk;
    private int biaya;

    public Mobil () {
        
    }

    public void setMerk (String newMer) {
        merk = newMer;
    }

    public void setBiaya (int biay) {
        biaya = biay;
    }

    public String getMerk() {
        return merk;
    }

    public int getBiaya() {
        return biaya;
    }

    //method menghitung biaya mobil
    public int hitungBiayaMobil (int hari) {
        return biaya * hari;
    }
}
