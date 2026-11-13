// File: Waktu.java
package Kelompok_9;

public class Waktu {
    private int hari;
    private String musim;

    public Waktu() {
        this.hari = 1;
        this.musim = "Kemarau";
    }

    public void hariBerikutnya() {
        this.hari++;
        // Ganti musim setiap 15 hari (contoh)
        if (hari % 15 == 0) {
            this.musim = this.musim.equals("Kemarau") ? "Hujan" : "Kemarau";
            System.out.println("Musim berganti menjadi " + this.musim);
        }
    }

    public int getHari() { return hari; }
    public String getMusim() { return musim; }
}