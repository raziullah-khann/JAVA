//Q5. Repeat Q1 for sphere.
package ch_9_Access_Modifiers;
class Sphere{
    private int radius;

    //constructor
    public Sphere(){
        radius=5;
    }
    public Sphere(int radius){
        this.radius=radius;
    }
    //getter
    public int getRadius(){
        return radius;
    }
    //setter
    public void setRadius(int radius){
        this.radius=radius;
    }
    //surface area of sphere
    public double surfaceArea(){
        double Area = 4*Math.PI*Math.pow(radius,2);
        return Area;
    }
    //Volume of Sphere.
    public double volume(){
        double vol = (4*Math.PI*radius*radius*radius)/3;
        return vol;
    }
}
public class _6_chap09_PracticeSet_Q5 {
    public static void main(String[] args) {
        Sphere sp = new Sphere();
        System.out.println(sp.getRadius());
        System.out.println(sp.surfaceArea());
        System.out.println(sp.volume());
    }
}
