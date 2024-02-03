//Q2. Use the Pen class from Q1 to create a concrete class FountainPen with additional method changeNib()
package ch_11_Abstract;
abstract class Pen1{
    public abstract void write();
    public abstract void refill();
}
class FountainPen extends Pen1{
    public  void write(){
        System.out.println("I am a write method");
    };
    public  void refill(){
        System.out.println("I am a refill method");

    }
    public  void changeNib(){
        System.out.println("This is a changeNib method...");
    }
}
public class _6_PracticeSet_Q2 {
    public static void main(String[] args) {
        FountainPen fp = new FountainPen();
        fp.write();

        //polymorphism
        Pen1 p1 = new FountainPen();
        p1.write();
    }
}
