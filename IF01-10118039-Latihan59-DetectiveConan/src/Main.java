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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Karakter kar = new Karakter("", "", "");

        //Tokoh Utama
        tokohUtama Conan = new tokohUtama("Conan Edogawa/Shinici Kudo", "Laki-Laki", "Detektif, Pelajar SD/SMA", "Kekasih dari RAN, Teman Heiji,Sonoko,Kazuha,dan detektif cilik");
        tokohUtama Ran = new tokohUtama("Ran Mouri", "Perempuan", "Pelajar SMA", "Kekasih dari Shinichi dan Teman Heiji,Sonoko,Kazuha serta anak dari Kogoro dan Eri");
        tokohUtama Kogoro = new tokohUtama("Kogoro Mouri", "Laki-Laki", "Detektif", "Suami dari Eri dan Ayah dari Ran");

        //Tokoh Pendukung Detektif Cilik
        tokohPendukung Ayumi = new tokohPendukung("Ayumi Yoshida", "Perempuan", "Pelajar SD", "Detektif Cilik", "Teman Conan,Genta,Ai,Mitsuhiko,Genta");
        tokohPendukung Mitsuhiko = new tokohPendukung("Mitsuhiko Tsuburaya", "Laki-Laki", "Pelajar SD", "Detektif Cilik", "Teman Conan,Genta,Ai,Ayumi,Genta");
        tokohPendukung Genta = new tokohPendukung("Genta Kojima", "Laki-Laki", "Pelajar SD", "Detektif Cilik", "Teman Conan,Genta,Ai,Mitsuhiko,Ayumi");
        tokohPendukung Ai = new tokohPendukung("Ai Haibara/Shiho Miyano", "Perempuan", "Pelajar SD, mantan anggota Organisasi Hitam", "Detektif Cilik", "Teman Conan,Genta,Ayumi,Mitsuhiko,Genta");

        //Tokoh Pendukung SMA
        tokohPendukung Sonoko = new tokohPendukung("Sonoko Suzuki", "Perempuan", "Pelajar SMA", "Sonoko Tidur", "teman Shinichi,Ran,Kazuha,Heiji");
        tokohPendukung Heiji = new tokohPendukung("Heiji Hatori", "Laki-Laki", "Pelajar SMA, Detektif", "-", "teman Shinichi,Ran,Sonoko, dan kekasih dari Kazuha");
        tokohPendukung Kazuha = new tokohPendukung("Kazuha Toyama", "Perempuan", "Pelajar SMA", "-", "teman Shinichi,Ran,Sonoko, dan kekasih dari Heiji");

        //Tokoh Pendukung keluarga Mouri
        tokohPendukung Eri = new tokohPendukung("Eri Kisaki", "Perempuan", "Pengacara", "Ratu Pengacara", "Istri dari Kogoro dan Ibu dari Ran");

        //Tokoh pendukung yang membantu Conan
        tokohPendukung Agasa = new tokohPendukung("Agasa Hiroshi", "Laki-Laki", "Professor", "-", "Pendukung Conan dan Ai");

        //Tokoh Utama
        System.out.println("Tokoh dalam serial Detective Conan\n");
        System.out.println("@Tokoh Utama");
        Conan.tampilTokoh();
        Ran.tampilTokoh();
        Kogoro.tampilTokoh();
        System.out.println();

        //Detektif Cilik
        System.out.println("@Detektif Cilik");
        Conan.tampilTokoh();
        Ayumi.tampilTokoh();
        Mitsuhiko.tampilTokoh();
        Genta.tampilTokoh();
        Ai.tampilTokoh();

        //Detektif SMA dan kawan kawan
        System.out.println("@Detektif SMA dan Kawan-Kawan");
        Conan.tampilTokoh();
        Ran.tampilTokoh();
        Sonoko.tampilTokoh();
        Heiji.tampilTokoh();
        Kazuha.tampilTokoh();

        //Keluarga Mouri
        Kogoro.tampilTokoh();
        Eri.tampilTokoh();
        Ran.tampilTokoh();

        //Yang Mengetahui Conan adalah Shinichi
        System.out.println("@The Truth of Conan");
        Agasa.tampilTokoh();
        Heiji.tampilTokoh();
        Ai.tampilTokoh();

    }

}
