package Pertemuan_2;

public class TestMahasiswa {
    public static void main (String[]args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat= "jl. Vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = 102;
        mhs2.nama = "jurmaluddin";
        mhs2.alamat= "jl. soekarno hatta No 1A";
        mhs2.kelas = "1B";
        mhs2.tampilBiodata();

        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim = 103;
        mhs3.nama = "Syawaluddinar";
        mhs3.alamat= "jl. Kawi atas No 1A";
        mhs3.kelas = "1B";
        mhs3.tampilBiodata();
        
    }
}
