package ch_16_4_File_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class _1_File_Handling {
    public static void main(String[] args) {
        //Code to create a file
        File myFile = new File("abc.txt");
        try {
            myFile.createNewFile();
        }catch (IOException e){
            System.out.println("Unable to create this file");
            System.out.println(e);
        }

        //code to write to a file
//        try {
//            FileWriter fileWriter = new FileWriter("khan.txt");
//            fileWriter.write("My Self Munna Khan \n I am from DNH, It is a UT of India \n Currently I am pursuing BTech CE from RK University");
//            fileWriter.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //Reading a file
//        File file1 = new File("khan.txt");
//        try {
//            Scanner sc = new Scanner(file1);
//            while(sc.hasNextLine()){
//                String line = sc.nextLine();
//                System.out.println(line);
//            }
//            sc.close();
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }

        //Deleting a File
//        File myFile = new File("abc.txt");
//        if(myFile.delete()){
//            System.out.println("I have deleted: "+myFile.getName());
//        }
//        else{
//            System.out.println("Some problem occurred while deleting the file");
//        }

    }
}
