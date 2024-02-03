import java.util.Scanner;

public class ch3_Userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your User input");
        String a = sc.next();  // read one word of the sentence
        System.out.println(a);
        Scanner bc = new Scanner(System.in);
        System.out.println("enter the user input");
        String b = bc.nextLine();  // raed full string of the sentence
        System.out.println(b);
    }
}
