    
public class manager extends pegawai {
    private int tunjangan;

    public manager(String nama, int gaji, int tunjangan) {
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }

    public int getTunjangan () {
        return tunjangan;
    }

    @Override
    public int getGaji() {
        // super(gaji);
        return  gaji;
    }
}