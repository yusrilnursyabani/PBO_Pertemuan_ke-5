/*  Nama File   : PNS.java
    Nama        : Moh Yusril Nur Syabani - 24060123140181
    Deskripsi   : Kelas PNS merupakan subclass dari Manusia.
    Tanggal     : 21 - Maret - 2025
*/

public class PNS extends Manusia {
    private String nip;
    private static int counterPNS = 0;
    
    // Konstanta berdasarkan NIM: digit ke-14 (A) = 1
    private final int A = 1;
    
    public PNS(String nama, String tglMulaiKerja, String alamat, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }
    
    public static int getCounterPNS() {
        return counterPNS;
    }
    
    // Mengambil tahun dari tglMulaiKerja (format: dd-MM-yyyy)
    private int getYear() {
        return Integer.parseInt(tglMulaiKerja.substring(6));
    }
    
    @Override
    public int hitungMasaKerja() {
        int currentYear = 2025; // Misalnya tahun saat ini adalah 2025
        return (currentYear - getYear()) + A;
    }
    
    @Override
    public double hitungPajak() {
        return 0.10 * pendapatan;
    }
    
    @Override
    public void cetakInfo() {
        System.out.println("=== Informasi PNS ===");
        super.cetakInfo();
        System.out.println("NIP              : " + nip);
        System.out.println("Masa Kerja       : " + hitungMasaKerja());
        System.out.println("Pajak            : " + hitungPajak());
    }
}
