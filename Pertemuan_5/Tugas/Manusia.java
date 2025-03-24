/*  Nama File   : Manusia.java
    Nama        : Moh Yusril Nur Syabani - 24060123140181
    Deskripsi   : Kelas dasar untuk manusia, menyimpan atribut umum seperti nama, tanggal mulai kerja, alamat, dan pendapatan.
    Tanggal     : 21 - Maret - 2025
*/

public class Manusia {
    protected String nama;
    protected String tglMulaiKerja; // format: dd-MM-yyyy
    protected String alamat;
    protected double pendapatan;
    
    // Static counter untuk jumlah Manusia
    protected static int counterMns = 0;
    
    public Manusia(String nama, String tglMulaiKerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tglMulaiKerja = tglMulaiKerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }
    
    public static int getCounterMns() {
        return counterMns;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public String getAlamat() {
        return alamat;
    }
    
    public void cetakInfo() {
        System.out.println("Nama             : " + nama);
        System.out.println("Tanggal Mulai Kerja : " + tglMulaiKerja);
        System.out.println("Alamat           : " + alamat);
        System.out.println("Pendapatan       : " + pendapatan);
    }
    
    // Metode hitungPajak dan hitungMasaKerja akan dioverride oleh subclass
    public double hitungPajak() {
        return 0;
    }
    
    public int hitungMasaKerja() {
        return 0;
    }
}
