package Pertemuan_4;

public class Laptop {
    private String merk;
    private Processor proc;

    public Laptop () {
        
    }

    public void Laptop (String mrk, Processor pro) {
        merk = mrk;
        proc = pro;
    }

    public void setMerk (String mrk) {
        merk = mrk;
    }

    public void setProc (Processor pr) {
        proc = pr;
    }

    public void info () {
        System.out.println("Merk Laptop = " + merk);
        proc.info();
    }
}
