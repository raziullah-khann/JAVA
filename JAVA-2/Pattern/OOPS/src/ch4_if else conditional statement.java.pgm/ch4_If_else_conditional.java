import java.util.Scanner;

public class ch4_If_else_conditional {
    public static void main(String[] args) {
        System.out.println("Enter your input");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        // boolean cond = age>=18;
        if(age>=18){
            System.out.println("You can derive now");
        }
        else{
            System.out.println("you cannot derive now");
        }
    }
}
