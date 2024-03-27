package bangunruang;

import bangundatar.PersegiPanjang;

public class Balok {
    private PersegiPanjang alas;
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.alas = new PersegiPanjang(panjang, lebar);
        this.tinggi = tinggi;
    }

    public double volume() {
        return alas.luas() * tinggi;
    }

    public double luasPermukaan() {
        return 2 * (alas.luas() + alas.getPanjang() * tinggi + alas.getLebar() * tinggi);
    }
}