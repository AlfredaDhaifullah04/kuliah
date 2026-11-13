package kelompok_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameSimulasi {

    public static void main(String[] args) {
        
System.out.println("=============================================================================================================");
System.out.println("||      ______    _    ____   __  __   _   _   _    ____         ____    _    __  __   ______              ||");           
System.out.println("||      |  ___|  / \\  |  _ \\ |  \\/  | | | | \\ | |  / ___|       / ___|  / \\  |  \\/  | |  ___|              ||");
System.out.println("||      | |_    / _ \\ | |_) || |\\/| | | | |  \\| | | |  _       | |  _  / _ \\ | |\\/| | | |_                 ||");
System.out.println("||      |  _|  / ___ \\|  _ < | |  | | | | | . ` | | |_| |      | |_| |/ ___ \\| |  | | |  ___|              ||");
System.out.println("||      |_|   /_/   \\_\\_|\\__\\|_|  |_| |_| |_|\\__|  \\____|       \\____|/_/   \\_\\|_|  |_| |_____|            ||");
System.out.println("=============================================================================================================");
System.out.println();
System.out.println();
System.out.println();

        
        // Inisialisasi Objek Game
        Pemain pemain = new Pemain("Petani Java");
        Waktu waktu = new Waktu();
        Cuaca cuaca = new Cuaca();
        
        // Pemain memiliki 3 lahan
        List<Lahan> daftarLhan = new ArrayList<>();
        daftarLhan.add(new Lahan());
        daftarLhan.add(new Lahan());
        daftarLhan.add(new Lahan());

        Scanner scanner = new Scanner(System.in);
        boolean gameBerjalan = true;

        System.out.println("🌾 Selamat Datang di Simulasi Pertanian Sederhana! 🌾");

        // Game Loop Utama
        while (gameBerjalan) {
            // 1. Tampilkan Status Awal Hari
            System.out.println("\n-------------------------------------------");
            System.out.println("Hari ke-" + waktu.getHari() + " | Musim: " + waktu.getMusim() + " | Cuaca: " + cuaca.getKondisi());
            pemain.tampilkanStatus(); 

            // Tampilkan status semua lahan
            for (int i = 0; i < daftarLhan.size(); i++) {
                Lahan l = daftarLhan.get(i);
                System.out.print("Lahan " + (i + 1) + ": ");
                if (l.getTanaman() != null) {
                    Tanaman t = l.getTanaman();
                    System.out.printf("[%s | Usia: %d/%d | Air: %d | Sehat: %d]\n",
                            t.getNama(), t.getUsia(), t.waktuPanen, t.getLevelAir(), t.getStatusKesehatan());
                } else {
                    System.out.println("[Kosong]");
                }
            }

            // 2. Aksi Pemain dengan Emoji
            System.out.println("\nAksi: ");
            System.out.println("1 Tanam 🌱");
            System.out.println("2 Siram 💧");
            System.out.println("3 Pupuk 🧪");
            System.out.println("4 Panen 🧺"); 
            System.out.println("5 Panen Semua 🧺🧺"); 
            System.out.println("6 Jual Semua 💲");
            System.out.println("7 Tidur/Next Day 🌙");
            System.out.println("0 Keluar 🚪");
            System.out.print("Pilih aksi: ");
            
            try {
                int pilihan = scanner.nextInt();

                if (pilihan == 1) { // Tanam
                    System.out.print("Tanam di Lahan ke- (1-3): ");
                    int l = scanner.nextInt() - 1;
                    // Menambahkan emoji pada pilihan tanaman
                    System.out.print("Pilih Tanaman: (1) 🌾 Padi (2) 🌽 Jagung: ");
                    int t = scanner.nextInt();
                    
                    if (l >= 0 && l < daftarLhan.size()) {
                        Tanaman tanamanBaru = null;
                        if (t == 1) tanamanBaru = new Padi();
                        if (t == 2) tanamanBaru = new Jagung();
                        
                        if(tanamanBaru != null) {
                            pemain.aksiTanam(tanamanBaru, daftarLhan.get(l));
                        }
                    }
                } else if (pilihan == 2) { // Siram
                    System.out.print("Siram Lahan ke- (1-3): ");
                    int l = scanner.nextInt() - 1;
                    if (l >= 0 && l < daftarLhan.size()) {
                        pemain.aksiSiram(daftarLhan.get(l));
                    }
                } else if (pilihan == 3) { // <<< BARU: Pupuk >>>
                    System.out.print("Pupuk Lahan ke- (1-3): ");
                    int l = scanner.nextInt() - 1;
                    if (l >= 0 && l < daftarLhan.size()) {
                        // Lahan memanggil metode pupuk() yang mengarah ke Tanaman.terimaPerawatan("pupuk")
                        daftarLhan.get(l).pupuk(); 
                    }
                } else if (pilihan == 4) { // Panen
                    System.out.print("Panen Lahan ke- (1-3): ");
                    int l = scanner.nextInt() - 1;
                    if (l >= 0 && l < daftarLhan.size()) {
                        pemain.aksiPanen(daftarLhan.get(l)); // Overloading (1)
                    }
                } else if (pilihan == 5) { // Panen Semua
                    pemain.aksiPanen(daftarLhan); // Overloading (2)
                } else if (pilihan == 6) { // <<< BARU: Jual Semua >>>
                    pemain.aksiJualSemuaHasilPanen();
                } else if (pilihan == 7) { // Tidur
                    // Menambahkan emoji pada pesan tidur
                    System.out.println("--- 🌙 Malam Tiba, Anda beristirahat 🌙 ---");
                    pemain.tidur();
                    waktu.hariBerikutnya();
                    cuaca.gantiCuaca();

                    // 3. Simulasi Pertumbuhan (Polymorphism)
                    // Loop ini tidak peduli apa jenis tanamannya (Padi/Jagung),
                    // Java akan otomatis memanggil metode yang sesuai.
                    for (Lahan l : daftarLhan) {
                        l.updateHarian(cuaca);
                    }
                } else if (pilihan == 0) { // Keluar
                    gameBerjalan = false;
                }

            } catch (Exception e) {
                System.out.println("Input tidak valid, coba lagi.");
                scanner.next(); // Membersihkan buffer scanner
            }
        }
        System.out.println("Terima kasih telah bermain!");
        scanner.close();
    }
}