package latihan_pbo.latihan4;

public class Main {
    public static void main(String[] args) {
        Menu pesanan;

        System.out.println("--- DAFTAR PESANAN ---");

        pesanan = new MenuItem("Nasi Goreng", 2, 12000);
        pesanan.tampilkan();
        System.out.println("------------------------------");

        pesanan = new MenuItem("Es Teh", 3, 3000);
        pesanan.tampilkan();
        System.out.println("------------------------------");

        pesanan = new MenuItem("Mie Ayam", 3, 13000);
        pesanan.tampilkan();
        System.out.println("------------------------------");
    }
}