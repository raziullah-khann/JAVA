package function;

import java.util.Scanner;

public class Recursion {
    public static int factorial(int a){
        int fact=1;
        if(a==0 || a==1){
            return 1;
        }
        else{
//
//            for(int i =a; i>=1; i--){
//                fact=fact*i;
//            }
            return a*factorial(a-1);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number of rows:");
        int num = sc.nextInt();
        System.out.println("The factorial of given number is " + factorial(num));
    }
}
