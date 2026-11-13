package Pertemuan_2;

public class Lingkaran {
    double phi;
    double r;

    public double hitungLuas() {
        double luas = phi * r * r;
        return luas;
    }

    public double hitungKeliling () {
        double kel = 2*phi*r;
        return kel;
    }
}
