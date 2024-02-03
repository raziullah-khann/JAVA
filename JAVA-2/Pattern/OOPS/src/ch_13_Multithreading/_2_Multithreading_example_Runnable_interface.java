package ch_13_Multithreading;
class MyThreadRunnable1 implements Runnable{
    @Override
    public void run(){
        int i = 0;
        while (i<100){
            System.out.println("I am good");
            i+=1;
        }
    }
}
class MyThreadRunnable2 implements Runnable{
    @Override
    public void run(){
        int i = 0;
        while (i<100){
            System.out.println("I am bad");
            i+=1;
        }
    }
}
public class _2_Multithreading_example_Runnable_interface {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);
        gun1.start();

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);
        gun2.start();
    }
}
