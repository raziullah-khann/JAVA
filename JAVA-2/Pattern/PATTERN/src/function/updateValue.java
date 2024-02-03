package function;

import java.util.ArrayList;

public class updateValue {
    static void change1(String a){

           a="50";
//        System.out.println(a);
    }
    static void change2(int[] arrr){

        arrr[0]=70;
//        System.out.println(arr[0]);
    }
    public static void main(String[] args) {
        //Case 1:Change the integer Value.
        String x = "60";
        change1(x);
        System.out.println(x);
        //Case 2:Change the array Value.
        int [] arr = {10,20,30,40,50,60,70,80,90,100};
        change2(arr);
        System.out.println(arr[0]);

    }
}
