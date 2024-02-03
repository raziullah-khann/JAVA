import java.util.Scanner;
public class UserInput_005 {
    public static void main(String[] args){
        System.out.println("Taking input from the user ");
        Scanner bs = new Scanner(System.in);
        System.out.println("Enter number 1 ");
        int a = bs.nextInt();

        System.out.println("Enter number 1 ");
        int b = bs.nextInt();
        int sum = a+b;
        System.out.println("The sum of these numbers is " +sum);
    }
}
