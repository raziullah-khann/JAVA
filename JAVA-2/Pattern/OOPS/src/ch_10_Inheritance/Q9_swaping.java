package ch_10_Inheritance;
import java.util.Scanner;
public class Q9_swaping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2");
        int num2 = sc.nextInt();
        num1 = num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("number 1: "+num1);
        System.out.println("number 2: "+num2);
    }
}
