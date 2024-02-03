//Create method area and volume in Create a class and use inheritance to create another class Cylinder from it.
package ch_10_Inheritance;
class Circle1{
    public int radius;
    public Circle1(){
        System.out.println("I am a default constructor of Circle");
    }
    public Circle1(int r){
        System.out.println("I am a parametrise constructor of Circle");
        this.radius=r;
    }

    //methods
    public double areaOfCircle(){
        double area=Math.PI*radius*radius;
        return area;
    }
    public double perimeterOfCircle(){
        double perimeter=2*Math.PI*radius;
        return perimeter;
    }
}
class Cylinder1 extends Circle{
    public int height;

    public Cylinder1(){
        System.out.println("I am a default constructor of Cylinder");
    }
    public  Cylinder1(int r, int h){
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

public class _7_PracticeSet_Q3 {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder(4,5);
        System.out.println(cy.areaOfCircle());
        System.out.println(cy.volumeOfCylinder());
        System.out.println(cy.periOfCircle());
        System.out.println(cy.areaOfCylinder());
    }
}
