package ch_13_Multithreading;
class MyThread1 extends Thread{
    public  void run(){
        int i =0;
        while (i<400){
            System.out.println("I am cooking ");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    public  void run(){
        int i =0;
        while (i<400){
            System.out.println("I am Chating ");
            i++;
        }
    }
}
public class _1_Multithreading_example {
    public static void main(String[] args) {
        MyThread1 m1 = new MyThread1();
        MyThread2 m2 = new MyThread2();
        m1.start();
        m2.start();
    }
}
