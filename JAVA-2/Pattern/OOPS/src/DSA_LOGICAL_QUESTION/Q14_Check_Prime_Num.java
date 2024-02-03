package DSA_LOGICAL_QUESTION;
import java.util.Scanner;
public class Q14_Check_Prime_Num {
    public static void main(String[] args) {
//        int num=8;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter input");
        int num = sc.nextInt();
        int count=0;
        if(num==0 || num== 1 || num<0){
            System.out.println("Please enter greater than 1");
        }
        else{
            for (int i = 2; i < num; i++) {
                if(num%i==0){
                    count++;
                }
            }
            if(count>0){
                System.out.println("Number is not prime");
            }
            else{
                System.out.println("Number is prime");
            }
        }
    }
}
