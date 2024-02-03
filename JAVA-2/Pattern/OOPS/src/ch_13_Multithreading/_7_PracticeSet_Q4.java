//Q4. How do you get state of a given thread in Java.
package ch_13_Multithreading;
class Khan extends  Thread{
    @Override
    public void run() {
        System.out.println("Pri1 "+this.getState());
    }
}
class Khan1 extends  Thread{
    @Override
    public void run() {
        System.out.println("Pri2");

    }
}
public class _7_PracticeSet_Q4 {
    public static void main(String[] args) {
        Khan k1 = new Khan();
        Khan1 k2 = new Khan1();
        System.out.println("Check state "+k1.getState());
        k1.start();
        k2.start();


    }
}
