package latihan_pbo.tugas3;

public class PersegiPanjang extends BangunDatar {
    
    // a. Constructor menggunakan 2 parameter (panjang dan lebar)
    public PersegiPanjang(double panjang, double lebar) {
        // Mengirim nilai ke constructor induk (BangunDatar)
        super(panjang, lebar);
    }

    // b. Override method hitungLuas (Panjang * Lebar)
    @Override
    public double hitungLuas() {
        // Mengambil nilai varA (panjang) dan varB (lebar) melalui getter
        return getVarA() * getVarB();
    }

    // b. Override method tampilkan agar labelnya sesuai
    @Override
    public void tampilkan() {
        System.out.println("Persegi Panjang");
        System.out.println("============================");
        System.out.println("Panjang : " + getVarA());
        System.out.println("Lebar   : " + getVarB());
        System.out.println("Luas    : " + hitungLuas());
        System.out.println("============================");
    }
}