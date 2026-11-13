package pertemuan_ke_11;

import java.util.Scanner;
public class bioskopWithScanner2 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        Scanner nstr = new Scanner(System.in);
        
        int baris = 4;
        int kolom = 2;
        String penonton [][] = new String[baris][kolom];
        String nama = "";
        // String key[][] = new String[4][2];

        
        System.out.println("pilihan menu");
        System.out.println("1. Input data penonton ");
        System.out.println("2. Tampilkan daftar penonton");
        System.out.println("3. exit");
        do {
            System.out.print("pilih menu (1/2/3)? : ");
            int menu = nstr.nextInt();

            if (menu == 1) {
                do {
                    System.out.print("masukan nama penonton: ");
                    nama = str.nextLine();
                    System.out.print("masukan baris yang anda pilih: ");
                    baris  = nstr.nextInt();
                    System.out.print("Masukan kolom yang anda pilih: ");
                    kolom = nstr.nextInt();

                    if (baris < 0 || baris > 3 || kolom < 0 || kolom > 1) {
                        System.out.println("Maaf, baris yang anda inginkan tidak tersedia");
                        continue;
                    }
                    if (penonton[baris][kolom] != null) {
                        System.out.println("Maaf, kursi yang dipilih sudah terisi, silahkan untuk memilih ulang");
                        continue;
                    }

                    penonton[baris][kolom] = "Posisi baris ke-"+baris+", dan kolom ke-"+kolom+" di isi oleh: " + nama ;

                    System.out.print("lanjut memasukan daftar? (y/n)");
                    String respor = str.nextLine();
                    if (respor.equalsIgnoreCase("n")) {
                        break;
                    }
                } while (true);

            } else if (menu == 2) {
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.println("***");
                        } else {
                            System.out.println(penonton[i][j]);
                        }
                    }
                }
            } else if (menu == 3) {
                break;
            }
            
        } while (true);
    }
}
