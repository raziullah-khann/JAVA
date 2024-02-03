package ch_15_Collection;

import java.util.HashSet;
import java.util.Iterator;

public class _5_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<Integer>();
        HashSet<Integer> hs1 = new HashSet<Integer>(6,0.5f);
        HashSet<Integer> hs2 = new HashSet<Integer>(6,0.5f);
        hs.add(5);
        hs.add(7);
        hs.add(10);
        hs.add(12);
        hs.add(7);

        hs1.add(5);
        hs1.add(7);
        hs1.add(20);
        hs1.add(52);
        hs1.add(8);
        System.out.println("To check Equal "+hs.equals(hs1));
//        hs.se
        System.out.println("to check empty or not "+hs2.isEmpty());
        System.out.println(hs);
        System.out.println("Remove 12 from this list "+hs.remove(12));
        Object[] arr= hs.toArray();
        for (int i = 0; i < hs.size(); i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Iterator");
        Iterator value = hs1.iterator();
        while (value.hasNext()){
            System.out.println(value.next());
        }
        System.out.println("Spliterator ");

    }
}
