public class Instruktur extends User {
    private String bidang;

    public Instruktur(String nama, String email, String bidang) {
        super(nama, email);
        this.bidang = bidang;
    }

    public void setBidang(String bidang) {
        this.bidang= bidang;
    }

    public String getKeahlian() {
        return bidang;
    }

    public String info() {
        return super.info() + " | bidang: " + bidang;
    }
    
}
