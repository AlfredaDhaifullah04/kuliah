package Pertemuan_3;

public class KoperasiDemo {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("iwan", "jalan mawar");
        System.out.println("Simpanan " + anggota1.getNama() + ": " + anggota1.getSimpanan());
        
        anggota1.setNama("Iwan Setiawan");
        anggota1.setAlamat("Jalan soekarno hatta no 10");
        anggota1.setor(100000);
        System.out.println("Simpanan " + anggota1.getNama() + ": " + anggota1.getSimpanan());

        anggota1.pinjam(5000);
        System.out.println("Simpanan " + anggota1.getNama() + ": " + anggota1.getSimpanan());
    }
}
