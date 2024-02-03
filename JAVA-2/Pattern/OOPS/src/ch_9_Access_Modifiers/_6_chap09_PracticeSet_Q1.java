//1. Create a class Cylinder use getter and setter to set its radius and height.
package ch_9_Access_Modifiers;
class Cylinder{
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
}
public class _6_chap09_PracticeSet_Q1 {
    public static void main(String[] args) {
        Cylinder cl = new Cylinder();
        cl.setRadius(12);
        cl.setHeight(7);
        System.out.println(cl.getHeight());
        System.out.println(cl.getRadius());
    }
}
