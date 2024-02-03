package ch_10_Inheritance;

import java.util.Scanner;

public class Q17_nth_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position of prime number you want: ");
        int nth = sc.nextInt();
        int count =0, num=0, i;
        while(count<nth) {
            num += 1;
            for (i = 2; i <= num; i++) {
                if (num % i == 0) {
                    break;
                }
            }
            if (i == num) {
                count += 1;
            }
        }
        System.out.println("Value of nth prime: " +num);


    }
}
