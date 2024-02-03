package ch_10_Inheritance;
class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("This is setter");
        this.x = x;
    }

    public  void printMe(){
        System.out.println("This is method");
    }
//    public Base(){
//        System.out.println("This is constructor");
//    }
}
class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class _1_Inheritance {
    public static void main(String[] args) {
        System.out.println("This is Inheritance");
        Base bs = new Base();
        bs.setX(4);
//        System.out.println(bs.getX());

        //Derive class
        Derived dv = new Derived();
//        dv.setY(5);
        System.out.println(dv.getY());
        System.out.println(dv.getX());

    }
}
