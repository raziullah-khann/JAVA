package ch_14_Errors_and_Exceptions;

import java.util.Scanner;

public class _1_errors {
    public static void main(String[]args){
//          1. Syntax Error
//          int a = 5;
//        int b = 4;
//        c=7;
//        System.out.println(a+b);


//        2.Logical error
//        System.out.println(2);
//        for(int i = 1; i<5; i++){
//            System.out.println(2*i+1);
//        }


//        3.Runtime Error
        int k;
        Scanner sc = new Scanner(System.in);
        k=sc.nextInt();
        System.out.println(1000/k);
    }
    
}
