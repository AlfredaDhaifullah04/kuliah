package Pertemuan_ke_12;

import java.util.Scanner;
public class Quizz {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int indexPaslon, indexWilayah;
        int indexMax = 0, totalSeluruhSuara =0;

        // input jumlah daerah dan jumlah paslon
        System.out.print("Masukan jumlah paslon: ");
        int jumlahpaslon = str.nextInt();
        System.out.print("masukan jumlah wilayah: ");
        int jumlahWilayah = str. nextInt();

        // deklarasi array untuk data suara
        int kpu [][] = new int[jumlahpaslon][jumlahWilayah];

        String paslon[] = new String[jumlahpaslon];

        // inpiut array untuk nama daerah
        String namaDaerah [] = new String[jumlahWilayah];
        str.nextLine();
        // input nama wilayah
        System.out.println("===========================");
        for (int i = 0; i < namaDaerah.length; i++) {
            System.out.print("Masukan nama wilayah " + (i+1)+ ": ");
            namaDaerah[i] = str.nextLine();
        }
        // menampilkan pilihan menu
        System.out.println("=====Komisi Pemilihan Umum=====");
        System.out.println("1. melakukan pemilihan suara");
        System.out.println("2. menampilkan data hasil");
        System.out.println("3. exit program");
        
        do {  // Memilih menu 
            System.out.print("Pilihan anda (1/2/3)?: ");
            int menu = str.nextInt();

            if (menu == 1) {
                System.out.println("melakukan peimilihian suara...");
                do {  // input jumlah suara
                    System.out.print("masukan index paslon (0-"+ (jumlahpaslon-1)+ "):  ");
                    indexPaslon = str.nextInt();
                    System.out.print("Masukan index wilayah (0-"+ (jumlahWilayah-1)+ "): ");
                    indexWilayah = str.nextInt();
                    System.out.print("Masukan data hasil pemilu: ");
                    int suaraDitambah = str.nextInt();

                    kpu[indexPaslon][indexWilayah] += suaraDitambah;

                    System.out.print("apakah masih akan menginput suara (yes/no): ");
                    str.nextLine();
                    String respon = str.nextLine();
                    if (respon.equalsIgnoreCase("no")) {
                        break;
                    }

                } while (true);
            } else if (menu == 2) {
                // menampampilkan Tabel hasil pemilihan suara
                System.out.println("============Tabel KPU==============");
                System.out.print("\t");
                //menampilkan nama wilayah
                for (int i = 0; i < namaDaerah.length; i++) {
                    System.out.print("\t"+namaDaerah[i] + " ");
                }
                System.out.println();
                // nama paslon
                for (int i = 0; i < kpu.length; i++) {
                    System.out.print("Paslon "+(i+1) +"\t: ");
                    // menampilkan jumlah suara paslon
                    for (int k = 0; k < kpu[i].length; k++) {
                        System.out.print(kpu[i][k] + "\t\t");
                    }
                    System.out.println();
                }

                // menampilkan total suara setiap paslon
                
                int []totalSuara = new int[jumlahpaslon];
                System.out.println("Total suara untuk setiap paslon");
                for (int i = 0; i < kpu.length; i++) {
                    for (int k = 0; k < kpu[i].length; k++) {
                        // terus menambahkan suara pada setiap paslon
                        totalSuara[i] += kpu[i][k];
                    }
                    totalSeluruhSuara += totalSuara[i];
                    System.out.print("Paslon "+(i+1)+ "\t: " + totalSuara[i]);
                    System.out.println();
                }
                // menampilka presentase suara
                System.out.println("==========Presentase=========");
                for (int i = 0; i < kpu.length; i++) {
                    System.out.println("paslon " +(i+1)+": " );
                }

                // menampilkan paslon paling dominan di daerah mana
                System.out.println();
                for (int i = 0; i < kpu.length; i++) {
                    indexMax = 0;
                    for (int j = 0; j < kpu[i].length; j++) {
                        if (kpu[i][j] > kpu[i][indexMax]) {
                            j = indexMax;
                        }
                    }
                    System.out.println("Paslon" + (i+1) + " Dominan di kota: " + namaDaerah[indexMax]);
                }
                
            } else if (menu == 3) {
                break;
            }
            
        } while (true);
        
    }
}
