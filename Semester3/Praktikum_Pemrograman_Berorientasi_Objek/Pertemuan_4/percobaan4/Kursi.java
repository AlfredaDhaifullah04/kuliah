package Pertemuan_4.percobaan4;

public class Kursi {
    private String nomor;
    private penumpang penumpang;

    public Kursi (String nmr, penumpang penumpang) {
        nomor = nmr;
        this.penumpang = penumpang;
    }
    
    public void setNomor (String nomr) {
        nomor = nomr;
    }

    public String getNomor () {
        return nomor;
    }

    public void setPenumpang (penumpang penum) {
        penumpang = penum;
    }

    public penumpang getPenumpang () {
        return penumpang;
    }

    public String info () {
        String info = "";
        info += " Ktp:" + nomor + "";
        if (this.penumpang != null) {
            info += " Nama: " + penumpang.info()+ "\n";
        }
        info += "\n";
        return info;
    }

}
