package ch_14_Errors_and_Exceptions;

import java.util.Scanner;

public class _3_Handling_Specific_Exceptions {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 5;
        marks[1] = 10;
        marks[2] = 8;

//        marks[3]  =14; //ArrayIndexOutOfBoundsException:Index 3 out of bounds for length 3
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index of an array value");
        int indexNum = sc.nextInt();

        System.out.println("Enter the value you want to divide ");
        int number = sc.nextInt();

        try{
            System.out.println("The value of at array index is "+marks[indexNum]);
            System.out.println("The result is " +marks[indexNum]/number);

        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Not calculate");
            System.out.println(e);
        }
    }
}
