package ch_15_Collection;

import java.util.ArrayDeque;
import java.util.Iterator;

public class _4_Array_Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
        ad.add(5);
        ad.add(10);
        ad.add(15);
        ad.add(20);
        ad.addFirst(25);
        ad.offer(5);
        ad.offer(15);
        ad.offer(25);
        ad.offer(35);


        ad.getLast();
        System.out.println(ad.getLast());
        System.out.println(ad.contains(10));
        System.out.println(ad.getFirst());
        System.out.println("IsEmpty "+ad.isEmpty());
        System.out.println("Clone "+ad.clone());
        System.out.println("Head "+ad.element());

        Iterator value =ad.descendingIterator();
        while(value.hasNext()){
            System.out.print(value.next()+" ");
        }
        System.out.println("toArray Method demonstration");
        Object [] arr = ad.toArray();
        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }


    }
}
