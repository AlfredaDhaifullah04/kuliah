package Pertemuan_6;
public class Main {
    public static void main(String[] args) {
        // Membuat daftar gaji dengan kapasitas 3 pegawai
        daftarGaji daftarGaji = new daftarGaji(3);
        
        // Membuat objek dosen
        dosen dosen1 = new dosen("001", "Dr. Ahmad", "Jl. Merdeka No.1");
        dosen1.setSKS(12); // Mengatur jumlah SKS
        
        dosen dosen2 = new dosen("002", "Prof. Sari", "Jl. Sudirman No.2");
        dosen2.setSKS(15);
        
        // Menambah pegawai ke daftar gaji
        daftarGaji.addPegawai(dosen1);
        daftarGaji.addPegawai(dosen2);
        
        // Mencetak semua gaji
        daftarGaji.printSemuaGaji();
    }
}
