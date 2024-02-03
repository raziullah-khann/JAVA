//q6--> Create a class circle to calculate area and perimeter.
class Circle{
    double pie;
    float radius;
    public double area(){
        return pie*radius*radius;
    }
    public double circumference(){
        return 2*pie*radius;
    }
}
public class ch8_08_psq6 {
    public static void main(String[] args) {
    Circle Obj = new Circle();
    Obj.radius = 10;
    Obj.pie = 3.14;
    System.out.println("The area of the circle is " +Obj.area());
    System.out.println("The area of the circle is " +Obj.circumference());
    }
}
