package tugas_pbo.tugas2;

public class Main {
    public static void main(String[] args) {
        BangunRuang balok = new BangunRuang(10, 5, 4);

        balok.tampilkanInfoRuang();

        System.out.println("Luas Alas = " + balok.hitungLuas());
        System.out.println("volume dari class parent : " + balok.hitungVolume());
        System.out.println("volume dari class child : " + balok.hitungVolume2());
    }
}