public class alpredcoding {

    public static void main(String[] args) {

        // array sebuah Struktur data yg digunakan utk 
        //menyimpan kumpulan data dgn tipe data yg sama
        String[] hei; // deklarasi
        hei = new String[60];  // inisialisasi

        int[]anu = {60,70,40,30};
        anu = new int[20] ;
        for (int i = 0;i < anu.length; i++) {
            System.out.println("nilai ke-" + i + ":" + anu[i]);
        }
        
        

        //experiment berbagai macam String
        String sol= "apa pengaruh pergaulan bebas bagi pola pikir anak muda ";
        System.out.println(sol.hashCode());

    }
}