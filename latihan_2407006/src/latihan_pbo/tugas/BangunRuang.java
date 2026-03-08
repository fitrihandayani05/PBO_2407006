package latihan_pbo.tugas;

public class BangunRuang {
    
    // Persegi
    public void hitungPersegi(double s) {
        System.out.println("Luas: " + (s * s));
        System.out.println("Keliling: " + (4 * s));
    }

    // Persegi Panjang
    public void hitungPersegiPanjang(double p, double l) {
        System.out.println("Luas: " + (p * l));
        System.out.println("Keliling: " + (2 * (p + l)));
    }

    // Segitiga (Asumsi Segitiga Siku-siku untuk keliling sederhana)
    public void hitungSegitiga(double a, double t, double m) {
        System.out.println("Luas: " + (0.5 * a * t));
        System.out.println("Keliling: " + (a + t + m));
    }

    // Belah Ketupat
    public void hitungBelahKetupat(double d1, double d2, double s) {
        System.out.println("Luas: " + (0.5 * d1 * d2));
        System.out.println("Keliling: " + (4 * s));
    }
}
    