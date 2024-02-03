package ch_13_Multithreading;
class T extends  Thread{
    @Override
    public void run() {
        System.out.println("T "+Thread.currentThread().getState());
    }
}
class T1 extends  Thread{
    @Override
    public void run() {
        System.out.println("T1");

    }
}
public class _7_PracticeSet_Q5 {
    public static void main(String[] args) {
        T t1 = new T();
        T1 t2 = new T1();
        System.out.println("Get reference of current Thread "+Thread.currentThread().getState());
        t1.start();
        t2.start();

    }
}
