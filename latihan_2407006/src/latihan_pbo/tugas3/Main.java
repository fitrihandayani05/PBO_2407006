package latihan_pbo.tugas3;

public class Main {
    public static void main(String[] args) {
        BangunDatar[] data = {
            new BangunDatar(3.0, 4.0),
            new Persegi(5.0),
            new PersegiPanjang(6.0, 4.0),
        };

        for (BangunDatar bd : data) {
            bd.tampilkan();
            System.out.println(); 
        }
    }
}