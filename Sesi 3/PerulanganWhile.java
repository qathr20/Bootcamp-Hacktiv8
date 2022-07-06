import java.util.Scanner;

public class PerulanganWhile {
    
    public static void main(String[] args) {
        
        boolean running = true;
        int counter = 0;
        String jawab;
        Scanner scan = new Scanner(System.in);

        while (running) {
            System.out.println("Apa anda ingin keluar?");
            System.out.println("Jawab [ya/tidak]> ");

            jawab = scan.nextLine();

            if (jawab.equalsIgnoreCase("ya")){
                running = false;
            }
            counter++;
        }
        System.out.println("Anda sudah melakukan perulangan sebanyak" + counter + "kali");
    }
}
