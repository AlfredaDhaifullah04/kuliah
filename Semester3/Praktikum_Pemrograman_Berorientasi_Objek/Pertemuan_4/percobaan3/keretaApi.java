package Pertemuan_4.percobaan3;

public class keretaApi {
    private String nama;
    private String kelas;
    private pegawai masinis;
    private pegawai asisten;

    public keretaApi (String nama, String kelas, pegawai masinis) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
    }

    public keretaApi (String nama, String kelas, pegawai masinis, pegawai asisten) {
        this.nama = nama;
        this.kelas = kelas;
        this.asisten = asisten;
        this.masinis = masinis;
    }

    // method getting dan setter untuk nama
    public void setNama (String nm) {
        nama = nm;
    }

    public String getNama () {
        return nama;
    }

    //method getting dan setter untuk kelas
    public void setKelas (String kelas) {
        this.kelas=kelas;
    }

    public String getKelas () {
        return kelas;
    }

    // method getting dan setter untuk pegawai
    public void setMasinis(pegawai peg) {
        masinis = peg;
    } 

    public pegawai getMasinis() {
        return masinis;
    }

    public void setAsisten (pegawai asis) {
        asisten = asis;
    }

    public String info() {
        String info = "";
        info += "Nama : " + this.nama + "\n";
        info += "kelas : " + this.kelas+ "\n";
        info += "Masinis: " + this.masinis.info()+ "\n";
        info += "Masinis: " + this.asisten.info()+ "\n";
        return  info;
    }
}
