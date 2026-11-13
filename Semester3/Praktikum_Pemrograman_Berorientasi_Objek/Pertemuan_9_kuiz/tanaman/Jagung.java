package tanaman;
public class Jagung extends Tanaman {
    public Jagung() {
        nama = "Jagung";
        pertumbuhan = 0;
        kebutuhanAir = 3;
        kebutuhanPupuk = 4;
        panen = false;
    }

    @Override
    public void tumbuh(Cuaca cuaca) {
        int tambahan = 0;

        switch (cuaca.getKondisi().toLowerCase()) {
            case "hujan" -> tambahan = 15;
            case "cerah" -> tambahan = 12;
            case "panas" -> tambahan = -10;
            case "berawan" -> tambahan = 8;
        }

        pertumbuhan += tambahan;
        if (pertumbuhan >= 100) {
            pertumbuhan = 100;
            panen = true;
        }

        System.out.println("Pertumbuhan Jagung bertambah " + tambahan + "% karena cuaca " + cuaca.getKondisi() + ".");
    }

    @Override
    public void panen() {
        if (panen) System.out.println("🌽 Jagung berhasil dipanen!");
        else System.out.println("Jagung belum siap dipanen.");
    }
}
