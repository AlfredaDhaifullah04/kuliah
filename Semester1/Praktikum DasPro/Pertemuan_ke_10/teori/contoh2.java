package Pertemuan_ke_10.teori;

public class contoh2 {
    public static void main(String[] args) {
        int arrayBil[] = {33,45,65,44,3,2,45};
        // inisialisasi array: menentukan jumlah array dan
        //menentukan nilai dari setiap elemenya

        System.out.printf("%s%6s\n","indeks", "value");
        // menampilkan array
        for (int i = 0; i < arrayBil.length; i++) {
            System.out.printf("%2d%6d\n", i, arrayBil[i]);
        }
    }
}
