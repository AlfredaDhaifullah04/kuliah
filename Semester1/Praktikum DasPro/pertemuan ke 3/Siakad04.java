import java.util.Scanner;
public class Siakad04 {
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

        System.out.print("NAMA :" + nama +" Nim :" + nim);
        System.out.print("Kelas :" + kelas + " Nomor Absen :" + absen);
        System.out.println(" Nilai Akhir :" + nilaiAkhir);

    }
}
