package ch_15_Collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class _3_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l1.add(5);
        l1.add(7);
        l1.add(8);
        l1.add(5);
        l1.add(2);
        l1.add(9);
        l1.add(5);
        l1.add(4);
        l1.add(3);
        l1.add(0,1);

        l2.add(20);
        l2.add(21);
        l2.add(25);
        l2.add(50);
        l2.add(0,40);
        l1.addAll(0,l2);
        //
        l1.addFirst(50);
        l1.addLast(90);
        System.out.println(l1.set(0,5));
        System.out.println(l1.remove(1));
        System.out.println(l1.equals(40)+" equal");
        System.out.println(l1.indexOf(40));
        System.out.println(l1.lastIndexOf(5));
        System.out.println(l1.contains(20));
//        System.out.println(l1.remove(5));

//        l1.clear();
//        System.out.println(l1);
        for (int i = 0; i<l1.size(); i++) {
            System.out.print(l1.get(i) + " ");
        }
        l1.removeIf(n->n%5==0);
        System.out.println();
        for (int i : l1){
            System.out.print(i+" ");
        }
        //Demonstrate removeIf() method on ArrayList which contains set of names starting with s
        System.out.println();
        System.out.println("Demonstrate removeIf()");
        ArrayList<String> names = new ArrayList<String>();
        names.add("Ram");
        names.add("Shyam");
        names.add("Rahul");
        names.add("Sohan");
        names.add("Mona");
//        names.removeIf(n->(n.charAt(0)=='S'));
//        names.removeIf(n->(n.length()==4));
//        names.removeIf(n->(n.endsWith("l")));
//        names.removeIf(n->(n.));
        for(String k:names){
            System.out.println(k);
        }

    }
}
