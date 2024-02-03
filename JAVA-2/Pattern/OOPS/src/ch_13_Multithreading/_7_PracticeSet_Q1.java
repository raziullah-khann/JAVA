//Q1. Write a program to print "Good morning" and "welcome" continuously on the screen in java using thread.
package ch_13_Multithreading;
 class Gm extends Thread{
    @Override
    public void run() {
        while (true) {
            System.out.println("Good Morning...");
        }
    }
}
class Wlcm extends Thread{
    @Override
    public void run() {

        while (true) {
//            try{
//                Thread.sleep(200);
//            }catch (Exception e){
//                System.out.println(e);
//            }
            System.out.println("Welcome...");
        }
    }
}
public class _7_PracticeSet_Q1 {
    public static void main(String[] args) {
        Gm g = new Gm();
        Wlcm w = new Wlcm();
        g.start();
        w.start();

    }
}
