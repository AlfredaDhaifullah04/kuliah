package Pertemuan_ke_12 ;
import java.util.*;

public class QuizRev {
    // Struktur data untuk menyimpan hasil suara
    static Map<String, Map<String, Integer>> hasilPemilu = new LinkedHashMap<>();
    static List<String> daftarCalon = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        // Input daftar calon
        System.out.print("Masukkan jumlah calon: ");
        int jumlahCalon = scanner.nextInt();
        scanner.nextLine(); // Konsumsi newline
        for (int i = 1; i <= jumlahCalon; i++) {
            System.out.print("Masukkan nama calon ke-" + i + ": ");
            daftarCalon.add(scanner.nextLine());
        }

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Masukkan hasil suara");
            System.out.println("2. Tampilkan tabel hasil suara");
            System.out.println("3. Tampilkan total suara per calon");
            System.out.println("4. Tampilkan wilayah dengan suara terbanyak untuk setiap calon");
            System.out.println("5. Tampilkan pemenang di setiap wilayah");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    masukkanHasilSuara(scanner);
                    break;
                case 2:
                    tampilkanTabelHasil();
                    break;
                case 3:
                    tampilkanTotalSuara();
                    break;
                case 4:
                    tampilkanWilayahTerbanyak();
                    break;
                case 5:
                    tampilkanPemenangWilayah();
                    break;
                case 6:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 6);

        scanner.close();
    }

    // Fungsi untuk memasukkan hasil suara
    static void masukkanHasilSuara(Scanner scanner) {
        System.out.println("Masukkan nama wilayah: ");
        scanner.nextLine(); // Konsumsi newline
        String wilayah = scanner.nextLine();

        if (!hasilPemilu.containsKey(wilayah)) {
            hasilPemilu.put(wilayah, new LinkedHashMap<>());
        }

        for (String calon : daftarCalon) {
            System.out.println("Masukkan jumlah suara untuk " + calon + " di wilayah " + wilayah + ": ");
            int suara = scanner.nextInt();
            hasilPemilu.get(wilayah).put(calon, suara);
        }
    }

    // Fungsi untuk menampilkan tabel hasil suara
    static void tampilkanTabelHasil() {
        System.out.println("\nTabel Hasil Pemilu:");
        System.out.printf("%-15s", "Wilayah");
        for (String calon : daftarCalon) {
            System.out.printf("%-15s", calon);
        }
        System.out.println();

        for (Map.Entry<String, Map<String, Integer>> entry : hasilPemilu.entrySet()) {
            System.out.printf("%-15s", entry.getKey());
            for (String calon : daftarCalon) {
                System.out.printf("%-15d", entry.getValue().getOrDefault(calon, 0));
            }
            System.out.println();
        }
    }

    // Fungsi untuk menampilkan total suara per calon
    static void tampilkanTotalSuara() {
        System.out.println("\nTotal Suara per Calon:");
        Map<String, Integer> totalSuara = new HashMap<>();

        for (String calon : daftarCalon) {
            int total = 0;
            for (Map<String, Integer> wilayah : hasilPemilu.values()) {
                total += wilayah.getOrDefault(calon, 0);
            }
            totalSuara.put(calon, total);
        }

        for (Map.Entry<String, Integer> entry : totalSuara.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " suara");
        }
    }

    // Fungsi untuk menampilkan wilayah dengan suara terbanyak untuk setiap calon
    static void tampilkanWilayahTerbanyak() {
        System.out.println("\nWilayah dengan suara terbanyak untuk setiap calon:");
        for (String calon : daftarCalon) {
            String wilayahTerbanyak = null;
            int suaraTerbanyak = 0;

            for (Map.Entry<String, Map<String, Integer>> entry : hasilPemilu.entrySet()) {
                int suara = entry.getValue().getOrDefault(calon, 0);
                if (suara > suaraTerbanyak) {
                    suaraTerbanyak = suara;
                    wilayahTerbanyak = entry.getKey();
                }
            }

            if (wilayahTerbanyak != null) {
                System.out.println(calon + ": " + wilayahTerbanyak + " (" + suaraTerbanyak + " suara)");
            } else {
                System.out.println(calon + ": Tidak ada suara.");
            }
        }
    }

    // Fungsi untuk menampilkan pemenang di setiap wilayah
    static void tampilkanPemenangWilayah() {
        System.out.println("\nPemenang di setiap wilayah:");
        for (Map.Entry<String, Map<String, Integer>> entry : hasilPemilu.entrySet()) {
            String wilayah = entry.getKey();
            Map<String, Integer> suaraCalon = entry.getValue();

            String pemenang = null;
            int suaraTerbanyak = 0;
            boolean seri = false;

            for (Map.Entry<String, Integer> calonEntry : suaraCalon.entrySet()) {
                if (calonEntry.getValue() > suaraTerbanyak) {
                    suaraTerbanyak = calonEntry.getValue();
                    pemenang = calonEntry.getKey();
                    seri = false;
                } else if (calonEntry.getValue() == suaraTerbanyak) {
                    seri = true;
                }
            }

            if (seri) {
                System.out.println(wilayah + ": Seri dengan suara " + suaraTerbanyak);
            } else {
                System.out.println(wilayah + ": " + pemenang + " dengan " + suaraTerbanyak + " suara");
            }
        }
    }
}
