package bangundatar;

public class SegitigaSamaKaki extends Segitiga {
    private double sisiMiring;

    public SegitigaSamaKaki(double alas, double tinggi) {
        super(alas, tinggi);
        this.sisiMiring = Math.sqrt((alas / 2) * (alas / 2) + tinggi * tinggi);
    }

    @Override
    public double keliling() {
        return 2 * sisiMiring + alas;
    }
}