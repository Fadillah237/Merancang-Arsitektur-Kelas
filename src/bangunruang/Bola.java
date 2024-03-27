package bangunruang;

public class Bola implements Geometri {
    private double radius;

    public Bola(double radius) {
        this.radius = radius;
    }

    @Override
    public double volume() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double luasPermukaan() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}