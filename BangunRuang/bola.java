package praktikum2.BangunRuang;

public class bola extends bangunruang {

    private float r;

    public bola(float r) {
        this.r = r;
    }

    @Override
    public void hitungLuas() {
        this.L = 4 * 22 / 7 * (r * r);
    }

    @Override
    public void hitungVolume() {
        this.V = 4 / 3 * (r * r * r);
    }

}
