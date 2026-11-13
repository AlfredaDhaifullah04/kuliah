package Pertemuan_ke_8.tugas_latihanUTS;

public class nomor07gpt {
        public static void main(String[] args) {
            // Langkah 1: Deklarasikan variabel
            int n = 10;  // Jumlah elemen Fibonacci yang diinginkan
            int fib1 = 1; // Elemen pertama
            int fib2 = 1; // Elemen kedua
            
            // Langkah 2: Cetak elemen pertama dan kedua
            System.out.print(fib1 + " ");
            System.out.print(fib2 + " ");
            
            // Langkah 3: Perulangan untuk menghitung elemen berikutnya
            for (int i = 3; i <= n; i++) {
                int fib_next = fib1 + fib2; // Hitung elemen Fibonacci berikutnya
                System.out.print(fib_next + " "); // Cetak elemen tersebut
                
                // Update nilai fib1 dan fib2
                fib1 = fib2;
                fib2 = fib_next;
            }
        }
    
    
}
