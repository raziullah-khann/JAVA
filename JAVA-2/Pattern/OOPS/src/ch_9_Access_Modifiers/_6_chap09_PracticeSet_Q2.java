//2. Use Q1 to calculate surface area and volume of the cylinder.
//volume of cylinder is v=pie*radius*radius*height
//surface area of cylinder A=2*pie*Radius(Radius+height)
package ch_9_Access_Modifiers;
class Cylinder1{
    private int radius;
    private  int height;

    //getters and setters
    public void setRadius(int radius1){
        this.radius=radius1;
    }
    public int getRadius(){
        return radius;
    }
    public void setHeight(int height1){
        this.height=height1;
    }
    public int getHeight(){
        return height;
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
public class _6_chap09_PracticeSet_Q2 {
    public static void main(String[] args) {
        Cylinder1 cl1 = new Cylinder1();
        cl1.setHeight(7);
        cl1.setRadius(5);
        System.out.println("The area of cylinder is " + cl1.surfaceArea());
        System.out.println("The volume of cylinder is " + cl1.volume());

    }
}
