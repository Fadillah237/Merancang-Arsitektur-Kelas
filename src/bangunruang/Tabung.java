package bangunruang;

public class Tabung implements Geometri {
    private double radius;
    private double tinggi;

    public Tabung(double radius, double tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
    }

    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * tinggi;
    }

    @Override
    public double luasPermukaan() {
        return 2 * Math.PI * radius * (radius + tinggi);
    }
}