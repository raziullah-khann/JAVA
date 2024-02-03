//Q3. Use Constructor Create a class Cylinder use getter and setter to set its radius and height.
package ch_9_Access_Modifiers;
class Cylinder2{
    private int radius;
    private int height;

    public Cylinder2(int radius, int height){
        this.radius=radius;
        this.height=height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    //surface area of cylinder
    public double surfaceArea(){
        double Area = 2*(3.1416)*radius*(radius+height);
        return Area;
    }
    public double volume(){
        double vol = (Math.PI)*radius*radius*height;
        return vol;
    }
}
public class _6_chap09_PracticeSet_Q3 {
    public static void main(String[] args) {
        Cylinder2 cl2 = new Cylinder2(9,12);
        //in case of constructor hum nhi bhi set karenge height or radius to chalega
//        cl2.setHeight(7);
//        cl2.setRadius(5);
        double a = cl2.getHeight();
        double b = cl2.getRadius();
        System.out.println(a);
        System.out.println(b);
        System.out.println("The area of cylinder is " + cl2.surfaceArea());
        System.out.println("The volume of cylinder is " + cl2.volume());
    }
}
