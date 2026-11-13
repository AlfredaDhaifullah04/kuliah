package Pertemuan_7;

public class main {
    public static void main(String[] args) {
        System.out.println("Program Testing Class Manager & Staff");
        manager man[] = new manager[2];
        staff staff1[] = new staff[2];
        staff staff2[] = new staff[3];

        // pembuatan manager

        man[0] = new manager();
        man[0].setNama("Tedjo");
        man[0].seNip("101");
        man[0].setGolongan("1");
        man[0].setTunjangan(5000000);
        man[0].setBagian("Administrasi");

        man[1] = new manager();
        man[1].setNama("Atika");
        man[1].seNip("102");
        man[1].setGolongan("1");
        man[1].setTunjangan(2500000);
        man[1].setBagian("Pemasaran");

        staff1[0] = new staff();
        staff1[0].setNama("Usman");
        staff1[0].seNip("003");
        staff1[0].setGolongan("2");
        staff1[0].setLembur(10);
        staff1[0].setGajiLembur(10000);

        staff1[1] = new staff();
        staff1[1].setNama("Anugrah");
        staff1[1].seNip("0005");
        staff1[1].setGolongan("2");
        staff1[1].setLembur(10);
        staff1[1].setGajiLembur(55000);
        // Asumsikan man[0] adalah objek Manager
        man[0].setStaff(staff1);

        staff2[0] = new staff();
        staff2[0].setNama("Hendra");
        staff2[0].seNip("0004");
        staff2[0].setGolongan("3");
        staff2[0].setLembur(15);
        staff2[0].setGajiLembur(5500);

        // Lanjutan dari kode sebelumnya - inisialisasi staff2
        staff2[1] = new staff();
        staff2[1].setNama("Arie");
        staff2[1].seNip("0006");
        staff2[1].setGolongan("4"); // Diperbaiki dari "setSolongan" menjadi "setGolongan"
        staff2[1].setLembur(5);
        staff2[1].setGajiLembur(100000); // Diperbaiki dari "setGajilembur" menjadi "setGajiLembur"

        staff2[2] = new staff();
        staff2[2].setNama("Mentari");
        staff2[2].seNip("0007");
        staff2[2].setGolongan("3"); // Diperbaiki dari "setSolongan" menjadi "setGolongan"
        staff2[2].setLembur(6);
        staff2[2].setGajiLembur(20000); // Diperbaiki dari "setGajilembur" menjadi "setGajiLembur"

        man[1].setStaff(staff2);

        // Cetak informasi dari manager + staffnya
        man[0].lihatInfo();
        man[1].lihatInfo();
    }
}
