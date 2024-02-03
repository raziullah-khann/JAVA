import java.util.Scanner;

public class _12NumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number of rows:");
        int rows = sc.nextInt();
        int num=1;
        for(int i = 1; i<=rows; i++){
            for(int j = 1; j<=rows-i; j++ ){
                System.out.print(" ");
            }
            for(int k= 1; k<=i; k++){
                System.out.print(num+ " ");
            }
            System.out.println();
            num=num+1;
        }
    }
}
