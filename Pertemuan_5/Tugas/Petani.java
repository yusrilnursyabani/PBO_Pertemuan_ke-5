/*  Nama File   : Petani.java
    Nama        : Moh Yusril Nur Syabani - 24060123140181
    Deskripsi   : Kelas Petani merupakan subclass dari Manusia.
    Tanggal     : 21 - Maret - 2025
*/

public class Petani extends Manusia {
    private String wilayah;
    private static int counterPetani = 0;
    
    // Konstanta berdasarkan NIM: digit ke-12 (C) = 1
    private final int C = 1;
    
    public Petani(String nama, String tglMulaiKerja, String alamat, double pendapatan, String wilayah) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.wilayah = wilayah;
        counterPetani++;
    }
    
    public static int getCounterPetani() {
        return counterPetani;
    }
    
    private int getYear() {
        return Integer.parseInt(tglMulaiKerja.substring(6));
    }
    
    @Override
    public int hitungMasaKerja() {
        int currentYear = 2025;
        return (currentYear - getYear()) + C;
    }
    
    @Override
    public double hitungPajak() {
        return 0.0;
    }
    
    @Override
    public void cetakInfo() {
        System.out.println("=== Informasi Petani ===");
        super.cetakInfo();
        System.out.println("Wilayah          : " + wilayah);
        System.out.println("Masa Kerja       : " + hitungMasaKerja());
        System.out.println("Pajak            : " + hitungPajak());
    }
}
