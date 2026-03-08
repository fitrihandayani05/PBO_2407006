package latihan_pbo.latihan2;

//acsess modifer (public, private, protected)
class Persegi{
    private int sisi;

    public int getSisi() {
        return sisi*sisi;
    }
   public double kelilingPersegi(){
        return sisi+sisi;
    }
    public void setSisi(int sisi) {
        this.sisi = sisi;
    }
}
public class main {
    public static void masin(String[] args) {
        Persegi persegi1 = new Persegi();
        persegi1.setSisi(5);
        System.out.println("Sisi Persegi: " + persegi1.getSisi());
    }
}