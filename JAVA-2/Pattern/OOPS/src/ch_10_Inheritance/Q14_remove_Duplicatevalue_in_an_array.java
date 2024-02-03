package ch_10_Inheritance;

import java.util.*;

public class Q14_remove_Duplicatevalue_in_an_array {
    public static void main(String[] args) {
        int [ ] arr = {10,10,12,15,17,12};
        Set has_set = new HashSet();
        for(int i =0; i<arr.length; i++){
            has_set.add(arr[i]);
        }

        has_set.remove(0);
        System.out.println(has_set);
    }
}
