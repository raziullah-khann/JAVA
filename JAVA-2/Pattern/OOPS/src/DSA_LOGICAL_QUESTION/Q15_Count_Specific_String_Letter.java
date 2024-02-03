package DSA_LOGICAL_QUESTION;

import java.util.Scanner;

public class Q15_Count_Specific_String_Letter {
    public static void main(String[] args) {
//        String str = "Lavkumar";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string input");
        String str = sc.nextLine();
//        System.out.println("Enter character");
//        String  c = sc.next();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a'){
                count++;
            }

        }
        System.out.println(count);
    }
}
