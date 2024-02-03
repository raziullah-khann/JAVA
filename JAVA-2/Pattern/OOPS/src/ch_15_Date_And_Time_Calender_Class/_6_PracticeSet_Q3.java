//Q2.Use the Date Class in java to print time in the following format.
// Q3. Repeat 2 using the calendar class.
package ch_15_Date_And_Time_Calender_Class;

import java.util.Calendar;

public class _6_PracticeSet_Q3 {
    public static void main(String[] args) {
        Calendar cd = Calendar.getInstance();
        System.out.println(cd.get(Calendar.HOUR_OF_DAY)+":"+cd.get(Calendar.MINUTE)+":"+cd.get(Calendar.SECOND));
    }
}
