package ch_10_Inheritance;

import java.util.Scanner;

public class Q3_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input");
        int num=sc.nextInt();
        int temp=0;
        if(num==1 || num ==0 || num<0){
            System.out.println("Please enter greater than 1 number");
        }
        else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    temp = temp + 1;
                }
            }
            if (temp > 0) {
                System.out.println("not prime");
            } else {
                System.out.println("prime");
            }
        }
    }
}
