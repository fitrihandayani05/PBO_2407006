package latihan_pbo.latihan4;

public class Main {
    public static void main(String[] args) {
        Menu pesanan;

        System.out.println("--- DAFTAR PESANAN ---");

        pesanan = new MenuItem("Nasi Goreng", 4, 15000);
        pesanan.tampilkan();
        System.out.println("------------------------------");

        pesanan = new MenuItem("Es Teh", 5, 8000);
        pesanan.tampilkan();
        System.out.println("------------------------------");

        pesanan = new MenuItem("ketoprak", 3, 12000);
        pesanan.tampilkan();
        System.out.println("------------------------------");
    }
}