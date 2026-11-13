// Nama : Alfreda Dhaifullah Mahezwara
// NIM : 244107020219
// Absen : 04

package Pertemuan_ke_16;
import java.util.Scanner;
public class UAS_1A_04 {

    // deklarasi array 2 dan 1 dimensi untuk kebutuhan  program
    static int banyakTim04 = 2;
    static int [][] dataSkor04= new int [banyakTim04][2];
    static String [] namaTim04 = new String[banyakTim04];
    static int totalSkor04 [] = new int[banyakTim04];
    public static void main(String[] args) {
    Scanner str = new Scanner (System.in);   
    
    do {
        System.out.println("======menu utama=====");
        System.out.println("1.Input data skor tim");
        System.out.println("2.Tampilkan tabel skor");
        System.out.println("3.Tentukan juara");
        System.out.println("4.keluar");
        // memilih menu
        System.out.print("Pilih menu: ");
        int pilihan04 = str.nextInt();

            if (pilihan04 == 1){
                InputData();
            } else if (pilihan04 == 2) {
                TabelSkor();
            } else if (pilihan04 == 3) {
                juaraTurnamen();
            } else if (pilihan04 == 4) {
                break;
            } else {
                System.out.println("pilihan tidak valid");
            }
            
        } while (true);


    }

    // fungsi memasukan data tim 
    public static void InputData () {
        Scanner sc = new Scanner(System.in);
        for (int i04 = 0; i04 < dataSkor04.length ;i04++) {
            // melakukan validasi jika tim sudah memiliki nama
            if (namaTim04[i04] == null) {
                System.out.print("Masukan nama tim "+(i04+1)+": ");
                namaTim04[i04] = sc.nextLine();  // input nama tim
            }

            for (int k04 = 0; k04 < dataSkor04[i04].length; k04++) {
                System.out.print("Masukan skor " + namaTim04[i04] + " untuk level "+(k04+1)+": ");
                int skorInput04 = 0; 
                skorInput04 = sc.nextInt();
                // melakukan validasi jika nomor yang diinputkan negatif
                if (skorInput04 < 0) {
                    System.out.println("Nomor tidak valid, harap input ulang");
                } else {
                    // menambahkan data jika nomor yang diberikan valid
                    dataSkor04[i04][k04] += skorInput04;
                }
                sc.nextLine();

                totalSkor04[i04] += skorInput04;

                // memberi buff jika skor dalam 2 level berturut turut lebih dari 50
                if (dataSkor04[i04][0] > 50 && dataSkor04[i04][1] > 50) {
                    totalSkor04[i04] += 4;
                }
            }
            System.out.println();
        }
    }

    // menampilkan data menggunakan tabel
    public static void TabelSkor () {
        System.out.println("Nama Tim \t\t" + "level 1 \t level 2 \t Total Skor");
        for (int i04 = 0; i04 < namaTim04.length; i04++) {
            // output nama tim
            System.out.print(namaTim04[i04] + "\t\t :\t");
            for (int k04 = 0; k04 < dataSkor04[i04].length; k04++) {
                // mengubah nilai jika skor suatu tim pada level 1 bernilai kurang dari 35 
                if (dataSkor04[i04][0] < 35 ) {
                    dataSkor04[i04][0] = 0;
                }
                System.out.print(+dataSkor04[i04][k04] + "\t\t  ");
                
               
            }
            // mengurangi total skor suatu tim total skor yang dimiliki berangka genap
            if (totalSkor04[i04] % 2 == 0) {
                System.out.print(totalSkor04[i04]-15);  
            } else {
                System.out.print(totalSkor04[i04]);
            }

            System.out.println();
        }
    }

    // menampilkan juara turnamen
    public static void juaraTurnamen () {
        int winScore = 0;
        int pemenang = 0;
        for (int i04 = 0; i04 < totalSkor04.length; i04++) {
            // mencari skor tertinggi dari seluruh index 
            if (totalSkor04[i04] > winScore) {
                winScore = totalSkor04[i04]; // melakukan update skor tertinggi
                pemenang = i04; //mengganti value  variable pemenang menjadi index total skor tertinggi 
            }

            if (winScore == totalSkor04[i04]) {
                int maxLevel2 = 0; 
                for (int k04 = 0; k04 < totalSkor04.length; k04++) {
                    if (dataSkor04[k04][1] > maxLevel2) {
                        maxLevel2 = dataSkor04[k04][1];
                    }
                } 
            }
        }
        System.out.println("Selamat kepada tim " + namaTim04[pemenang] + " yang telah memenangkan kompetisi");     
    }

}
