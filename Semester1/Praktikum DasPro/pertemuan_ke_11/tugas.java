package pertemuan_ke_11;
import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jumlahPertanyaan = 6;
        int jumlahResponden = 10;
        // a. Menyimpan hasil survey
        int[][] surveyResults = new int[jumlahResponden][jumlahPertanyaan]; // 10 responden, 6 pertanyaan

        System.out.println("Masukkan hasil survei (nilai 1-5):");
        for (int i = 0; i < surveyResults.length; i++) {
            System.out.println("Responden ke-" + (i + 1) + ":");
            for (int j = 0; j < surveyResults[i].length;) {
                System.out.print("Pertanyaan ke-" + (j + 1) + ": ");
                surveyResults[i][j] = scanner.nextInt();
                if (surveyResults[i][j] < 1 || surveyResults[i][j] > 5) {
                    System.out.println("jawaban harus antara 1-5, silahkan isi lagi");
                    continue;
                } else {

                }
                j++;
            }
        }

        // b. Menampilkan nilai rata-rata untuk setiap responden
        System.out.println("\nNilai rata-rata untuk setiap responden:");
        for (int i = 0; i < surveyResults.length; i++) {
            double sum = 0;
            for (int j = 0; j < surveyResults[i].length; j++) {
                sum += surveyResults[i][j];
            }
            double average = sum / jumlahPertanyaan;
            System.out.printf("Responden ke-%d: %.2f\n", i + 1, average);
        }

        // c. Menampilkan nilai rata-rata untuk setiap pertanyaan
        System.out.println("\nNilai rata-rata untuk setiap pertanyaan:");
        for (int j = 0; j < jumlahPertanyaan; j++) {
            double sum = 0;
            for (int i = 0; i < jumlahResponden; i++) {
                sum += surveyResults[i][j];
            }
            double average = sum / jumlahResponden;
            System.out.printf("Pertanyaan ke-%d: %.2f\n", j + 1, average);
        }

        // d. Menampilkan nilai rata-rata secara keseluruhan
        double totalSum = 0;
        int totalCount = jumlahResponden * jumlahPertanyaan; // Total jumlah elemen dalam array
        for (int i = 0; i < surveyResults.length; i++) {
            for (int j = 0; j < surveyResults[i].length; j++) {
                totalSum += surveyResults[i][j];
            }
        }
        double overallAverage = totalSum / totalCount;
        System.out.printf("\nNilai rata-rata keseluruhan: %.2f\n", overallAverage);

        scanner.close();
    }
}
