import java.util.Scanner;

public class _10ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number of rows:");
        int rows = sc.nextInt();

        for(int i = 1; i<=rows; i++){
            for(int j= 1; j<=i; j++){
                System.out.print("*");
            }
            for(int k=1; k<=2*(rows-i); k++){
                System.out.print(" ");
            }
            for(int l = 1; l<=i; l++){
                System.out.print("*");
            }
            System.out.println();
        }


        for(int i = rows; i>=1; i--){
            for(int j= 1; j<=i; j++){
                System.out.print("*");
            }
            for(int k=1; k<=2*(rows-i); k++){
                System.out.print(" ");
            }
            for(int l = 1; l<=i; l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
