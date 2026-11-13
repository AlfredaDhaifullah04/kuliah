package Pertemuan_ke_8.tugas_latihanUTS;

// buatkan pseudocode dari pola bilangan berikut
// 1,1,2,3,5,8,13,21,34,55
public class nomor7 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 0;
        System.out.println( a +" "+ b);

        for (;c <= 55;) {
            c = a+b;
            System.out.println("jadi1: "+ a+"/" + b);
            System.out.println("c: " + c);
            a = b;
            System.out.println("jadi2: "+ a+"/" + b);
            b = c;
            System.out.println("jadi3: "+ a+"/" + b);
            
        }
    }
}
