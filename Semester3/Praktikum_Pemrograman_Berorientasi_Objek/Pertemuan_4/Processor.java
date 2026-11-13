package Pertemuan_4;

public class Processor {
    private String merk;
    private double cache;

    //konstruktor 
    public Processor () {

    }

    // konstruktor berparameter
    public Processor (String mer, double cha) {
        merk = mer;
        cache = cha;
    }

    public void setMerk (String newMerk) {
        merk = newMerk;
    }

    public void setChace (double newCha) {
        cache = newCha;
    }

    public String getProcessor () {
        return merk;
    }

    public double getCache () {
        return cache;
    }

    // method untuk menampilkan info 
    public void info() {
        System.out.println("Merk Processor :" + merk);
        System.out.println("Cache memory : " + cache);
    }
}
