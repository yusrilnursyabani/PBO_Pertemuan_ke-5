/*  Nama File   : Persegi.java
    Nama        : Moh Yusril Nur Syabani -24060123140181
    Deskripsi   : Kelas ini berfungsi untuk menampung data-data persegi
    Tanggal     : 14 - Maret - 2025
*/

public class Persegi extends BangunDatar implements IResize {
    private double sisi;

    // Konstruktor tanpa parameter
    public Persegi() {
        setJmlSisi(4);
    }

    // Konstruktor dengan parameter
    public Persegi(double sisi, String warna, String border) {
        setWarna(warna);
        setBorder(border);
        setJmlSisi(4);
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double getLuas() {
        return sisi * sisi;
    }

    @Override
    public double getKeliling() {
        return 4 * sisi;
    }

    public void getDiagonal() {
        double diagonal = sisi * Math.sqrt(2);
        System.out.println("Diagonal Persegi: " + diagonal);
    }

    @Override
    public void zoomIn() {
        sisi = sisi * 1.1;
    }

    @Override
    public void zoomOut() {
        sisi = sisi * 0.9;
    }

    @Override
    public void zoom(int percent) {
        sisi = sisi * percent / 100;
    }

    public void tampilPersegi() {
        tampilBangunDatar();
        System.out.println("Sisi: " + sisi);
        System.out.println("Luas Persegi: " + getLuas());
        System.out.println("Keliling Persegi: " + getKeliling());
        getDiagonal();
    }
}