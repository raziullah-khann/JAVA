package ch_10_Inheritance;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class Q_15_find_second_largest {
    public static void main(String[] args) {
        int [] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number ");
        for(int i = 0; i<5; i++){

            arr[i]=sc.nextInt();

        }
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr,0,5);
        for(int element :arr){
            System.out.println(element);
        }
        System.out.println("Second maximum number is "+arr[arr.length-2]);
    }
}
