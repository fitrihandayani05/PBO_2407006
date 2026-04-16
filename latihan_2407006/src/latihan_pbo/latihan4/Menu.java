package latihan_pbo.latihan4;

public class Menu {
    private String nama;
    private double harga;

    public Menu(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() { return nama; }
    public double getHarga() { return harga; }

    public double hitungTotal(double jumlah) {
        return this.harga * jumlah;
    }

    public void tampilkan() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Harga: " + this.harga);
    }
}