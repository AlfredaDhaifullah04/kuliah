package tanaman;

public class Pemain {
    private String nama;
    private int uang;
    private int energi;

    public Pemain(String nama, int uang, int energi) {
        this.nama = nama;
        this.uang = uang;
        this.energi = energi;
    }

    public String getNama() {
        return nama;
    }

    public int getUang() {
        return uang;
    }

    public int getEnergi() {
        return energi;
    }

    public void siramTanaman(Tanaman tanaman) {
        System.out.println("💧 Kamu menyiram tanaman...");
        tanaman.tumbuh(new Cuaca("Hujan", 25, 90)); // efek disiram seperti hujan
    }

    public void pupukTanaman(Tanaman tanaman) {
        System.out.println("🌱 Kamu memberi pupuk pada tanaman...");
        tanaman.tumbuh(new Cuaca("Berawan", 27, 70)); // efek pupuk stabil
    }

    public void panenTanaman(Tanaman tanaman) {
        tanaman.panen(
            
        );
        if (tanaman.isPanen()) {
            uang += 50;
            System.out.println("💰 Uang kamu sekarang: " + uang);
        }
    }
}
