import java.lang.reflect.Array;
import java.util.Arrays;

public class exper {
    public static void main(String[] args) {
        int [] angka = {3,2,4,1,5,9,2,6,5,3,6,7,3,4,2,5};
        //mengurutkan array
        Arrays.sort(angka);

        //menampilkan array dalam bentuk String
        System.out.println(Arrays.toString(angka));

        //mencari indeks angka 5
        int indeks = Arrays.binarySearch(angka, 6);
        System.out.println("index angka 6: " + indeks);
    }
}
