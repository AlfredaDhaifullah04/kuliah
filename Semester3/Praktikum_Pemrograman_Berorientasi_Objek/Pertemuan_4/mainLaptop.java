package Pertemuan_4;

public class mainLaptop {
    public static void main(String[] args) {
        Processor p = new Processor("Intel i5", 3);

        Laptop l = new Laptop();
        l.Laptop("Thinkpad", p);
        l.info();

        //Laptop l3 = new Laptop("Thinkpad", new Processor("Intel i5",3));

        Processor p1 = new Processor();
        p1.setMerk("intel i5");
        p1.setChace(4);

        Laptop L1 = new Laptop();
        L1.setMerk("ThinkPad");
        L1.setProc(p1);
        L1.info();
    }
}
