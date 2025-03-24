/*  Nama File   : Pengusaha.java
    Nama        : Moh Yusril Nur Syabani - 24060123140181
    Deskripsi   : Kelas Pengusaha merupakan subclass dari Manusia.
    Tanggal     : 21 - Maret - 2025
*/

public class Pengusaha extends Manusia {
    private String idPengusaha;
    private static int counterPengusaha = 0;
    
    // Konstanta berdasarkan NIM: digit ke-13 (B) = 8
    private final int B = 8;
    
    public Pengusaha(String nama, String tglMulaiKerja, String alamat, double pendapatan, String idPengusaha) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.idPengusaha = idPengusaha;
        counterPengusaha++;
    }
    
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }
    
    private int getYear() {
        return Integer.parseInt(tglMulaiKerja.substring(6));
    }
    
    @Override
    public int hitungMasaKerja() {
        int currentYear = 2025;
        return (currentYear - getYear()) + B;
    }
    
    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }
    
    @Override
    public void cetakInfo() {
        System.out.println("=== Informasi Pengusaha ===");
        super.cetakInfo();
        System.out.println("ID Pengusaha     : " + idPengusaha);
        System.out.println("Masa Kerja       : " + hitungMasaKerja());
        System.out.println("Pajak            : " + hitungPajak());
    }
}
