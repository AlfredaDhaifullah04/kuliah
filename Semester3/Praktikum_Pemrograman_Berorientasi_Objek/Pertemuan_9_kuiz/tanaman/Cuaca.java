package tanaman;
public class Cuaca {
    private String kondisi;
    private int suhu;
    private int kelembapan;

    public Cuaca(String kondisi, int suhu, int kelembapan) {
        this.kondisi = kondisi;
        this.suhu = suhu;
        this.kelembapan = kelembapan;
    }

    public String getKondisi() {
        return kondisi;
    }

    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }

    public int getSuhu() {
        return suhu;
    }

    public int getKelembapan() {
        return kelembapan;
    }

    public void updateEfek() {
        switch (kondisi.toLowerCase()) {
            case "hujan" -> {
                suhu = 25;
                kelembapan = 90;
            }
            case "cerah" -> {
                suhu = 30;
                kelembapan = 60;
            }
            case "panas" -> {
                suhu = 35;
                kelembapan = 40;
            }
            case "berawan" -> {
                suhu = 27;
                kelembapan = 70;
            }
            default -> System.out.println("Cuaca tidak dikenali.");
        }
        System.out.println("🌦️ Cuaca sekarang: " + kondisi + " | Suhu: " + suhu + "°C | Kelembapan: " + kelembapan + "%");
    }
}
