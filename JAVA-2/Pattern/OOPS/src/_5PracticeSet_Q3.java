//Create a class square with a method to initialize its side, calculating area, perimeter etc.
class Square{
    //attributes
    int side;

    //methods
    public int area(){
        int a=side*side;
        return a;
    }
    public int perimeter(){
        int a=4*side;
        return a;
    }
}
public class _5PracticeSet_Q3 {
    public static void main(String[] args) {
        Square sqr = new Square();
        sqr.side=8;
        int b= sqr.area();
        System.out.println("The area of square is " +b);
        int c= sqr.perimeter();
        System.out.println("The perimeter of square is " +c);
    }
}
