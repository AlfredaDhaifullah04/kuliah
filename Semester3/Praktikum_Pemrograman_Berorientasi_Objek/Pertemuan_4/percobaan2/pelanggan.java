package Pertemuan_4.percobaan2;

public class pelanggan {
    
    private String nama;
    private int hari;
    private Mobil mobil;
    private sopir sopir;

    public pelanggan () {

    }

    public void setNama (String nm) {
        nama = nm;
    }

    public String getNama () {
        return nama;
    }

    public void setMobil (Mobil mbl) {
        mobil = mbl;
    }

    public Mobil getMobil () {
        return mobil;
    }

    public void setHari (int hr) {
        hari = hr;
    }

    public int getHari () {
        return hari;
    }

    public void setSopir (sopir spr) {
        sopir = spr;
    }

    public sopir getSopir () {
        return sopir;
    }

    public int hitungBiayaTotal () {
        return mobil.hitungBiayaMobil(hari) + 
        sopir.hitungBayarSopir(hari);
    }


}
