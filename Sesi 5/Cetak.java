import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Cetak {

    static  double maxNumber (double a, double b){
        if (a>b){
            return a;
        }else{
            return b;
        }
    }

    static int maxNumber (int a, int b){
        if (a>b){
            return a;
        }else{
            return b;
        }
    }

    static String maxNumber (String a, String b){
        if (a.equals("y")){
            return a;
        }else{
            return b;
        }
    }
    public static void main(String[] args) {
        
        System.out.println(maxNumber(9.0,2));
        System.out.println(maxNumber(10, 20));
        System.out.println(maxNumber("x", "z"));
    }
}
