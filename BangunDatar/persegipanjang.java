package praktikum2.BangunDatar;

public class persegipanjang extends bangundatar {

    private float p;
    private float l;

    public persegipanjang(float p, float l) {
        this.p = p;
        this.l = l;
    }

    @Override
    public void hitungKeliling() {
        this.K = 2 * p + l;
    }

    @Override
    public void hitungLuas() {
        this.L = p * l;
    }

}
