package Pertemuan_ke_5;
import java.util.Scanner;
public class SiakadKedua04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String nama,nim;
        String kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUAS, nilaiUTS ,nilaiAkhir;

        System.out.print("Masukan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukan nim: ");
        nim = sc.nextLine();
        System.out.print("masukan kelas: ");
        kelas = sc.nextLine();
        System.out.print("Masukan nomor absen: ");
        absen = sc.nextByte();

        System.out.print("Masukan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukan nilai UAS: ");
        nilaiUAS = sc.nextDouble();
        System.out.print("Masukan nilai UTS: ");
        nilaiUTS = sc.nextDouble();

        nilaiAkhir = (nilaiKuis * 0.20) + (nilaiTugas * 0.15) + (nilaiUTS * 0.30) + (nilaiUAS * 0.35); 

        double nilaiSetara = 0;
        String nilaiHuruf = "" ;
        String kualifikasi = "";

        if (nilaiAkhir <= 39  ) {
            nilaiSetara = 0;
            nilaiHuruf = "E";
            kualifikasi = "Gagal";
        } else if (nilaiAkhir >= 39 && nilaiAkhir <= 50) {
            nilaiSetara = 1;
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
        } else if (nilaiAkhir >= 51 && nilaiAkhir <= 60) {
            nilaiSetara = 2;
            nilaiHuruf = "c";
            kualifikasi = "Cukup";
        } else if (nilaiAkhir >= 61 && nilaiAkhir <=65) {
            nilaiSetara = 2.5;
            nilaiHuruf = "C+";
            kualifikasi = "lebih dari cukup";
        } else if (nilaiAkhir >=66 && nilaiAkhir <=73) {
            nilaiSetara = 3;
            nilaiHuruf = "B";
            kualifikasi = "Baik";
        } else if (nilaiAkhir >=74 && nilaiAkhir <=80) {
            nilaiSetara = 3.5;
            nilaiHuruf = "B+";
            kualifikasi = "Lebih dari Baik";
        } else if (nilaiAkhir >=81 && nilaiAkhir <= 100) {
            nilaiSetara = 4;
            nilaiHuruf = "A";
            kualifikasi = "Sangat Baik";
        } 

        System.out.println("Mahasiswa dengan nama: " + nama + "(" + "Nim :" + nim + ")" + " kelas: " + kelas +" Nomor Absen: " + absen);
        System.out.println("Nilai Akhir :" + nilaiAkhir);
        System.out.println("Nilai setara: " + nilaiSetara);
        System.out.println("Nilai Akhir dalam Huruf: " + nilaiHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);

    }
}
