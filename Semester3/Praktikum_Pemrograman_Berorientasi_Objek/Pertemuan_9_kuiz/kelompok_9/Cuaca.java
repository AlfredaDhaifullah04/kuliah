package UTS;

import java.util.Random;

public class Cuaca {
    private String kondisi; // Cerah, Hujan, Badai
    private Random rand;

    public Cuaca() {
        this.rand = new Random();
        gantiCuaca(); // Inisialisasi cuaca hari pertama
    }

    // Mengganti cuaca secara acak
    public void gantiCuaca() {
        int pilihan = rand.nextInt(3);
        if (pilihan == 0) {
            this.kondisi = "☀️ Cerah";
        } else if (pilihan == 1) {
            this.kondisi = "🌧️ Hujan";
        } else {
            this.kondisi = "⛈️ Badai";
        }
    }

    public String getKondisi() { return kondisi; }
}