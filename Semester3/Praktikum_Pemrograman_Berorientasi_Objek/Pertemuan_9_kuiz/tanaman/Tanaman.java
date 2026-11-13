package tanaman;

public abstract class Tanaman {
    protected String nama;
    protected int pertumbuhan;
    protected int kebutuhanAir;
    protected int kebutuhanPupuk;
    protected boolean panen;

    public abstract void tumbuh(Cuaca cuaca);
    public abstract void panen();

    public boolean isPanen() { return panen; }

    public int getPertumbuhan() { return pertumbuhan; }

    public String getStatus() {
        if (panen) return "Siap Panen";
        else if (pertumbuhan > 70) return "Subur 🌿";
        else if (pertumbuhan > 40) return "Tumbuh 🌱";
        else return "Baru Ditanam 🌾";
    }

    public void resetPertumbuhan() {
        pertumbuhan = 0;
        panen = false;
    }
}
