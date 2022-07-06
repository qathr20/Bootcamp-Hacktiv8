package latihan;

public class PersegiPanjang extends BangunDatar{
    
    private float panjang;
    private float lebar;

    public float luas(float panjang, float lebar){
        return panjang*lebar;

    }

    public float keliling(float panjang, float lebar){
        return (2*panjang)+(2*lebar);

    }
}
