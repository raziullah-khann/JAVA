import java.util.Scanner;
public class ch7_10_fibonacci_series {  //0 1 1 2 3 5 8 13 21 34 55...so on
    public static void main(String[] args) {
        int a,b,c,term;
        a=0;
        b=1;
        System.out.println("Enter your term");
        Scanner sc=new Scanner(System.in);
        term=sc.nextInt();
        for(int i =1; i<=term; i++){
            System.out.print(a + " ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}
