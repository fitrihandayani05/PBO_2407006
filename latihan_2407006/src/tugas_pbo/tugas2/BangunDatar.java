package tugas_pbo.tugas2;

public class BangunDatar {
    protected double panjang;
    protected double lebar;

    public BangunDatar(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double hitungLuas() {
        return panjang * lebar;
    }

    public void tampilanhasil() {
        System.out.println("panjang = " + panjang);
        System.out.println("lebar = " + lebar);
    }
}