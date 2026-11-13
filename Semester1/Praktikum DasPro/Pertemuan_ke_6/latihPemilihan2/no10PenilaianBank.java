package Pertemuan_ke_6.latihPemilihan2;

import java.util.Scanner;
public class no10PenilaianBank {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        Scanner nstr = new Scanner(System.in);
        int pendapatan =0;
        String riwayat , pekerjaan ,kreditlain , cicilan;
        riwayat = pekerjaan = kreditlain = cicilan = "";

        System.out.println("Berapa pendapatan anda selama satu bulan? : ");
        pendapatan = nstr.nextInt(); 

        if (pendapatan >= 5000000) { 
            System.out.println("bagaimana riwayat kredit nasabah? (baik/buruk)");
            riwayat = str.nextLine();
            if (riwayat.equalsIgnoreCase("baik")) {
                System.out.println("pekerjaan nasabah kontrak atau tidak? (tetap/freelance)");
                pekerjaan = str.nextLine();
                if(pekerjaan.equalsIgnoreCase("tetap")) {
                    System.out.println("Anda diterima untuk kredit dibank kami");
                } else if (pekerjaan.equalsIgnoreCase("freelance")) {
                    System.out.println("apakah nasabah memiliki cicilan kredit lain? (iya/tidak) ");
                    kreditlain = str.nextLine();
                    if (kreditlain.equalsIgnoreCase("iya")) {
                        System.out.println("apakah Kredit nasabah melebihi 30% dari pendapatan (yes/no)");
                        cicilan = str.nextLine();
                        if (cicilan.equalsIgnoreCase("yes")) {
                            System.out.println("Maaf pengajuan anda ditolak, anda tidak dapat kredit di bank kami");
                        } else if (cicilan.equalsIgnoreCase("no")) {
                            System.out.println("Anda diterima kredit dibank kami");
                        } else {
                            System.out.println("jawaban yang anda berikan terkait cicilan kredit tidak valid");
                        }
                    } else if (kreditlain.equalsIgnoreCase("tidak")) {
                        System.out.println("anda kami terima untuk kredit di bank kami");
                    } else {
                        System.out.println("jawaban anda tidak valid");
                    }
                } else {
                    System.out.println("input data pekerjaan anda tidak valid");
                }
            } else if (riwayat.equalsIgnoreCase("buruk")) {
                System.out.println("maaf pengajuan kredit anda kami tolak");
            } else {
                System.out.println("inputan riwayat kredit tidak valid");
            }
        } else {
            System.out.println("Maaf, anda ditolak karna penghasilan anda tidak mencapai batas minimun");
        }

        str.close(); nstr.close();

    }
}
