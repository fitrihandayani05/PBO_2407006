package latihan_pbo.latihan4;

public class MenuItem extends Menu {
    private int jumlah;
    private double harga;

    public MenuItem(String nama, int jumlah, double harga) {
        super(nama); 
        this.jumlah = jumlah;
        this.harga = harga;
    }

    @Override
    public double hitungTotal() {
        return harga * jumlah;
    }

    @Override
    public void tampilkan() {
        System.out.printf("%-15s %10.0f (x%d)\n", getNama(), harga, jumlah);
        System.out.println("Total: " + hitungTotal());
    }
}