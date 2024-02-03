package ch_10_Inheritance;
class Base2{

    public void display(){
        System.out.println("I am Base class");
    }
}
class Child1 extends Base2{
    @Override
    public void display(){
        System.out.println("I am a Child1 class");
    }
}
class Child2 extends Child1{
    @Override
    public void display(){
        System.out.println("I am a Child2 class");
    }
}
public class ploy {
    public static void main(String[] args) {
//        Child obj = new Child();
        Base2 obj = new Child1();
        obj = new Child2();
        obj.display();
    }
}
