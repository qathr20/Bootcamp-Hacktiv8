import javax.sql.rowset.spi.SyncResolver;

public class DeklarasiArray {

    public static void main(String[] args) {
      
        int [] contoh;
        contoh = new int [4];
        contoh [0] = 5;
        contoh [1] = 10;
        contoh [2] = contoh [1] +10;

        // mengecek ukuran dg mencetak pnjg array
        System.out.println(contoh.length);
        System.out.println(contoh[0]);

        
    }
    

    
    
}
