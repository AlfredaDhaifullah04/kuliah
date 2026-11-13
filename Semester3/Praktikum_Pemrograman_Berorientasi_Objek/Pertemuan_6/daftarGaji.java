package Pertemuan_6;

public class daftarGaji {
    private pegawai[] listPegawai;
    private int jumlahPegawai;
    
    // Konstruktor
    public daftarGaji(int kapasitas) {
        listPegawai = new pegawai[kapasitas];
        jumlahPegawai = 0;
    }
    
    // Method untuk menambah pegawai
    public void addPegawai(pegawai pegawai) {
        if (jumlahPegawai < listPegawai.length) {
            listPegawai[jumlahPegawai] = pegawai;
            jumlahPegawai++;
        } else {
            System.out.println("Kapasitas daftar gaji penuh!");
        }
    }
    
    // Method untuk mencetak semua gaji
    public void printSemuaGaji() {
        System.out.println("DAFTAR GAJI PEGAWAI");
        System.out.println("====================");
        
        for (int i = 0; i < jumlahPegawai; i++) {
            pegawai pegawai = listPegawai[i];
            System.out.println("Nama: " + pegawai.getNama());
            System.out.println("Gaji: Rp " + pegawai.getGaji());
            System.out.println("-------------------");
        }
    }
}
