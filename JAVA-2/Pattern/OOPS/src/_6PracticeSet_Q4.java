//Create a class rectangle to calculate area and perimeter.
class Rectangle{
    int length;
    int breadth;

    //methods
    public int area(){
        int a = length*breadth;
        return a;
    }
    public int perimeter(){
        int a = 2*(length+breadth);
        return a;
    }
}
public class _6PracticeSet_Q4 {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.length=5;
        rec.breadth=8;
        int a = rec.area();
        System.out.println("The area of rectangle is " +a);
        int b = rec.perimeter();
        System.out.println("The perimeter of rectangle is " +b);
    }
}
