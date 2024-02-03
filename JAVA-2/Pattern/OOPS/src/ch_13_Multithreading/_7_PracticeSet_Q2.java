//Q2. Add a sleep method in welcome thread of question1 to delay its execution for 200ms.
package ch_13_Multithreading;
class Gm1 extends Thread{
    @Override
    public void run() {
        while (true) {
            System.out.println("Good Morning...");
        }
    }
}
class Wlcm1 extends Thread{
    @Override
    public void run() {

        while (true) {
            try{
                Thread.sleep(200);
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Welcome...");
        }
    }
}
public class _7_PracticeSet_Q2 {
    public static void main(String[] args) {
        Gm g1 = new Gm();
        Wlcm w1 = new Wlcm();
        g1.start();
        w1.start();
    }
}
