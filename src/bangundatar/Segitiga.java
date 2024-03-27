package bangundatar;

public abstract class Segitiga implements Shape {
    protected double alas;
    protected double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double luas() {
        return (alas * tinggi) / 2;
    }

}