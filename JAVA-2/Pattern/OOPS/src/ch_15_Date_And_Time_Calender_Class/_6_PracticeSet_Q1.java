//Q1.     Create an ArrayList and store names of 10 students inside it.Print it using a for each loop.
package ch_15_Date_And_Time_Calender_Class;
import java.util.ArrayList;
public class _6_PracticeSet_Q1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Ram");
        names.add("Shyam");
        names.add("Rohan");
        names.add("Ravi");
        names.add("Kajal");
        names.add("Lav");
        names.add("Khan");
        names.add("Ali");
        names.add("Dev");
        names.add("Varun");

        for(String n : names){
            System.out.print(n+" ");
        }
    }
}
