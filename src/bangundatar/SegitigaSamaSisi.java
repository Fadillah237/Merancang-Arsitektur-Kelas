package bangundatar;

public class SegitigaSamaSisi extends Segitiga {
    public SegitigaSamaSisi(double sisi) {
        super(sisi, sisi * Math.sqrt(3) / 2);
    }

    public double keliling() {
        return 3 * alas;
    }
}