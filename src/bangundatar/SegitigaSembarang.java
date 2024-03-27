package bangundatar;

public class SegitigaSembarang extends Segitiga {
    private double sisiB;
    private double sisiC;

    public SegitigaSembarang(double alas, double sisiB, double sisiC) {
        super(alas, 0);
        this.sisiB = sisiB;
        this.sisiC = sisiC;
        this.tinggi = hitungTinggi();
    }

    private double hitungTinggi() {
        double s = (alas + sisiB + sisiC) / 2;
        double area = Math.sqrt(s * (s - alas) * (s - sisiB) * (s - sisiC));
        return 2 * area / alas;
    }

    @Override
    public double luas() {
        return (alas * tinggi) / 2;
    }

    @Override
    public double keliling() {
        return alas + sisiB + sisiC;
    }
}