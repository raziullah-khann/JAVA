package DSA_LOGICAL_QUESTION;

import java.util.Scanner;

public class Q2_Exponential_power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int result = 1, base=2;
        while (n!=0){
            result=base*result;
            n--;
        }
        System.out.println(result);

    }
}
