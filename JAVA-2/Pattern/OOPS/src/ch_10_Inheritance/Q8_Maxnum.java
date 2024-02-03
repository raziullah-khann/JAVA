package ch_10_Inheritance;
import java.util.Scanner;
public class Q8_Maxnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1:");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2:");
        int num2 = sc.nextInt();
        System.out.print("Enter number 3:");
        int num3 = sc.nextInt();
        if(num1>num2 && num1>num3){
            System.out.print("Number 1 is maximum");
        }
        else if (num2>num1 && num2>num3) {
            System.out.print("Number 2 is maximum");
        }
        else if(num3>num1 && num3>num2){
            System.out.print("Number 3 is maximum");
        }
        else{
            System.out.print("All Number are same");
        }

    }
}
