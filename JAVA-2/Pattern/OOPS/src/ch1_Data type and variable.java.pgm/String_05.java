import java.util.Scanner;
public class String_05 {
    public static void main(String[] args){
        System.out.println("Taking input from the user ");
        Scanner sc = new Scanner(System.in);
        //boolean a = sc.hasNextInt();  //has work to check boolean
        //System.out.println(a);
        String a = sc.next(); // read one word of the string
        System.out.println(a);
        System.out.println("Taking input from the user ");
        Scanner ss = new Scanner(System.in);
        String b = ss.nextLine();  // read all string
        System.out.println(b);

    }
}

