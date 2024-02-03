//Q2.Use the Date Class in java to print time in the following format.
package ch_15_Date_And_Time_Calender_Class;

import java.util.Date;

public class _6_PracticeSet_Q2 {
    public static void main(String[] args) {
        Date dt = new Date();
        System.out.println(dt.getHours()+":"+ dt.getMinutes()+":"+dt.getSeconds());
        System.out.println(dt);
    }
}
