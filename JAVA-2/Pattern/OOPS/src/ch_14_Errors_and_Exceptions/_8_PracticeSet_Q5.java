//Wrap the program in Q3 inside a method which throws your custom exception.
package ch_14_Errors_and_Exceptions;

import java.util.Scanner;
//make custom Exception
class MaxRetriesException extends Exception{
    public  String toString(){
        return "max retries are reached";
    }
    public  String getMessage(){
        return "max retries are reached";
    }
}
public class _8_PracticeSet_Q5 {
    public  static int array(int i) throws MaxRetriesException{
        if(i<=5){
            throw new MaxRetriesException();
        }
        return i;
    }
    public static void main(String[] args) {
        int [] arr = {12,45,77,54,52,4,5,8,99,47};
        boolean flag = true;
        int i = 1;
        while (flag && i<=5 ){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your index number");
            int num = sc.nextInt();
            try{
                System.out.println("The given index value is = "+arr[num]);
                try {
                    System.out.println(array(5));
                } catch (MaxRetriesException e) {
                    System.out.println(e);
                }
                flag = false;
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("In valid index retries "+i);
                i++;
            }
        }
        if(i>=5){
            System.out.println("Error");
        }
//        try{
//            int a = array(5);
//            System.out.println(a);
//        }catch (Exception e){
//            System.out.println(e);
//        }
    }
}
