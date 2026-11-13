package kelompok_9;

public class Lahan implements Perawatan {
    // Relasi: Lahan "HAS-A" Tanaman
    private Tanaman tanaman; 
    private int kesuburan;

    public Lahan() {
        this.tanaman = null;
        this.kesuburan = 80;
    }

    // Polymorphism: Metode ini menerima OBJEK apapun
    // yang merupakan turunan dari Tanaman (Padi, Jagung, dll)
    public void tanam(Tanaman t) {
        if (this.tanaman == null) {
            this.tanaman = t;
            System.out.println(t.getNama() + " berhasil ditanam.");
        } else {
            System.out.println("Lahan ini sudah terisi " + tanaman.getNama() + ".");
        }
    }
    
    // Metode untuk update harian (pertumbuhan dan cuaca)
    public void updateHarian(Cuaca cuaca) {
        if (tanaman != null) {
            // Polymorphism: 
            // Memanggil metode 'tumbuh' dari Tanaman,
            // dan 'terpengaruhCuaca' (Padi/Jagung)
            tanaman.tumbuh();
            tanaman.terpengaruhCuaca(cuaca);
        }
    }

    // Implementasi metode dari interface Perawatan
    @Override
    public void siram() {
        if (tanaman != null) {
            tanaman.terimaPerawatan("siram");
        } else {
            System.out.println("Lahan kosong, tidak perlu disiram.");
        }
    }

    @Override
    public void pupuk() {
        if (tanaman != null) {
            tanaman.terimaPerawatan("pupuk");
        } else {
            System.out.println("Lahan kosong, tidak perlu dipupuk.");
        }
    }

    @Override
    public void basmiHama() {
        if (tanaman != null) {
            tanaman.terimaPerawatan("basmi_hama");
        }
    }
    
    public HasilPanen panenTanaman() {
        if (tanaman != null && tanaman.isSiapPanen()) {
            HasilPanen hasil = tanaman.panen();
            System.out.println("Berhasil memanen " + hasil.getJumlah() + " " + hasil.getNama());
            this.tanaman = null; // Lahan kembali kosong
            return hasil;
        } else if (tanaman != null) {
            System.out.println(tanaman.getNama() + " belum siap panen.");
        } else {
            System.out.println("Lahan ini kosong.");
        }
        return null;
    }
    
    // Getter
    public Tanaman getTanaman() { 
        return tanaman; 
    }
}