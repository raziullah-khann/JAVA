//q4--> Create a class Rectangle to calculate area and perimeter
class Rectangle{
    int l;
    int w;
    public int area(){
        return l*w;
    }
    public int perimeter(){
        return 2*(l+w);
    }
}
public class ch8_06_psq4 {
    public static void main(String[] args) {
        Rectangle Obj = new Rectangle();
        Obj.l= 12;
        Obj.w =13;
        System.out.println("The area of rectangle is " +Obj.area());
        System.out.println("The area of rectangle is " +Obj.perimeter());
    }
}
