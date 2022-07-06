package latihan;

public class Main {

    public static void main(String[] args) {

        BangunDatar bangunDatar = new BangunDatar();
        bangunDatar.luas();

        Persegi persegi = new Persegi();

        float luasPersegi = persegi.luasPersegi(2);
        System.out.println("luasPersegi :" + luasPersegi);
        float kelilingPersegi = persegi.kelilingPersegi(2);
        System.out.println("kelilingPersegi :" + kelilingPersegi);

        PersegiPanjang persegiPanjang = new PersegiPanjang();
        float luasPersegiPanjang = persegiPanjang.luas(2, 4);
        System.out.println("luasPersegiPanjang :" + luasPersegiPanjang);
        float kelilingPersegiPanjang = persegiPanjang.keliling(2, 4);
        System.out.println("kelilingPersegiPanjang :" + kelilingPersegiPanjang);

        Lingkaran lingkaran = new Lingkaran();
        float luasLingkaran = lingkaran.luas(2);
        System.out.println("luasLingkaran: " + luasLingkaran);
        float kelilingLingkaran = lingkaran.keliling(3);
        System.out.println("kelilingLingkaran: " + kelilingLingkaran);

        Segitiga segitiga = new Segitiga();
        float luasSegitiga = segitiga.luas(2, 6);
        System.out.println("luasSegitiga :" + luasSegitiga);
        float kelilingSegitiga = segitiga.keliling(2, 6);
        System.out.println("kelilingSegitiga :" + kelilingSegitiga);
    }
}
