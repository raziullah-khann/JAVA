//Write a JAVA program to convert kilometre to miles.
import java.sql.SQLOutput;
import java.util.Scanner;
public class ps1_q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the kilometre:");
        float km = sc.nextFloat();
        float miles = km*0.621371f;
        System.out.println("The km values is " + miles + " miles");
    }
}
