package latihan_pbo.latihan4;

public class MenuItem extends Menu {
    public MenuItem(String nama, double harga) {
        super(nama, harga);
    }

    @Override // Sekarang ini tidak akan error karena parameternya sama-sama DOUBLE
    public double hitungTotal(double jumlah) {
        return getHarga() * jumlah;
    }

    @Override
    public void tampilkan() {
        super.tampilkan();
        System.out.println("Total jika beli 5: " + hitungTotal(5));
    }
}