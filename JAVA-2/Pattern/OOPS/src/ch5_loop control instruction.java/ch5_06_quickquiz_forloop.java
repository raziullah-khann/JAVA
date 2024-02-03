// Write a java program to print first n odd numbers using a for loop
import java.util.Scanner;
public class ch5_06_quickquiz_forloop {
    public static void main(String[] args) {
        System.out.println("Enter user input how many odd number you want");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //2i-->even number
        //2i+1-->odd number
        //int n = 10;
        int a;
        for(a=0;a<n;a++)
            System.out.println(2*a+1);
    }
}
