package Pertemuan_4.percobaan2;

public class mainCoba {
    public static void main (String[]args) {
        Mobil m = new Mobil();
        m.setMerk("Avanza");
        m.setBiaya(350000);

        sopir s = new sopir();
        s.setNama("John Doe");
        s.setBiaya(200000);

        pelanggan p = new pelanggan();
        p.setNama("jahn Doe");
        p.setMobil(m);
        p.setSopir(s);
        p.setHari(2);

        System.out.println("Biaya total = " + p.hitungBiayaTotal());
        System.out.println(p.getMobil().getMerk());
    }
}
