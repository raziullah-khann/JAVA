//Modify program in Q3 to throw a custom exception if max retries are reached.
package ch_14_Errors_and_Exceptions;

import java.util.Scanner;
class MaxRetries extends Exception{
    public  String toString(){
        return "max retries are reached";
    }
    public  String getMessage(){
        return "max retries are reached";
    }
}
public class _8_PracticeSet_Q4 {
    public static void main(String[] args) {
        boolean flag = true;
        int [] arr = {12,45,77,54,52,4,5,8,99,47};
//        System.out.println(arr.length);  //---10
        int i = 1;
        while (flag && i<=5 ){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your index number");
            int num = sc.nextInt();
            try{
                System.out.println("The given index value is = "+arr[num]);
                flag = false;
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("In valid index retries "+i);
                i++;
            }
        }
        if(i>=5){
            try {
                throw new MaxRetries();
            } catch (MaxRetries e) {
                System.out.println(e);
            }
        }
    }
}
