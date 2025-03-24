/*  Nama File   : MBangunDatar.java
    Nama        : Moh Yusril Nur Syabani -24060123140181
    Deskripsi   : Kelas ini berfungsi untuk menampilkan informasi bangun datar, 
                  menguji implementasi IResize, serta membandingkan luas dan keliling.
    Tanggal     : 14 - Maret - 2025
*/

public class Main {
    public static void main(String[] args) {
        // Membuat objek Persegi
        Persegi persegi = new Persegi(5.0, "Merah", "Garis Putus-putus");
        System.out.println("Informasi Persegi:");
        persegi.tampilPersegi();
        
        // Uji IResize pada Persegi
        System.out.println("\nMelakukan zoomIn pada Persegi...");
        persegi.zoomIn();
        System.out.println("Sisi setelah zoomIn: " + persegi.getSisi());
        System.out.println("Luas setelah zoomIn: " + persegi.getLuas());
        
        System.out.println("\nMelakukan zoomOut pada Persegi...");
        persegi.zoomOut();
        System.out.println("Sisi setelah zoomOut: " + persegi.getSisi());
        System.out.println("Luas setelah zoomOut: " + persegi.getLuas());
        
        System.out.println("\n--------------------\n");

        // Membuat objek Lingkaran
        Lingkaran lingkaran = new Lingkaran(7.0, "Biru", "Garis Solid");
        System.out.println("Informasi Lingkaran:");
        lingkaran.tampilLingkaran();
        
        // Uji IResize pada Lingkaran
        System.out.println("\nMelakukan zoomIn pada Lingkaran...");
        lingkaran.zoomIn();
        System.out.println("Jari-Jari setelah zoomIn: " + lingkaran.getJariJari());
        System.out.println("Luas setelah zoomIn: " + lingkaran.getLuas());
        
        System.out.println("\nMelakukan zoomOut pada Lingkaran...");
        lingkaran.zoomOut();
        System.out.println("Jari-Jari setelah zoomOut: " + lingkaran.getJariJari());
        System.out.println("Luas setelah zoomOut: " + lingkaran.getLuas());
        
        System.out.println("\n--------------------\n");
        
        // Membandingkan luas dan keliling antara Persegi dan Lingkaran
        System.out.println("Persegi dan Lingkaran memiliki luas yang sama: " + persegi.isEqualLuas(lingkaran));
        System.out.println("Persegi dan Lingkaran memiliki keliling yang sama: " + persegi.isEqualKeliling(lingkaran));
    }
}
