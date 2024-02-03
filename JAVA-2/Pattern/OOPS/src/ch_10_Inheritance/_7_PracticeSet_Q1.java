//Q1. Create a class and use inheritance to create another class Cylinder from it.
package ch_10_Inheritance;
class Circle{
    public int radius;
    public Circle(){
        System.out.println("I am a default constructor of Circle");
    }
    public Circle(int r){
        System.out.println("I am a parametrise constructor of Circle");
        this.radius=r;
    }

    //methods
    public double areaOfCircle(){
        double area=Math.PI*radius*radius;
        return area;
    }
    public double periOfCircle(){
        double peri=2*Math.PI*radius;
        return peri;
    }
}
class Cylinder extends Circle{
    public int height;

    public Cylinder(){
        System.out.println("I am a default constructor of Cylinder");
    }
    public Cylinder(int r,int h){
        super(r);
        System.out.println("I am a parametrise constructor of Cylinder");
        this.height=h;
    }
    //method
    public double volumeOfCylinder(){
        double vol = Math.PI*radius*radius*height;
        return vol;
    }
    public double areaOfCylinder(){
        double area = 2*Math.PI*radius*(radius*height);
        return area;
    }


}
public class _7_PracticeSet_Q1 {
    public static void main(String[] args) {
//    Circle cr = new Circle();
    Cylinder cy = new Cylinder(4,5);
    System.out.println(cy.areaOfCircle());
    System.out.println(cy.volumeOfCylinder());
    System.out.println(cy.periOfCircle());
    System.out.println(cy.areaOfCylinder());
    }
}
