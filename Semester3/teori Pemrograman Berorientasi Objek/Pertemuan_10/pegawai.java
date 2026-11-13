public class pegawai {
    protected String nama;
    protected int gaji;

    public pegawai() {
        
    }

    public pegawai(String nama, int gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public int getGaji() {
        return gaji;
    }
}