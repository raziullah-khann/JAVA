//Q4. Overload a constructor used to initialize a rectangle of length 4 and breadth 5 for using custom parameters.
package ch_9_Access_Modifiers;
class Rectangle{
    private int length;
    private int breadth;

    //constructor
    public Rectangle(){
        length = 4;
        breadth = 5;
        System.out.println("Welcome");
    }

    public Rectangle(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    //getter
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
}
public class _6_chap09_PracticeSet_Q4 {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
//        Rectangle rec = new Rectangle();
        System.out.println(rec.getLength());
        System.out.println(rec.getBreadth());

    }
}
