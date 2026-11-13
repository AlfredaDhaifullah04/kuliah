package Pertemuan_3;

public class MotorDemo {
    public static void main(String[] args) {
        motor mootor = new motor();
        mootor.printStatus();
        mootor.tambahKecepatan();

        mootor.nyalakanMesin();
        mootor.printStatus();
        
        mootor.tambahKecepatan();
        mootor.printStatus();

        mootor.tambahKecepatan();
        mootor.printStatus();

        mootor.tambahKecepatan();
        mootor.printStatus();

        mootor.matikanMesin();
    }
}
