//Q4 Create an interface and generate an instance from it.
package ch_16_5_PracticeSet;
interface MyInt{
//    int i=5;
    void display();
    default void show(){
        System.out.println("I am show");
    }
}
public class _1_PracticeSet_Q4 {
    public static void main(String[] args) {
        MyInt mi = () -> System.out.println("I am display");
        mi.display();
    }
}
