//Create a class TommyVecetti for rockStar games capable of hitting(print hitting ...), running, firing,etc.
class TommyVecetti{

    public void hit(){
        System.out.println("Hitting....");
    }
    public void fire(){
        System.out.println("Firing....");
    }
    public void run(){
        System.out.println("Running....");
    }
}
public class _7PracticeSet_Q5 {
    public static void main(String[] args) {
        TommyVecetti tv = new TommyVecetti();
        tv.fire();
        tv.hit();
        tv.run();
    }
}
