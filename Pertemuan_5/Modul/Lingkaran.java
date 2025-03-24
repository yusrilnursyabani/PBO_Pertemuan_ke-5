/*  Nama File   : Lingkaran.java
    Nama        : Moh Yusril Nur Syabani - 24060123140181
    Deskripsi   : Kelas ini berfungsi untuk menampung data-data lingkaran
    Tanggal     : 14 - Maret - 2025
*/

public class Lingkaran extends BangunDatar implements IResize {
    private double jariJari;

    // Konstruktor tanpa parameter
    public Lingkaran() {
        setJmlSisi(0); 
    }

    // Konstruktor dengan parameter
    public Lingkaran(double jariJari, String warna, String border) {
        setWarna(warna);
        setBorder(border);
        setJmlSisi(0);
        this.jariJari = jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    // Menghitung dan menampilkan luas lingkaran
    @Override
    public double getLuas() {
        return Math.PI * jariJari * jariJari;
    }

    // Menghitung dan menampilkan keliling lingkaran
    @Override
    public double getKeliling() {
        return  2 * Math.PI * jariJari;
    }

    @Override
    public void zoomIn() {
        jariJari = jariJari * 1.1;
    }

    @Override
    public void zoomOut() {
        jariJari = jariJari * 0.9;
    }

    @Override
    public void zoom(int percent) {
        jariJari = jariJari * percent / 100;
    }

    public void tampilLingkaran() {
        tampilBangunDatar();
        System.out.println("Jari-Jari: " + jariJari);
        System.out.println("Luas Lingkaran: " + getLuas());
        System.out.println("Keliling Lingkaran: " + getKeliling());
    }
}
