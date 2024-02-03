package ch_9_Access_Modifiers;
class Circle{
    //data members
    private float radius;
    private float pie;

    //methods
    public float getRadius(){
        return radius;
    }
    public void setRadius(float n){
         this.radius=n;
    }
    public void setArea(){

    }





}
public class _2_Circle {
    public static void main(String[] args) {
        Circle  s = new Circle();
        s.setRadius(12.5f);
        System.out.println(s.getRadius());
    }
}
