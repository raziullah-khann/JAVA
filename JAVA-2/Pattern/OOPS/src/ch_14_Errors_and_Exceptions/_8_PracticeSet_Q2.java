//Write a java program that prints "HaHa" during ArithmeticException And "HeHe" during Illegal Arguments Exception.
package ch_14_Errors_and_Exceptions;

public class _8_PracticeSet_Q2 {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try{
            System.out.println(a/b);
        }catch(ArithmeticException e){
            System.out.println("HaHa");
            System.out.println(e);
        }catch (IllegalArgumentException e){
            System.out.println("HeHe");
            System.out.println(e);
        }
    }
}
