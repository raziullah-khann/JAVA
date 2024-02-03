package ch_15_Date_And_Time_Calender_Class;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class _5_DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime dtf  = LocalDateTime.now(); //This is a date
        System.out.println(dtf);

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/mm/yyyy E a");  //This is a Format
        DateTimeFormatter dtf2 = DateTimeFormatter.ISO_OFFSET_DATE;  //This is a Predefined Format
        String customFormat = dtf.format(dtf1);  //Creating a date string using date and format
        System.out.println(customFormat);
    }
}
