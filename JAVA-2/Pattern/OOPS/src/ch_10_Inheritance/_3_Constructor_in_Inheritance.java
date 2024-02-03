package ch_10_Inheritance;
class Base1{
    public int x;
    Base1(){
        System.out.println("I am a parent constructor");
    }

    public Base1(int x) {
        System.out.println("This is a value of x " +x);
    }

}
class Derived1 extends Base1{
    public int y;

    public Derived1() {
//        super(8);
        System.out.println("I am a Derived constructor");
    }
    public Derived1(int x,int y) {
        super(x);
        System.out.println("This is a value of y " +y);
    }
}
class childOfDerived extends Derived1{
    public int y;

    public childOfDerived() {
//        super(8);
        System.out.println("I am a childOfDerived constructor");
    }
    public childOfDerived(int x,int y,int z) {
        super(x,y);
        System.out.println("This is a value of z " +z);
    }
}
public class _3_Constructor_in_Inheritance {
    public static void main(String[] args) {
        System.out.println("This is Constructor in Inheritance");
//        Base1 bs1 = new Base1();
//        Derived1 dr1 = new Derived1(4,5);
        childOfDerived cod = new childOfDerived(4,5,6);


    }
}
