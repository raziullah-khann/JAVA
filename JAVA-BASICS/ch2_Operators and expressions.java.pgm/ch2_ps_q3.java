//Use comparison operator to find out whether a given number is greater than the user enter number or not.
import java.util.Scanner;
public class ch2_ps_q3 {
    public static void main(String[] args) {
        System.out.println("Enter the user input ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a>7);
    }
}
