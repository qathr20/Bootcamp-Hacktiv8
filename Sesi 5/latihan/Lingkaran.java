package latihan;

public class Lingkaran extends BangunDatar {
    
    private float r;

    public float luas(float r){
        double phi=3.14; 
        return ((float) phi)*r*r;
    }
    public float keliling(float r){
        double phi=3.14;
        float keliling = 2*((float) phi*r);
        return keliling;
    }
}
