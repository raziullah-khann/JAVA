import java.util.Scanner;

public class _8NumberIncPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number of rows:");
        int rows = sc.nextInt();
        int num =1;
        for(int i=1; i<=rows; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(num);
                num=num+1;
            }
            System.out.println();

        }
    }
}
