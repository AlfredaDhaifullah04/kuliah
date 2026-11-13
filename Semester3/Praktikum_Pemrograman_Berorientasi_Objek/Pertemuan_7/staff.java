package Pertemuan_7;

public class staff extends karyawan {
    private int lembur;
    private double gajiLembur;

    public void setLembur (int lembr) {
        lembur = lembr;
    }

    public int getLembur () {
        return lembur;
    }
    
    public void setGajiLembur (double gajilmbr) {
        gajiLembur = gajilmbr;
    }

    public double getGajiLembur() {
        return gajiLembur;
    }

    // overloading
    public double getGaji(int lembur, double gajiLembur) {
        return super.getGaji() +lembur*gajiLembur;
    }

    //overrriding
    public double getGaji() {
        return super.getGaji()+lembur*gajiLembur;
    }

    public void lihatInfo() {
        System.out.println("NIP: " + this.getNip());
        System.out.println("Nama  : " +this.getNama());
        System.out.println("Golongan : " + this.getGolongan());
        System.out.println("Jml Lembur : " + this.getGajiLembur());
        System.out.println("Gaji : " + this.getGaji());
    }
}
