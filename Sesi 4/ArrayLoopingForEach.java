import java.util.Scanner;

public class ArrayLoopingForEach {
    
    public static void main(String[] args) {
        
        String[] itprofesi = new String[5];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < itprofesi.length; i++){
            System.out.println("Buah ke-" + ":");
           itprofesi[i] = scan.nextLine();
        }
        System.out.println("____________");

        for (String b : itprofesi){
            System.out.println(b);
        }
    
    }
}
