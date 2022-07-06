import java.util.Scanner;

public class HitungGrade {
    
    public static void main(String[] args) {
        //create variable and scan
        int nilai;
        String grade;
        Scanner scan = new Scanner(System.in);
        //get input
        System.out.print("Inputkan nilai anda : ");
        nilai = scan.nextInt();

        //kondisi grade
        if ( nilai >= 90){
            grade ="A";
        }
        else if ( nilai >= 80 ){
            grade = "B+";
        }
        else if ( nilai >= 70 ){
            grade = "B";
        }
        else if ( nilai >= 60 ){
            grade = "C+";
        }
        else if ( nilai >= 50 ){
            grade = "C";
        }
        else if ( nilai >= 40 ){
            grade = "D";
        }
        else {
            grade = "E";
        }

        System.out.println("Grade: "+ grade);
    }
}
