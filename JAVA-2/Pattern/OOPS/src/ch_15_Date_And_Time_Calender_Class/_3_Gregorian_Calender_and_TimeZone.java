package ch_15_Date_And_Time_Calender_Class;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class _3_Gregorian_Calender_and_TimeZone {
    public static void main(String[] args) {

        //Calendar class --> it is an abstract class
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.PM));
        System.out.println(cal.get(Calendar.SECOND));
        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(cal.get(Calendar.HOUR_OF_DAY) + ":" +cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND));

        //GregorianCalendar --> it is a concrete class
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(1995));
        System.out.println(gc.getTime());
        System.out.println(gc.getCalendarType());
        System.out.println(gc.getWeekYear());

        //TimeZone method
        TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
        System.out.println(TimeZone.getAvailableIDs()[3]);
        System.out.println(TimeZone.getDefault());
        System.out.println(cal.getTimeZone().getID());



    }
}
