-----Java Operator------
1. Operator Aritmatika
operator yang sering kita gunakan untuk hitung menghitung seperti kali bagi tambah kurang dan lainnya . 
++ (increament)
--(decrement)
2. Relation penugasan
Assignment Operator digunakan untuk memberi tugas suatu variable untuk melakukan suatu proses. Operator ini sering digunakan dalam pemrograman untuk mengulangi suatu perintah , salah satunya adalah increment / decrement.
== (equal to)
!= (not wqual to)
> (greater than)
< (less than)
>= (greater than or equal to)
<= (less than or equal to)
3. Operator pembanding
operator yang digunakan untuk membandingkan antara dua buah nilai . Hasil perbandingan dari operator ini adalah TRUE dan FALSE ( Tipe data BOOLEAN)

-----Conditional Logic----- (untuk menganalisa dan mengevaluasi kondisi digunakan variabel boolean)
1. If - Else and Between
	if (x==y){
	// x dan y bernilai sama, maka..
	} else {
	// x dan y tidak bernilai sama, maka....
	}
2. == and Equals
public class Test {
    public static void main(String[] args)
    {
        String s1 = "HELLO";
        String s2 = "HELLO";
        String s3 =  new String("HELLO");
  
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
    }
}
3. Switch/Case
class Main {
  public static void main(String[] args) {

    int number = 44;
    String size;

    // switch statement to check size
    switch (number) {

      case 29:
        size = "Small";
        break;

      case 42:
        size = "Medium";
        break;

      // match the value of week
      case 44:
        size = "Large";
        break;

      case 48:
        size = "Extra Large";
        break;
      
      default:
        size = "Unknown";
        break;

    }
    System.out.println("Size: " + size);
  }
}

4. Nested IF
//Nested-if Java program with if conditions only
public class NestedIfExample {
public static void main(String args[]) {
//declare 2 variables and store some values in it
int num1 = 23;
int num2 = 45;
//if the number 1 is 23
if( num1 == 23 ) {
//if number is 45
if( num2 == 45 ) {
System.out.print("Number 1 is :"+ num1 +" and Number 2 is :"+ num2);
} // end of if condition 2
} //end of if condition 1
} //end of main method
} //end of class



