package ch_11_Abstract;
abstract class Parent{
    public Parent(){
        System.out.println("I am a constructor of Parent cLass");
    }
    public void sayHello(){
        System.out.println("Hello...");
    }
    public abstract void greet();
    public abstract void greet1();
}
class  Child extends Parent{
    @Override
  public void greet(){
      System.out.println("Hello Abstract Methods greet");
  }
    @Override
    public void greet1(){
        System.out.println("Hello Abstract Methods greet1");
    }
}
abstract class Child1 extends Parent{
    public void th(){
        System.out.println("I am good");
    }
}
public class _1_Abstract_Class_and_Method {
    public static void main(String[] args) {
        //Parent p = new Parent();    ---error
//        Parent f = new Child();
        Child c = new Child();
        c.greet();
        c.greet1();

//        Child1 c1 =new Child1();   //---error


    }
}
