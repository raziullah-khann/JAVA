package ch_10_Inheritance;

import java.util.Scanner;

public class Q4_Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number ");
        int num = sc.nextInt();
        int temp,rem,rev=0;
        temp=num;
        while (temp !=0){
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if(num==rev){
            System.out.println(num +" is pallindrome");
        }
        else{
            System.out.println(num+ " is not pallindrome");
        }
    }
}
