package ch_10_Inheritance;
import java.util.Scanner;
public class Q1_CI_and_SI {
//    public void simpleInterest(){
//        doubl
//    }
    public static void main(String[] args) {
        double SI,CI;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter value of p: ");
        double p = sc.nextDouble();

        System.out.print("Enter value of p: ");
        double n = sc.nextDouble();

        System.out.print("Enter value of p: ");
        double r = sc.nextDouble();

        SI = (p*n*r)/100;

        System.out.println("The simple Interest is "+ SI);

        CI=p*Math.pow((1+ r/100),n)-p;
        System.out.println(CI);



    }
}
