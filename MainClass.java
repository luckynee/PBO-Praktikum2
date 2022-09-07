package praktikum2;

import praktikum2.BangunDatar.bangundatar;
import praktikum2.BangunDatar.lingkaran;
import praktikum2.BangunDatar.persegi;
import praktikum2.BangunDatar.persegipanjang;
import praktikum2.BangunRuang.balok;
import praktikum2.BangunRuang.bangunruang;
import praktikum2.BangunRuang.kubus;
import praktikum2.BangunRuang.bola;

public class MainClass {
    public static void main(String[] args) {

        System.out.println("---Lingkaran---");
        bangundatar lingkaran = new lingkaran(7);
        lingkaran.hitungLuas();
        lingkaran.hitungKeliling();
        lingkaran.printinfo();

        System.out.println("---Persegi---");
        bangundatar persegi = new persegi(5);
        persegi.hitungLuas();
        persegi.hitungKeliling();
        persegi.printinfo();

        System.out.println("---Persegi Panjang---");
        bangundatar persegipanjang = new persegipanjang(10, 5);
        persegipanjang.hitungLuas();
        persegipanjang.hitungKeliling();
        persegipanjang.printinfo();

        System.out.println("---Balok---");
        bangunruang balok = new balok(10, 5, 5);
        balok.hitungKeliling();
        balok.hitungLuas();
        balok.hitungVolume();
        balok.printinfo();

        System.out.println("---Kubus---");
        bangunruang kubus = new kubus(5);
        kubus.hitungKeliling();
        kubus.hitungLuas();
        kubus.hitungVolume();
        kubus.printinfo();

        System.out.println("---Bola---");
        bangunruang bola = new bola(7);
        bola.hitungLuas();
        bola.hitungVolume();
        bola.printinfo();

    }

}
