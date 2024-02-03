//Create a class cellphone with method to print "ringing","vibrating" ...etc
class Cellphone{
    public void ring(){
        System.out.println("ringing....");
    }
    public void vibrate(){
        System.out.println("vibrating....");
    }

    public void call(){
        System.out.println("calling....");
    }
}
public class _4PracticeSet_Q2 {
    public static void main(String[] args) {
        Cellphone phone  = new Cellphone();
        phone.ring();
        phone.vibrate();
        phone.call();
    }
}
