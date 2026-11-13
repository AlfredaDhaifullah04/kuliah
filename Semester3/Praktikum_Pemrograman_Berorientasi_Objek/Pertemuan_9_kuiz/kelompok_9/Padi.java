package kelompok_9;

public class Padi extends Tanaman {

    public Padi() {
        super("🌾Padi", 10); // Padi butuh 10 hari untuk panen
    }

    // Overriding metode abstract dari Tanaman
    @Override
    public void terpengaruhCuaca(Cuaca cuaca) {
        if (cuaca.getKondisi().equals("🌧️ Hujan")) {
            // Padi suka hujan
            this.levelAir = Math.min(100, this.levelAir + 30);
        } else if (cuaca.getKondisi().equals("☀️  Cerah")) {
            // Cerah membuat padi cepat haus
            this.levelAir -= 10;
        }
    }
}
