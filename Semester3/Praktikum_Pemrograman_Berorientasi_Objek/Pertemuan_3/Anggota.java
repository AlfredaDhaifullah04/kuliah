package Pertemuan_3;

public class Anggota {
    private String nama;
    private String alamat;
    private float simpanan;

    public Anggota(String nm, String almt) {
        nama = nm;
        alamat = almt;
        simpanan = 0;
    }


    public void setNama (String nm) {
        nama = nm;
    }

    public void setAlamat (String almt) {
        alamat = almt;
    }

    public String getNama () {
        return nama;
    } 

    public String getAlmat () {
        return alamat;
    }

    public float getSimpanan () {
        return simpanan;
    }

    public void setor (float uang) {
        simpanan += uang;
    }

    public void pinjam (float uang) {
        simpanan -= uang;
    }
}
