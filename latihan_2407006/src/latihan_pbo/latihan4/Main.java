package latihan_pbo.latihan4;

public class Main {
    public static void main(String[] args) {
        Menu[] daftarMenu = {
            new MenuItem("Ketoprak", 12000), 
            new MenuItem("Nasi Goreng", 15000),
            new MenuItem("Es Teh", 5000)
        };

        for (Menu m : daftarMenu) {
            m.tampilkan();
            System.out.println("----------------------------");
        }
    }
}