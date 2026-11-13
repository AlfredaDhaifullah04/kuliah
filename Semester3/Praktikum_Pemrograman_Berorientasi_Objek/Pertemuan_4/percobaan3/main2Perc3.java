package Pertemuan_4.percobaan3;

public class main2Perc3 {
    public static void main(String[] args) {
        pegawai masinis = new pegawai("1234", "Sponsbob Squarepants");
        pegawai asisten = new pegawai("5432", "cihua hua");
        keretaApi keretaApi = new keretaApi("Gaya baru", "Bisnis", masinis,asisten);

        System.out.println(keretaApi.info());
    }
}
