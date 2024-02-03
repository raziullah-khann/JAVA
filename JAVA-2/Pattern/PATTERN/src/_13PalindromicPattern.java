import java.util.Scanner;

public class _13PalindromicPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number of rows:");
        int rows = sc.nextInt();

        for(int i = 1; i<=rows; i++){
            for(int j=1; j<=rows-i; j++){
                System.out.print(" ");
            }
            for(int k=i; k>=1; k--){
                System.out.print(k);
            }
            for(int k=2; k<=i; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
