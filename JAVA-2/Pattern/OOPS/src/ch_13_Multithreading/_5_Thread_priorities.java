package ch_13_Multithreading;
class ThreadPriorities extends Thread{
    public ThreadPriorities(String name){
        super(name);
//        System.out.println("I am constructor");
    }
    public void run(){
//        while (true) {
            System.out.println("I am good " + this.getName());
//        System.out.println(Thread.currentThread());
//        }
    }
}
public class _5_Thread_priorities {
    public static void main(String[] args) {
        ThreadPriorities t1 = new ThreadPriorities("Khan1");
        ThreadPriorities t2 = new ThreadPriorities("Khan2");
        ThreadPriorities t3 = new ThreadPriorities("Khan3");
        ThreadPriorities t4 = new ThreadPriorities("Khan4");
        ThreadPriorities t5 = new ThreadPriorities("Khan5");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(2);
        t5.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        System.out.println("The priority of t1 is " +t4.getPriority());


    }
}
