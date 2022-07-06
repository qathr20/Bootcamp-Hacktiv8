import java.util.LinkedList;

public class Latihan{

    public static void main(String[] args) {
    
        LinkedList<String> buah = new LinkedList<>();

        buah.add ("jeruk");
        buah.add ("Jambu");
        buah.add ("Apel");
        buah.add ("Melon");
        buah.add ("Semangka");
        buah.add ("Nanas");
        buah.add ("Sirsak");

        buah.addFirst("PalingAtas");
        buah.addLast("PalingBawah");
        
        buah.set(2, "diubah");
        
        System.out.println("Nama Buah: "+buah);
        System.out.println("Jumlah Buah: "+buah.size());
        System.out.println("Data Teratas: "+buah.getFirst());
        System.out.println("Data Terbawah: "+buah.getLast());
        System.out.println("Data Terbawah: "+buah.get(1));
        System.out.println("Data Terbawah: "+buah.get(3));

        buah.removeFirst();
        buah.removeLast();
        buah.remove(1);

        System.out.println(buah);
    }
}