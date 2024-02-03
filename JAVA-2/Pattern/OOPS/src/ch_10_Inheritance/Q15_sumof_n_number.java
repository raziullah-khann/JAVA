package ch_10_Inheritance;

public class Q15_sumof_n_number {
    public static void main(String[] args) {
        int n = 10;  // Change this value to calculate the sum of a different number of elements

        int sum = 0;
//        int sum ;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("The sum of the first " + n + " numbers is: " + sum);
    }
}
