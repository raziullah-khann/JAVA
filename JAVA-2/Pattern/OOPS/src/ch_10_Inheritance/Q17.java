package ch_10_Inheritance;
import java.util.*;
public class Q17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int input = scanner.nextInt();

        while (input > 0) {
            if (input > 0 && input <= 12) {
                System.out.print("*");
            } else if (input > 12 && input <= 24) {
                System.out.print("**");
            } else if (input > 24 && input <= 30) {
                System.out.print("***");
                input--;
            }
            // Add a space to separate the output for each loop iteration
            System.out.print(" ");
            //input--; // Decrease input for the next iteration
        }

        scanner.close();
    }
}