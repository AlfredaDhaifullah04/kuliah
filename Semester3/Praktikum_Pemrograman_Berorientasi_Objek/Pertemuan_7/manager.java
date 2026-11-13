package Pertemuan_7;

public class manager extends karyawan {
    private double tunjangan;
    private String bagian;
    private staff st[];

    public void setTunjangan (double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public double getTunjangan () {
        return tunjangan;
    }

    public void setBagian (String bagian) {
        this.bagian = bagian;
    }

    public String getBagian () {
        return bagian;
    }

    public void setStaff(staff st[]) {
        this.st = st;
    }

    public void viewStaff () {
        int i;
        System.out.println("---------------------------");
        for (i = 0; i < st.length;i++) {
            st[i].lihatInfo();
        }
    }

    public void lihatInfo () {
        System.out.println("Manager : " + this.getBagian());
        System.out.println("NIP : " + this.getNip());
        System.out.println("nama : " + this.getNama());
        System.out.println("Golongan : " + this.getGolongan());
        System.out.println("Tunjangan : " + getTunjangan());
        System.out.println("Gaji : " + this.getGaji());
        System.out.println("Bagian : " + this.getBagian());
        this.viewStaff();
    }

    public double getGaji() {
        return super.getGaji()+tunjangan;
    }
}
