package ch_13_Multithreading;
class Join1 extends Thread{
    public void run() {
        int i = 0;
        while(i<100){
            System.out.println("I am thread1 ");
            i++;
        }
    }
}
class Join2 extends Thread{
    public void run() {
        int i = 0;
        while(i<100){
            System.out.println("I am thread2 ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
                e.printStackTrace();
            }
            i++;
        }
    }
}
public class _6_JOIN_Method {
    public static void main(String[] args) {
        Join1 j1 = new Join1();
        Join2 j2 = new Join2();
        j1.start();
//        try{
//            j1.join();
//
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
        j2.start();
    }
}
