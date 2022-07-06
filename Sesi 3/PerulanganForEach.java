public class PerulanganForEach {

    public static void main(String[] args) {
        int angka[] = {3,1,42,24,12};

        for( int x : angka ){
            System.out.print(x + " ");
        }
        System.out.println("");
        System.out.println("Break");

        int i;
        for (i = 0; i < 4; i++){
            if (i >= 3){
                break;
            }
            System.out.println("Selamat Belajar");
        }
        System.out.println(i);

        System.out.println("Continue");

        int a;
        for (a = 0; i < 4; a++) {
            if(a >= 3) {
                break;
            }
            System.out.println("Selamat Belajar");
            if(a >=2) {
                continue;
            }
            System.out.println("JAVA");
        }
        System.out.println(a);
    }
    
}
