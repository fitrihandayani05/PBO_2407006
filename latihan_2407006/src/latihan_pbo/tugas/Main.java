package latihan_pbo.tugas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BangunRuang kalkulator = new BangunRuang();

        System.out.println("=== Program Hitung Bangun Datar ===");
        System.out.println("1. Persegi\n2. Persegi Panjang\n3. Segitiga\n4. Belah Ketupat");
        System.out.print("Pilih menu (1-4): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan sisi: ");
                double s = input.nextDouble();
                kalkulator.hitungPersegi(s);
                break;
            case 2:
                System.out.print("Masukkan panjang: ");
                double p = input.nextDouble();
                System.out.print("Masukkan lebar: ");
                double l = input.nextDouble();
                kalkulator.hitungPersegiPanjang(p, l);
                break;
            case 3:
                System.out.print("Masukkan alas: ");
                double a = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double t = input.nextDouble();
                System.out.print("Masukkan sisi miring: ");
                double m = input.nextDouble();
                kalkulator.hitungSegitiga(a, t, m);
                break;
            case 4:
                System.out.print("Masukkan diagonal 1: ");
                double d1 = input.nextDouble();
                System.out.print("Masukkan diagonal 2: ");
                double d2 = input.nextDouble();
                System.out.print("Masukkan sisi miring: ");
                double sm = input.nextDouble();
                kalkulator.hitungBelahKetupat(d1, d2, sm);
                break;
            default:
                System.out.println("Pilihan tidak tersedia!");
        }
        input.close();
    }
}
