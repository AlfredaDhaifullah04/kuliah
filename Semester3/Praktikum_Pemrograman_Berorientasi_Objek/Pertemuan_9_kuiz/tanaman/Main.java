package tanaman;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("===\uD83C\uDF31 SIMULASI PERTANIAN ===");
        System.out.print("Masukkan nama pemain: ");
        String namaPemain = input.nextLine();

        Pemain pemain = new Pemain(namaPemain, 100, 50);
        Lahan lahan = new Lahan("Lahan Subur", 100, "Tanah Liat");
        Cuaca cuaca = new Cuaca("Cerah", 30, 60);

        System.out.println("\nSelamat datang, " + pemain.getNama() + "!");
        System.out.println("Kamu memiliki uang: " + pemain.getUang() + " dan energi: " + pemain.getEnergi());
        System.out.println("------------------------------------");

        Tanaman tanaman = pilihTanaman(input, lahan);

        boolean lanjut = true;
        int hari = 1;

        while (lanjut) {
            System.out.println("\u2600\uFE0F  Hari ke-" + hari);
            System.out.println("Cuaca saat ini: " + cuaca.getKondisi());
            System.out.println("Suhu: " + cuaca.getSuhu() + "°C | Kelembapan: " + cuaca.getKelembapan() + "%");
            System.out.println("Status tanaman: " + tanaman.getStatus() + " (" + tanaman.getPertumbuhan() + "% tumbuh)");

            System.out.println("""
                Pilih aksi:
                1. Siram Tanaman
                2. Pemupukan
                3. Tunggu Hari Berikutnya (Cuaca akan berubah acak)
                4. Panen
                5. Keluar
                """);
            System.out.print("Masukkan pilihan: ");
            int aksi = input.nextInt();
            input.nextLine();

            switch (aksi) {
                case 1 -> pemain.siramTanaman(tanaman);
                case 2 -> pemain.pupukTanaman(tanaman);
                case 3 -> {
                    hari++;
                    // 🔹 Ubah cuaca secara acak setiap hari
                    String[] kondisiCuaca = {"Cerah", "Hujan", "Panas", "Berawan"};
                    String kondisiBaru = kondisiCuaca[random.nextInt(kondisiCuaca.length)];
                    cuaca.setKondisi(kondisiBaru);
                    cuaca.updateEfek();

                    // 🔹 Tumbuhkan tanaman berdasarkan cuaca baru
                    tanaman.tumbuh(cuaca);
                }
                case 4 -> {
                    pemain.panenTanaman(tanaman);
                    if (tanaman.isPanen()) {
                        tanaman.resetPertumbuhan();
                        System.out.println("\n🌱 Tanaman telah dipanen dan lahan siap digunakan kembali!");
                        System.out.print("Apakah kamu ingin menanam tanaman baru? (ya/tidak): ");
                        String jawab = input.nextLine();
                        if (jawab.equalsIgnoreCase("ya")) {
                            tanaman = pilihTanaman(input, lahan);
                        } else {
                            System.out.println("Kamu memilih untuk beristirahat dulu. 😴");
                        }
                    }
                }
                case 5 -> {
                    lanjut = false;
                    System.out.println("\nTerima kasih telah bermain, " + pemain.getNama() + "! 🌻");
                }
                default -> System.out.println("Pilihan tidak valid!");
            }
        }

        input.close();
    }

    // 🔸 Fungsi bantu untuk memilih tanaman
    private static Tanaman pilihTanaman(Scanner input, Lahan lahan) {
        System.out.print("Pilih tanaman yang ingin kamu tanam (1. Padi, 2. Jagung): ");
        int pilihan = input.nextInt();
        input.nextLine();

        Tanaman tanaman;
        if (pilihan == 1) {
            tanaman = new Padi();
        } else {
            tanaman = new Jagung();
        }

        lahan.tanamTanaman(tanaman);
        return tanaman;
    }
}
