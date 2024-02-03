package ch_15_Date_And_Time_Calender_Class;

import java.util.Date;

public class _1_Date_and_Time {
    public static void main(String[] args) {
        System.out.println("Lets start date and Time");
        System.out.println("No of years since 1 jan 1970: "+System.currentTimeMillis()/1000/3600/24/365);
        System.out.println("No of days since 1 jan 1970: "+System.currentTimeMillis()/1000/3600/24);
        System.out.println("No of hours since 1 jan 1970: "+System.currentTimeMillis()/1000/3600);
        System.out.println("No of minutes since 1 jan 1970: "+System.currentTimeMillis()/1000/60);
        System.out.println("No of second since 1 jan 1970: "+System.currentTimeMillis()/1000);

        //Create Date class Object
        Date dt = new Date();
        Date dt1 = new Date(2000,01,01);
        System.out.println(dt);
//        System.out.println(dt.after("15-12-2000"));
        System.out.println(dt.getTime());
        System.out.println(dt.getDate());
        System.out.println(dt.getDay());
        System.out.println(dt.getYear());
        System.out.println(dt.equals(dt1));
        System.out.println(dt1.clone());
//        System.out.println(dt1.from(2023,07,23));
        System.out.println(dt1.toInstant());
        System.out.println(dt1.toString());
        System.out.println(dt1.hashCode());
    }

}
