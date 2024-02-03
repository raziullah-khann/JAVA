//Write a java program to detect whether a number entered by the user is integer or not.

import java.util.Scanner;
public class ps1_q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input");
        boolean a = sc.hasNextInt();
        System.out.println("your output is " +a);
    }
}
