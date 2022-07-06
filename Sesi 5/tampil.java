
abstract class Hewan {

    // Mendeklrasikan class dan method tipe abstract
    protected abstract void munculSuara();

}

class Kucing extends Hewan {

    // Menggunakan method dari kelas induk abstrak
    @Override
    protected void munculSuara() {
        System.out.println("Suara Kucing: Meow...meow..meow.");
    }

}

class Burung extends Hewan {

    // Menggunakan method dari kelas induk abstrak
    @Override
    protected void munculSuara() {
        System.out.println("Suara Burung: Cit...cit..cit.");
    }

}

class Ayam extends Hewan {

    @Override
    protected void munculSuara() {
        System.out.println("Suara Ayam: kuk...kuk..kuk.");
    }
}

public class tampil {
    // Mode akses overriding method harus sama atau lebih luas daripada override
    // method.
    // Subclass hanya dapat dan boleh meng-override method superclass satu kali
    // saja.
    // Tidak boleh ada lebih dari satu method yang sama pada kelas.
    // Soal aturan hak akses, setiap subclass tidak boleh mempunyai hak akses method
    // overriding yang ketat dibandingkan dengan hak akses method pada superclass
    // ataupun parent class.
    public static void main(String[] args) {
        Hewan kucing = new Kucing();
        kucing.munculSuara();

        Hewan burung = new Burung();
        burung.munculSuara();

        Hewan ayam = new Ayam();
        ayam.munculSuara();
    }

}