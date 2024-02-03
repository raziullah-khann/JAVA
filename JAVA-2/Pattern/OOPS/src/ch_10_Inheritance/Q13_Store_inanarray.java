package ch_10_Inheritance;

import java.util.Arrays;
import java.util.Scanner;

public class Q13_Store_inanarray {
    public static void main(String[] args) {
        int [] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element of an array: ");
        for(int i=0; i<5; i++){
            arr[i]=sc.nextInt();
        }

//        System.out.println(Arrays.sort(arr));
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, 1, 3);


    }
}
