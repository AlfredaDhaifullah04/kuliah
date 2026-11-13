package Pertemuan_4.percobaan4;

public class main {
    public static void main(String[] args) {

        penumpang p = new penumpang("12345", "Mr. Crab");
        penumpang p1 = new penumpang("123456", "Mr. swuid");
        penumpang budi = new penumpang("Bud", "98765");
        gerbong ger = new gerbong("A", 10);

        ger.setPenumpang(p,1);
        ger.setPenumpang(budi, 1);
        ger.setPenumpang(p1,2);
        System.out.println(ger.info());
    }
}
