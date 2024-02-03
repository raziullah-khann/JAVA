package ch_15_Date_And_Time_Calender_Class;

import java.util.Calendar;
import java.util.TimeZone;

public class _2_Calender_Class_in_java {
    public static void main(String[] args) {
        Calendar cd = Calendar.getInstance();
        System.out.println(cd.getCalendarType());
        System.out.println(cd.getTimeZone());
        System.out.println(cd.getTimeZone().getID());

        Calendar cd1 = Calendar.getInstance(TimeZone.getTimeZone("America/Rio_Branco"));
        System.out.println(cd1.getCalendarType());
        System.out.println(cd1.getTimeZone());
        System.out.println(cd1.getTimeZone().getID());
        System.out.println(cd1.getTime());
        System.out.println(cd1.get(Calendar.DATE));


    }
}
