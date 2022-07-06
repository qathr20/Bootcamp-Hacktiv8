public class Driver {

    public static void main(String[] args) {
        // class sendiri
        AnakUmur1Tahun i = new AnakUmur1Tahun();
        i.anakSiapa();
        i.makan();
        // class lain
        Induk a1 = new AnakUmur1Tahun();
        a1.minum();
        // interface
        InterfaceAnakUmur1Tahun a11 = new AnakUmur1Tahun();
        a11.hobiAnak();
    }
}