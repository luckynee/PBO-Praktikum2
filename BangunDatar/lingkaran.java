package praktikum2.BangunDatar;

public class lingkaran extends bangundatar {

    private float r;

    public lingkaran(float r) {
        this.r = r;
    }

    @Override
    public void hitungLuas() {
        this.L = 22 / 7 * r * r;
    }

    @Override
    public void hitungKeliling() {
        this.K = 2 * 22 / 7 * r;
    }

}
