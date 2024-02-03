package ch_10_Inheritance;
class Base3{
    private int a;
    public Base3(int a){
        this.a=a;
        System.out.println("I am base constructor " +a);
    }
}
class Child extends Base3{
    public Child(){
        super(35);
        System.out.println("I am Child constructor");

    }
}
public class cons_in_heri {
    public static void main(String[] args) {
        Child ch = new Child();

    }
}
