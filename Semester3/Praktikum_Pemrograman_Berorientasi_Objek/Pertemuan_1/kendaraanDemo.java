public class kendaraanDemo {
    public static void main(String[] args) {

        mobil mbl1 = new mobil();
        System.out.println("--------------------------");
        mbl1.plusSpeed(40);
        mbl1.jumlahRoda(4);
        mbl1.setwarna("Red Marron");
        mbl1.setPintu(4);
        mbl1.setMesin("500 CC");
        mbl1.SetBBM("Shell power");
        mbl1.cetak();

        mobil mbl2 = new mobil();
        mbl2.kecepatan = 100;
        mbl2.jumlahRoda = 4;
        mbl2.warna = "Red Marron";
        mbl2.jumlahPintu = 4;
        mbl2.tipeMesin = "2000 CC";
        mbl2.bahanBakar = "Pertamanx Green";
        mbl2.cetak();


        bus bus1 = new bus();
        System.out.println("---------------------------");
        bus1.plusSpeed(80);
        bus1.jumlahRoda(10);
        bus1.setwarna("biru putih merah");
        bus1.setPintu(2);
        bus1.setBBM("Solar");
        bus1.setKapac(20);
        bus1.cetak();

        motor mtr1 = new motor();
        System.out.println("-------------------------");
        mtr1.plusSpeed(50);
        mtr1.jumlahRoda(2);
        mtr1.setwarna("Hitam");
        mtr1.gantiGir(3);
        mtr1.setBBM("Shell power");
        mtr1.cetak();
    }
}
