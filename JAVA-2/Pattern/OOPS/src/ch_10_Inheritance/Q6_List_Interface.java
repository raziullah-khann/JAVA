package ch_10_Inheritance;


import java.util.*;

public class Q6_List_Interface {
    public static void main(String[] args) {
        List<Integer> cars = new ArrayList<Integer>();
        cars.add(1);
        cars.add(2);
        cars.add(3);
        cars.add(4);
        cars.add(5);
        cars.set(0,8);
        System.out.println(cars.get(0));
        cars.remove(4);
        System.out.println(cars);
//        cars.clear();
//        car
        System.out.println(cars.size());
    }
}
