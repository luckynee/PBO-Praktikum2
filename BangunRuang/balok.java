package praktikum2.BangunRuang;

public class balok extends bangunruang {

    private float p;
    private float l;
    private float t;

    public balok(float p, float l, float t) {
        this.p = p;
        this.l = l;
        this.t = t;
    }

    @Override
    public void hitungKeliling() {
        this.K = 4 * (p + l + t);
    }

    @Override
    public void hitungLuas() {
        this.L = 2 * ((p * l) + (p * t) + (l * t));
    }

    @Override
    public void hitungVolume() {
        this.V = p * l * t;
    }

}
