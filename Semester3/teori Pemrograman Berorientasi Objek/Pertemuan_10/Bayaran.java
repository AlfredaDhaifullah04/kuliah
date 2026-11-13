public class Bayaran {
    public int hitungBayaran(pegawai pg) {
        int uang = pg.getGaji();
        if (pg instanceof manager) {
            uang += ((manager) pg).getTunjangan();
        } else if (pg instanceof Programmer) {
            uang += ((Programmer) pg).getBonus();
        }
        return uang;
    }
}