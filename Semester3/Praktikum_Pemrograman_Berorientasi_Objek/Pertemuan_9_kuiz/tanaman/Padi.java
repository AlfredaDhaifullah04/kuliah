package tanaman;

public class Padi extends Tanaman {
    public Padi() {
        nama = "Padi";
        pertumbuhan = 0;
        kebutuhanAir = 5;
        kebutuhanPupuk = 3;
        panen = false;
    }

    @Override
    public void tumbuh(Cuaca cuaca) {
        int tambahan = 0;

        switch (cuaca.getKondisi().toLowerCase()) {
            case "hujan" -> tambahan = 20;
            case "cerah" -> tambahan = 10;
            case "panas" -> tambahan = -5;
            case "berawan" -> tambahan = 5;
        }

        pertumbuhan += tambahan;
        if (pertumbuhan >= 100) {
            pertumbuhan = 100;
            panen = true;
        }

        System.out.println("Pertumbuhan Padi bertambah " + tambahan + "% karena cuaca " + cuaca.getKondisi() + ".");
    }

    @Override
    public void panen() {
        if (panen) System.out.println("🌾 Padi berhasil dipanen!");
        else System.out.println("Padi belum siap dipanen.");
    }
}
