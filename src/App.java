import bangundatar.*;
import bangunruang.*;

public class App {
    public static void main(String[] args) {
        // Bangun Datar
        System.out.println("=== Bangun Datar ===");
        Persegi persegi = new Persegi(4);
        System.out.println("Persegi - Luas: " + persegi.luas() + ", Keliling: " + persegi.keliling());

        PersegiPanjang persegiPanjang = new PersegiPanjang(5, 3);
        System.out.println("Persegi Panjang - Luas: " + persegiPanjang.luas() + ", Keliling: " + persegiPanjang.getPanjang());

        Lingkaran lingkaran = new Lingkaran(7);
        System.out.println("Lingkaran - Luas: " + lingkaran.luas() + ", Keliling: " + lingkaran.keliling());

        SegitigaSamaSisi segitigaSamaSisi = new SegitigaSamaSisi(6);
        System.out.println("Segitiga Sama Sisi - Luas: " + segitigaSamaSisi.luas() + ", Keliling: " + segitigaSamaSisi.keliling());

        SegitigaSamaKaki segitigaSamaKaki = new SegitigaSamaKaki(6, 4);
        System.out.println("Segitiga Sama Kaki - Luas: " + segitigaSamaKaki.luas() + ", Keliling: " + segitigaSamaKaki.keliling());

        SegitigaSikuSiku segitigaSikuSiku = new SegitigaSikuSiku(3, 4);
        System.out.println("Segitiga Siku-Siku - Luas: " + segitigaSikuSiku.luas() + ", Keliling: " + segitigaSikuSiku.keliling());

        SegitigaSembarang segitigaSembarang = new SegitigaSembarang(5, 6, 7);
        System.out.println("Segitiga Sembarang - Luas: " + segitigaSembarang.luas() + ", Keliling: " + segitigaSembarang.keliling());

        // Bangun Ruang
        System.out.println("\n=== Bangun Ruang ===");
        Kubus kubus = new Kubus(4);
        System.out.println("Kubus - Volume: " + kubus.volume() + ", Luas Permukaan: " + kubus.luasPermukaan());

        Balok balok = new Balok(5, 3, 2);
        System.out.println("Balok - Volume: " + balok.volume() + ", Luas Permukaan: " + balok.luasPermukaan());

        Bola bola = new Bola(4);
        System.out.println("Bola - Volume: " + bola.volume() + ", Luas Permukaan: " + bola.luasPermukaan());

        Tabung tabung = new Tabung(3, 5);
        System.out.println("Tabung - Volume: " + tabung.volume() + ", Luas Permukaan: " + tabung.luasPermukaan());
    }
}