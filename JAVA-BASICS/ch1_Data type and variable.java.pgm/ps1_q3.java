//Write a java program which asks the user to enter has/her name and greets them with hello<name>, have a good day text.
import java.util.Scanner;
public class ps1_q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the user name");
        java.lang.String name = sc.next();
        System.out.println("Hello " + name + " have a good day !");
    }
}
