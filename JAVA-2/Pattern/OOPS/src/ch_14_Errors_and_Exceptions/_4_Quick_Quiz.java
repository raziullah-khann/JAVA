package ch_14_Errors_and_Exceptions;

import java.util.Scanner;

public class _4_Quick_Quiz {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 50;
//        marks[3] = 45;  //--> error -ArrayIndexOutOfBoundsException
        boolean flag =true;
        while(flag) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter index number those value you want ");
            int ind = sc.nextInt();
            try {
                System.out.println("Nested try catch");
                try {
                    System.out.println("Access array " + marks[ind]);
                    flag =false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this index is not exist");
                    System.out.println("I am level 2");
                }
            } catch (Exception e) {
                System.out.println("I am level 1");
                System.out.println(e);
            }
        }
        System.out.println("END of the program");
    }
}
