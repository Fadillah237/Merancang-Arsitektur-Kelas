package bangunruang;

import bangundatar.Persegi;

public class Kubus implements Geometri {
    private Persegi alas;

    public Kubus(double sisi) {
        this.alas = new Persegi(sisi);
    }

    public double volume() {
        return Math.pow(alas.luas(), 1.5);
    }

    public double luasPermukaan() {
        return 6 * alas.luas();
    }

}