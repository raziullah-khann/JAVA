import java.util.Scanner;
public class UserInput_0005 {
    public static void main(String[] args){
        System.out.println("Taking input from the user ");
        Scanner sc = new Scanner(System.in);
        boolean a = sc.hasNextInt();  //has work to check boolean
        System.out.println(a);
    }
}
