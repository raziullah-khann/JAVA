// Write a program to calculate (recursion must be used ) factorial of a number in java.
import java.util.Scanner;
public class ch7_08_quickquiz {
    public static int factorial(int a){
        int factorial = 1;
        if(a==0 || a==1){
            return 1;
        }
        else{
            for(int i = a; i>0; i--){
                factorial*=i;
            }

        }return a*factorial(a-1);
    }
    public static void main(String[] args) {int num = 5;
        System.out.println("Enter your number those number you want factorial");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
        System.out.println("The factorial is " +factorial(num));

    }
}
