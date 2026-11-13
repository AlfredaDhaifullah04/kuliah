package Pertemuan_4.percobaan4;

public class gerbong {
    private String kode;
    private Kursi[] kursi;

    public gerbong(String kd, int jumlah) {
        this.kode = kd;
        this.kursi = new Kursi[jumlah];
        this.iniKursi();
    }

    private void iniKursi() {
        for (int i = 0; i < kursi.length; i++) {
            this.kursi[i] = new Kursi(String.valueOf(i + 1), null);
        }
    }

    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi kursi : this.kursi) {
            info += kursi.info();
        }
        return info;
    }

    public void setPenumpang(penumpang penumpang, int nomor) {

        if (this.kursi[nomor - 1].getPenumpang() == null) {
            this.kursi[nomor - 1].setPenumpang(penumpang);
        } else {
            System.out.println("Kursi nomor " + nomor + " sudah ditempati!");
        }
    }
}
