package praktikum2.BangunRuang;

public class kubus extends bangunruang {

    private float s;

    public kubus(float s) {
        this.s = s;
    }

    @Override
    public void hitungKeliling() {
        this.K = 12 * s;
    }

    @Override
    public void hitungLuas() {
        this.L = 6 * (s * s);
    }

    @Override
    public void hitungVolume() {
        this.V = s * s * s;
    }
}
