package Pertemuan_3;
import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input data anggota
        System.out.println("=== INPUT DATA ANGGOTA ===");
        System.out.print("Masukkan Nomor KTP: ");
        String nomorKTP = scanner.nextLine();
        
        System.out.print("Masukkan Nama Anggota: ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan Limit Pinjaman: ");
        double limitPinjaman = scanner.nextDouble();
        
        // Buat objek anggota
        member anggota = new member(nomorKTP, nama, limitPinjaman);
        
        System.out.println("\n=== DATA ANGGOTA ===");
        System.out.println("Nama Anggota: " + anggota.getNama());
        System.out.println("Nomor KTP: " + anggota.getNomorKTP());
        System.out.println("Limit Pinjaman: " + anggota.getLimitPinjaman());
        System.out.println("Jumlah Pinjaman Saat Ini: " + anggota.getJumlahPinjaman());
        
        int pilihan;
        do {
            System.out.println("\n=== MENU KOPERASI ===");
            System.out.println("1. Pinjam Uang");
            System.out.println("2. Angsur Pinjaman");
            System.out.println("3. Lihat Status");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = scanner.nextInt();
            
            switch (pilihan) {
                case 1:
                    System.out.print("\nMasukkan jumlah pinjaman: ");
                    double jumlahPinjam = scanner.nextDouble();
                    anggota.pinjam(jumlahPinjam);
                    break;
                    
                case 2:
                    System.out.print("\nMasukkan jumlah angsuran: ");
                    double jumlahAngsur = scanner.nextDouble();
                    anggota.angsur(jumlahAngsur);
                    break;
                    
                case 3:
                    System.out.println("\n=== STATUS ANGGOTA ===");
                    System.out.println("Nama: " + anggota.getNama());
                    System.out.println("Limit Pinjaman: " + anggota.getLimitPinjaman());
                    System.out.println("Jumlah Pinjaman: " + anggota.getJumlahPinjaman());
                    double minimalAngsuran = anggota.getJumlahPinjaman() * 0.1;
                    System.out.println("Minimal Angsuran: " + minimalAngsuran);
                    break;
                    
                case 4:
                    System.out.println("Terima kasih telah menggunakan sistem koperasi!");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid!");
            }
            
        } while (pilihan != 4);
        
        scanner.close();
    }
}