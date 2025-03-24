/*  Nama File   : BangunDatar.java
    Nama        : Moh Yusril Nur Syabani - 24060123140181
    Deskripsi   : Kelas ini berfungsi untuk menampung data-data bangun datar
    Tanggal     : 21 - Maret - 2025
*/

public abstract class BangunDatar {
    private int jmlSisi;
    private String warna;
    private String border;

    // Konstruktor tanpa parameter
    public BangunDatar() {
    }
    
    // Konstruktor dengan parameter
    public BangunDatar(String warna, String border) {
        this.warna = warna;
        this.border = border;
    }

    
    public int getJmlSisi() {
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public void tampilBangunDatar() {
        System.out.println("Jumlah Sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    public abstract double getLuas();
    public abstract double getKeliling();

    public boolean isEqualLuas(BangunDatar X) {
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X) {
        return this.getKeliling() == X.getKeliling();
    }
}


/*
Pertanyaan:
1. Apakah method yang dibuat pada langkah nomor 4 dapat digunakan untuk membandingkan objek bangun datar yang berbeda?
2. Jika BangunDatar tidak dijadikan sebagai abstract class, dapatkah Anda membuat method isEqualLuas() dan isEqualKeliling() pada class BangunDatar? Mengapa?
3. Apakah kelebihan saat class BangunDatar dijadikan sebagai abstract class daripada non-abstract class?
4. Apakah keuntungan saat method zoomIn(), zoomOut(), dan zoom() dikemas dalam interface IResize dibanding dijadikan sebagai abstract method dalam class BangunDatar?

Jawaban:
1. Iya, method yang dibuat pada langkah nomor 4 dapat digunakan untuk membandingkan objek bangun datar yang berbeda.
2. Tidak, karena method isEqualLuas() dan isEqualKeliling() membutuhkan method getLuas() dan getKeliling() yang bersifat abstract. Sehingga, class BangunDatar harus dijadikan sebagai abstract class.
3. Kelebihan saat class BangunDatar dijadikan sebagai abstract class adalah class BangunDatar tidak dapat diinstansiasi, sehingga class BangunDatar hanya dapat dijadikan sebagai parent class.
4. Keuntungan saat method zoomIn(), zoomOut(), dan zoom() dikemas dalam interface IResize dibanding dijadikan sebagai abstract method dalam class BangunDatar adalah class BangunDatar dapat mengimplementasikan lebih dari satu interface. 
*/
