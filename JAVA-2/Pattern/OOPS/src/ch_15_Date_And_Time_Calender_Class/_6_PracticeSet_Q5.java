//Q5. Create a Set in Java.Try and store duplicate element inside  this set and verify that only one instance is stored.
package ch_15_Date_And_Time_Calender_Class;
import java.util.HashSet;

public class _6_PracticeSet_Q5 {
    public static void main(String[] args) {
        HashSet<Integer> sc = new HashSet<Integer>();
//        Set s = new HashSet();
        sc.add(2);
        sc.add(2);
        sc.add(5);
        sc.add(7);
        sc.add(6);
        System.out.println(sc);
    }
}
