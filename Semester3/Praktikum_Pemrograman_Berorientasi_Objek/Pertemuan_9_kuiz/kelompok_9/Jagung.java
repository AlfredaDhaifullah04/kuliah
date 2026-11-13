package kelompok_9;

public class Jagung extends Tanaman {

    public Jagung() {
        super("Jagung", 8); // Jagung butuh 8 hari untuk panen
    }

    // Overriding metode abstract dari Tanaman
    @Override
    public void terpengaruhCuaca(Cuaca cuaca) {
        if (cuaca.getKondisi().equals("🌧️ Hujan")) {
            // Jagung tidak terlalu suka banyak air
            this.levelAir = Math.min(100, this.levelAir + 10);
        } else if (cuaca.getKondisi().equals("⛈️ Badai")) {
            // Jagung rentan terhadap badai
            this.statusKesehatan -= 25;
            System.out.println("⛈️ Badai merusak Jagung!");
        }
    }
}