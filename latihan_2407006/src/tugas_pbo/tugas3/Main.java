package tugas_pbo.tugas3;

public class Main {
    public static void main(String[] args) {
        BangunDatar bd;

        bd = new Persegi(5.0);
        bd.tampilkan();
        System.out.println();

        bd = new PersegiPanjang(6.0, 4.0);
        bd.tampilkan();
        System.out.println();

        bd = new Segitiga(3.0, 4.0);
        bd.tampilkan();
    }
}