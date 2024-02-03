//Q4. Repeat Q2 using the java.time API
//Q2.Use the Date Class in java to print time in the following format.
package ch_15_Date_And_Time_Calender_Class;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class _6_PracticeSet_Q4 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("H:m:s");
        String mytime = ldt.format(dtf);
        System.out.println(mytime);
    }
}
