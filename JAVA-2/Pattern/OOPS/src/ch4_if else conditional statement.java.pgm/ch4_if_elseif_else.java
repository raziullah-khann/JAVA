import java.util.Scanner;

public class ch4_if_elseif_else  {
    public static void main(String[] args) {
        System.out.println("Enter your marks");
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();
        if(mark>=90){
            System.out.println("Your grade is A+");
        }
        else if(mark>=80){
            System.out.println("Your grade is A");
        }
        else if(mark>=70){
            System.out.println("Your grade is B+");
        }
        else if(mark>=60){
            System.out.println("Your grade is B");
        }
        else if(mark>=50){
            System.out.println("Your grade is C+");
        }
        else if(mark>=40){
            System.out.println("Your grade is C");
        }
        else if(mark>=35){
            System.out.println("Your grade is D");
        }
        else{
            System.out.println("Your are fail");
        }
    }
}
