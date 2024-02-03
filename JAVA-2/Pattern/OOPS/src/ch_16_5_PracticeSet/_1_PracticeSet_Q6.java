//Q6 Repeat Q5 with numbers from 2-9 and save all these multiplication tables to a folder.
package ch_16_5_PracticeSet;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class _1_PracticeSet_Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        int n=5;
        String table="";
        for (int i = 1; i <= 10; i++) {
            table+=num+"X"+i+"="+num*i+"\n";
        }
        try {
            FileWriter fileWriter = new FileWriter("Multiplication_2-9.txt");
            fileWriter.write(table);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
