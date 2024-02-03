//Q4. Create a class Telephone with ring(), lift() and disconnect() methods as abstract methods .
//Create another class SmartTelephone and demonstrate polymorphism.

package ch_11_Abstract;

abstract class Telephone{
    public abstract void ring();

    public abstract void lift();

    public abstract void disconnect();
}
class SmartTelephone extends Telephone{
    public  void ring(){
        System.out.println("ring...");
    };

    public void lift(){
        System.out.println("lift...");
    };

    public void disconnect(){
        System.out.println("disconnect...");
    };
    public void hello(){
        System.out.println("Hello World...");
    };
}
public class _6_PracticeSet_Q4 {
    public static void main(String[] args) {

        Telephone tel = new SmartTelephone();
        tel.disconnect();


    }
}
