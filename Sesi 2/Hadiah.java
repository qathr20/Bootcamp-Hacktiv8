import java.util.Scanner;

public class Hadiah {
    
    public static void main(String[] args) {
        int belanja = 0;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Total Belanjaan : Rp");
        belanja = scan.nextInt();

        if(belanja >10000) {
            System.out.println( "selamat anda mendapatkan hadiah");
        }
        System.out.println ("terimakasih");
    }
}
