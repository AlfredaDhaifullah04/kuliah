public class motor extends kendaraan {
    int currentGir;
    String bahanBakar;

    public void gantiGir(int newGir) {
        currentGir = newGir;
    }

    public void setBBM (String value) {
        bahanBakar = value;
    }

    public void cetak() {
        super.cetak();
        System.out.println("Gir Saat ini: " + currentGir);
        System.out.println("Bahan bakar: " + bahanBakar);
    }
}
