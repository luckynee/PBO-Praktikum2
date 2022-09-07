package praktikum2.BangunDatar;

public class persegi extends bangundatar {

    private float s;

    public persegi(float s) {
        this.s = s;
    }

    @Override
    public void hitungLuas() {
        this.L = s * s;

    }

    @Override
    public void hitungKeliling() {
        this.K = 4 * s;

    }
}
