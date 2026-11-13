package Pertemuan_4.percobaan2;

public class sopir {
    private String nama;
    private int biaya;

    public sopir () {

    }

    public void setNama (String nm) {
        nama = nm;
    }

    public String getNama () {
        return nama;
    }

    public void setBiaya (int biay) {
        biaya = biay;
    }

    public int getBiaya () {
        return biaya;
    }

    public int hitungBayarSopir (int hari) {
        return biaya * hari;
    }
}
