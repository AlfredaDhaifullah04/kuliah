package Pertemuan_ke_10.teori;

public class contoh {
    public static void main(String[] args) {
        int arrayBil[];        // deklarasi array
        arrayBil = new int[10];   // inisialisasi array

        System.out.printf("%s%6s\n", "indeks", "value");
        // menampilkan array
        for (int i =0; i < arrayBil.length; i++) {
            System.out.printf("%2d%6d\n",i,arrayBil[i]);
        }
    }
}
