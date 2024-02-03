import java.util.Scanner;
public class TakingInput_05 {
    public static void main(String[] args){
        System.out.println("Taking input from the user ");
        Scanner bs = new Scanner(System.in);
        System.out.println("Enter number 1 ");
        float a = bs.nextFloat();

        System.out.println("Enter number 2 ");
        int b = bs.nextInt();
        float sum = a+b;
        System.out.println("The sum of these numbers is " +sum);
    }
}
