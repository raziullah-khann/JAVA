package ch_16_3_Generics;

import java.util.ArrayList;
class MyGeneric<T1,T2>{
    int val;
    private T1 t1;
    private T2 t2;

    //constructor
    public MyGeneric(int val, T1 t1,T2 t2){
        this.val=val;
        this.t1=t1;
        this.t2=t2;
    }
    //getter and setter
    public int getVal(){
        return val;
    }
    public  void setVal(int val){
        this.val=val;
    }
    public T1 getT1(){
        return t1;
    }
    public  void setT1(T1 t1){
        this.t1=t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }
}
public class _1_Generics {
    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<Integer>();
        arr.add(5);
        arr.add(8);
        arr.add(7);
        arr.add(5);
        System.out.println(arr.get(2));

        ArrayList  l1 = new ArrayList<>();
        l1.add(5);
        l1.add("Khan");
        l1.add(7);
        l1.add('R');
//        int a =(int)l1.get(1);
//        System.out.println(a);

        MyGeneric<String,Integer> g1 = new MyGeneric<>(4,"khan",5);
//        g1.getVal();
        String str = g1.getT1();
        Integer int1 = g1.getT2();
        System.out.println(str+" " +int1);
    }
}
