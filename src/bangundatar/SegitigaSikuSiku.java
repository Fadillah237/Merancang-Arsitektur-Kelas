package bangundatar;

public class SegitigaSikuSiku extends Segitiga {
    private double sisiMiring;

    public SegitigaSikuSiku(double alas, double tinggi) {
        super(alas, tinggi);
        this.sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
    }

    @Override
    public double keliling() {
        return alas + tinggi + sisiMiring;
    }
}