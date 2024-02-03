package ch_10_Inheritance;
class Vehical{
    public String Name;

    //methods
    public String meth1(){
        System.out.println("This is method 1 of class Vehical");
        return this.Name=Name;
    }
    public void meth2(){
        System.out.println("This is method 2 of class Vehical");
    }

}
class Car extends Vehical{
    public String color;

    //method
    @Override
    public void   meth2(){
        System.out.println("This is method 2 of Class Car");
    }
    public String meth3(){
        System.out.println("This is method of Class Car");
        return this.color=color;
    }
}
public class _5_Override {
    public static void main(String[] args) {
        Vehical vl = new Vehical();
        vl.meth2();

        Car cr = new Car();
        cr.meth2();

    }
}
