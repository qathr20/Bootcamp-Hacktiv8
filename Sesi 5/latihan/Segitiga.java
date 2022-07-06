package latihan;

public class Segitiga extends BangunDatar {

    private float alas;
    private float tinggi;

    public float luas(float alas, float tinggi){

        return (alas*tinggi)/2;
    }

    public float keliling (float alas, float tinggi){

        double sisiMiring = Math.sqrt((alas*alas)+(tinggi*tinggi));
        float f = (float) sisiMiring;
        float keliling = 2*f+alas;
        return keliling;

    }
}
