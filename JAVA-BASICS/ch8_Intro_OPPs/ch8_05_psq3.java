//q3--> Create a class square with a method to initialize its side, calculating area, perimeter etc.
class Square{
    int side;
    public int area(){
        return side*side;
    }
    public float perimeter(){
        float P=4*side;
        return P;
    }
}
public class ch8_05_psq3 {
    public static void main(String[] args) {
        Square obj = new Square();
        obj.side=14;
        System.out.println("The area of the square is " +obj.area());
        System.out.println("The perimeter of the square is " +obj.perimeter());

    }
}
