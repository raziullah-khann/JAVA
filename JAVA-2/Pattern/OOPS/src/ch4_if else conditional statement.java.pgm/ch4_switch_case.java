import java.util.Scanner;

public class ch4_switch_case {
    public static void main(String[] args) {
        System.out.println("Enter your Grade");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();  //switch cese ke ander string, character and integer kuv=ch bhi ho sakta h
        switch(a) {
            case "Ram":
                System.out.println("You are great");
                break;

            case "Shyam":
                System.out.println("yuo are good");
                break;

            case "Lav":
                System.out.println("You are exellent");
                break;

            default:
                System.out.println("you are not elligble");
                break;
        }
    }
}
