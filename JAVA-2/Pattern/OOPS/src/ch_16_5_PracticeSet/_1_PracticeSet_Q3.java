//Q3 Suppress the generated warnings from Q2
package ch_16_5_PracticeSet;
class MyDeprecated1{
    @Deprecated
    public void m1(){
        System.out.println("I am method");
    }
}
public class _1_PracticeSet_Q3 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        MyDeprecated1 md = new MyDeprecated1();
        md.m1();
    }
}
