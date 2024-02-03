//Q2. Create a class Rectangle use inheritance to create another class cuboid.
// Try to keep it as close to real world scenario as possible.
package ch_10_Inheritance;
class Rectangle{
    public int length;
    public int breadth;

    public Rectangle(int l,int b){
        this.length=l;
        this.breadth=b;
    }
    public double areaOfRectangle(){
        double area = length*breadth;
        return area;
    }
}
class Cuboid extends Rectangle{
    public int height;

    public Cuboid(int l,int b,int h){
        super(l,b);
        this.height=h;
    }
    public double volumeOfCuboid(){
        double volume = length*breadth*height;
        return volume;
    }
}
public class _7_PracticeSet_Q2 {
    public static void main(String[] args) {
        Cuboid cb = new Cuboid(2,3,4);
        System.out.println(cb.areaOfRectangle());
        System.out.println(cb.volumeOfCuboid());

    }
}
