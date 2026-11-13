package Pertemuan_4.percobaan3;

public class mainPer3 {
    public static void main (String[]args) {
        pegawai masinis = new pegawai("1234", "Spongebob Squarpants");
        pegawai asisten = new pegawai("4567", "Patrick Star"); 
        keretaApi kereta = new keretaApi("Gayya baru", "Bisnis", masinis, asisten);

        System.out.println("Kereta Api Info : " + kereta.info());
        System.out.println(masinis.info());
        System.out.println(asisten.info());
    }
}
