//Q3. Demonstrate setPriority() and getPriority() methods in java Threads.
package ch_13_Multithreading;
class Pri1 extends  Thread{
    @Override
    public void run() {
        System.out.println("Pri1");
    }
}
class Pri2 extends  Thread{
    @Override
    public void run() {
        System.out.println("Pri2 "+this.getState());

    }
}
public class _7_PracticeSet_Q3 {
    public static void main(String[] args) {
        Pri1 p1 = new Pri1();
        Pri2 p2 = new Pri2();
        p1.setPriority(p1.MAX_PRIORITY);
        p2.setPriority(1);
        System.out.println("The priority of p1 is " +p1.getPriority());
        System.out.println("The priority of p2 is " +p2.getPriority());
        System.out.println("The priority of p2 is " +p2.getState());
        p1.start();
        p2.start();
    }
}
