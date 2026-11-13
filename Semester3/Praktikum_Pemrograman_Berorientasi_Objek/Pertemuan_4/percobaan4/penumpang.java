package Pertemuan_4.percobaan4;

public class penumpang {
    private String ktp;
    private String nama;

    public penumpang (String nm, String ktp) {
        nama = nm;
        this.ktp = ktp;
    } 

    // method setter dan getter untuk ktp 
    public void setKtp (String ktp) {
        this.ktp =ktp;
    }

    public String getKto () {
        return ktp;
    }

    //method setter dan getter untuk nama
    public void setNama (String nama) {
        this.nama = nama;
    }

    public String getNama (String nm) {
        return nama;
    }

    public String info() {
        String info = "";
        info += "ktp: " + ktp + "\n";
        info += "Nama: " + nama + "\n";
        return info;
    }
}
