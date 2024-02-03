//Q5 Write a program to generate multiplication table of a given number and write it to a file.
package ch_16_5_PracticeSet;
import java.io.FileWriter;
import java.io.*;
public class _1_PracticeSet_Q5 {
    public static void main(String[] args) {
        int n=5;
        String table="";
        for (int i = 1; i <= 10; i++) {
            table+=n+"X"+i+"="+n*i+"\n";
        }
        try {
            FileWriter fileWriter = new FileWriter("Multiplication.txt");
            fileWriter.write(table);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
