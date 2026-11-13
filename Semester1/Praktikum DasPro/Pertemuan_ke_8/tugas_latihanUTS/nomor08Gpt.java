package Pertemuan_ke_8.tugas_latihanUTS;

public class nomor08Gpt {
        public static void main(String[] args) {
            int n = 3;
            int i = 0; // jumlah pengulangan
            int bil1 = 5;  // bilangan yang akan ditambah berkali kali
            int hasil = 0;
    
            for (;i < n;) {
                hasil += bil1;
                i++;
                System.out.println(hasil);
            }
            System.out.println("hasil akhir: " + hasil);
        }
    
}
