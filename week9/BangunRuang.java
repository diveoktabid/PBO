package week9;

public class BangunRuang extends BangunDatar {

    public BangunRuang(int sisi) {
        super(sisi);
    }

    public BangunRuang(int panjang, int lebar) {
        super(panjang, lebar);
    }

    public double volumeKubus(int sisi) {
        return sisi * sisi * sisi;
    }

    public double volumeBalok(int panjang, int lebar, int tinggi) {
        return panjang * lebar * tinggi;
    }

    public double volumeBalok(double panjang, double lebar, double tinggi) {
        return panjang * lebar * tinggi;
    }

    public double volumeBola(double radius) {
        return (4 / 3) * pi * Math.pow(radius, 3);
    }
}
