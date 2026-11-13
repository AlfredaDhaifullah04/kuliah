public class TestBayaran {
    public static void main(String[] args) {
        manager man = new manager("Agus", 800, 50);
        Programmer prog = new Programmer("Budi", 600, 30);
        Bayaran hr = new Bayaran();

        System.out.println("Bayaran manager: " + hr.hitungBayaran(man));
        System.out.println("Bayaran programmer: " + hr.hitungBayaran(prog));
    }
}