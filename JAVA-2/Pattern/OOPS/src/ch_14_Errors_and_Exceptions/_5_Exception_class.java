package ch_14_Errors_and_Exceptions;

import java.util.Scanner;

class MyException extends Exception {
    @Override
    public String toString(){
        return " I am toString()";
    }
    @Override
    public String getMessage(){
        return " I am getMessage()";
    }
}
public class _5_Exception_class {
    public static void main(String[] args)  {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number ");
        a = sc.nextInt();
        if(a<90){
            try {
                throw new MyException();
//                throw new ArithmeticException("Div by 0");
            } catch (MyException e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();

            }
        }
    }
}
