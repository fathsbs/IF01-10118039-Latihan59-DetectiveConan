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
public class tokohUtama extends Karakter {

    private final String hubungan;

    public tokohUtama(String nama, String JK, String pekerjaan, String hubungan) {
        super(nama, JK, pekerjaan);
        this.hubungan = hubungan;
    }

    public String getHubungan() {
        return hubungan;
    }

    public void tampilTokoh() {
        System.out.printf("Nama \t\t: %s%n", nama);
        System.out.printf("Jenis Kelamin \t: %s%n", JK);
        System.out.printf("Pekerjaan \t: %s%n", pekerjaan);
        System.out.printf("Hubungan \t: %s%n%n", hubungan);
    }
}
