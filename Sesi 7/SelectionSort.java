import java.util.Scanner;

public class SelectionSort{

    public static void main(String[] args) {
        // buat object scanner
        Scanner scan = new Scanner(System.in);
        // input jumlah data
        System.out.print("Masukkan Jumlah Data: ");   int jlh_data = scan.nextInt();

        // input nilai tiap data
        int[] data = new int [jlh_data]; 
        System.out.println();
        for (int x = 0; x< jlh_data; x++){
            System.out.print("input nilai data ke-"+(x+1)+":");
            data[x] = scan.nextInt();
        }
        // tampilkan data sebelum di sorting
        System.out.println();
        System.out.println("Data sebelum di sorting : ");
        for (int x = 0; x < jlh_data; x++){
            System.out.print(data[x] + " ");
        }
        // proses Selection sort
        System.out.println("\n\nProses Selection Sort");
        for(int x = 0; x< jlh_data-1; x++){
            System.out.println("Iterasi ke-"+(x+1)+":");
            for(int y =0; y< jlh_data; y++){
                System.out.print(data[y]+" ");
            }
            System.out.println("\nApakah Data " + data[x]+" sudah benar pada urutannya?");

            boolean tukar = false;
            int index = 0;
            int min = data[x];
            String pesan = "Tidak Ada Pertukaran";
            for(int y = x+1; y< jlh_data; y++){
                if (min> data[y]){
                    tukar = true;
                    index = y;
                    min = data[y];
                }
            }
            if (tukar == true){
                // pertukaran data
                pesan = "Data "+data[x]+ " ditukar dengan data " + data[index];
                int temp = data[x];
                data[x] = data[index];
                data[index] = temp;
            }
            for(int y=0; y< jlh_data; y++){
                System.out.print(data[y]+" ");
            }
            System.out.println("\n"+pesan+"\n");
        }
        // tampilkan data setelah disorting
        System.out.print("Data setelah di sorting : ");
        for (int x = 0; x< jlh_data; x++){
            System.out.print(data[x]+" ");
        }
    }

}