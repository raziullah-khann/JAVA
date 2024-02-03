//Create methods area and volume in Create a class Rectangle use inheritance to create another class cuboid.
// Also create getter and setter
package ch_10_Inheritance;
class Rectangle1{
    public int length;
    public int breadth;

    //constructor
    public Rectangle1(int l,int b){
        this.length=l;
        this.breadth=b;
    }
    //getter and setter
    public int getLength(){
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    //method
    public double areaOfRectangle(){
        double area = length*breadth;
        return area;
    }
    public double perimeterOfRectangle() {
        double volume = 2*(length+breadth);
        return volume;
    }
}
class Cuboid1 extends Rectangle1{
    public int height;

    public Cuboid1(int l,int b,int h){
        super(l,b);
        this.height=h;
    }
    //getter and setter

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    //method
    public double areaOfCuboid(){
        double area = 2*(length*breadth+breadth*height+height*length);
        return area;
    }
    public double volumeOfCuboid(){
        double volume = length*breadth*height;
        return volume;
    }


}
public class _7_PracticeSet_Q4 {
    public static void main(String[] args) {
        Cuboid1 cb = new Cuboid1(2,3,4);
        System.out.println("Area of rectangle is "+cb.areaOfRectangle());
        System.out.println("Perimeter of rectangle is "+cb.perimeterOfRectangle());
        System.out.println("Area of Cuboid is "+cb.areaOfCuboid());
        System.out.println("Volume of Cuboid is "+cb.volumeOfCuboid());
    }
}
