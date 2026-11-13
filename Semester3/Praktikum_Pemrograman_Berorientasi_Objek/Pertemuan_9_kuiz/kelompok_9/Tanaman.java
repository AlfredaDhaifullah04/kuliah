package kelompok_9;

public abstract class Tanaman {
    protected String nama;
    protected int usia;
    protected int waktuPanen; // dalam hari
    protected int levelAir;
    protected int statusKesehatan; // 0-100
    protected boolean siapPanen;

    public Tanaman(String nama, int waktuPanen) {
        this.nama = nama;
        this.waktuPanen = waktuPanen;
        this.usia = 0;
        this.levelAir = 50; // Level air awal
        this.statusKesehatan = 100; // Kesehatan awal
        this.siapPanen = false;
    }

    // Abstract method (WAJIB di-override oleh subclass)
    // Cara tanaman bereaksi terhadap cuaca berbeda-beda.
    public abstract void terpengaruhCuaca(Cuaca cuaca);

    // Metode konkret (bisa di-override, tapi tidak wajib)
    // Logika tumbuh (bertambah usia) sama untuk semua tanaman.
    public void tumbuh() {
        if (!siapPanen && statusKesehatan > 0) {
            usia++;
            levelAir -= 10; // Tanaman haus setiap hari

            if (levelAir < 20) {
                statusKesehatan -= 10; // Layu jika kekurangan air
                System.out.println(nama + " kekurangan air
                !");
            }

            if (usia >= waktuPanen) {
                siapPanen = true;
                System.out.println("--- " + nama + " SIAP DIPANEN! ---");
            }

            if (statusKesehatan <= 0) {
                System.out.println("!!! " + nama + " mati! !!!");
            }
        } 
    }

    // Metode untuk menerima aksi perawatan
    public void terimaPerawatan(String aksi) {
        if (aksi.equals("siram")) {
            this.levelAir = Math.min(100, this.levelAir + 40);
            System.out.println(nama + " telah disiram.");
        } else if (aksi.equals("pupuk")) {
            this.statusKesehatan = Math.min(100, this.statusKesehatan + 20);
            System.out.println(nama + " telah dipupuk.");
        } else if (aksi.equals("basmi_hama")) {
            // Logika hama bisa ditambahkan
            System.out.println("Hama pada " + nama + " telah dibasmi.");
        }
    }

    public HasilPanen panen() {
        if (siapPanen && statusKesehatan > 0) {
            this.siapPanen = false;
            this.usia = 0;
            // Mengembalikan hasil panen (misal: 10 unit)
            return new HasilPanen(this.nama, 10 + (statusKesehatan / 20)); 
        }
        return null;
    }

    // Getters
    public boolean isSiapPanen() { 
        return siapPanen; 
    }
    
    public String getNama() { 
        return nama; 
    }

    public int getUsia() { 
        return usia; 
    }

    public int getLevelAir() { 
        return levelAir; 
    }

    public int getStatusKesehatan() { 
        return statusKesehatan; 
    }
}