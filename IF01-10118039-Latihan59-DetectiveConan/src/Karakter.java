/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program ini berisi program yang dapat menampilkan beberapa informasi dari setiap karakter  
 */

/**
 *
 * @author Seno
 */
public class Karakter {

    final String nama;
    final String JK;
    final String pekerjaan;

    public Karakter(String nama, String JK, String pekerjaan) {
        this.nama = nama;
        this.JK = JK;
        this.pekerjaan = pekerjaan;
    }

    public String getNama() {
        return nama;
    }

    public String getJK() {
        return JK;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

}
