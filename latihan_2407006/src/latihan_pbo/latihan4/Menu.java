package latihan_pbo.latihan4;

public class Menu {
    private String nama;

    public Menu(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double hitungTotal() {
        return 0;
    }

    public void tampilkan() {
        System.out.print(nama);
    }
}