package Pertemuan_4.percobaan3;

public class pegawai {
    private String nip;
    private String nama;

    public pegawai (String nip, String nm) {
        this.nip = nip;
        nama = nm;
    }

    // method setter dan getter untuk nip
    public void setNip (String niep) {
        nip = niep;
    }

    public String getNip () {
        return nip;
    }

    // method setter dan getter untuk nama
    public void setNama (String nm) {
        nama = nm;
    }

    public String getNama () {
        return nama;
    }

    //method info
    public String info() { String info = "";
        info += "Nip: " + this.nip + "\n";
        info += "Nama: " + this.nama + "\n";
        return info;
    }
}
