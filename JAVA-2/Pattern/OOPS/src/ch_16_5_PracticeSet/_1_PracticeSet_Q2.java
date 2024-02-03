//Q2 Create a class and a method with deprecated annotation.What is its effect on program execution.
package ch_16_5_PracticeSet;
class MyDeprecated{
    @Deprecated
    public void m1(){
        System.out.println("I am method");
    }
}
public class _1_PracticeSet_Q2 {
    public static void main(String[] args) {
        MyDeprecated md = new MyDeprecated();
        md.m1();
    }
}
