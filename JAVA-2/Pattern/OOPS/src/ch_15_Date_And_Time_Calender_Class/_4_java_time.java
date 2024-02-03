package ch_15_Date_And_Time_Calender_Class;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class _4_java_time {
    public static void main(String[] args) {
        LocalDate ld  = LocalDate.now();
        System.out.println(ld);

        LocalTime lt  = LocalTime.now();
        System.out.println(lt);

        LocalDateTime ldt  = LocalDateTime.now();
        System.out.println(ldt);


    }
}
