package ch_10_Inheritance;
class Animal1{
    public void greet(){
        System.out.println("Good Morning");
    }
    public void name(){
        System.out.println("My name is Java in class Animal");
    }
}
class Cat extends Animal1{
    public void swagat(){
        System.out.println("Aap ka Swagat Hai");
    }
    public void name(){
        System.out.println("My name is Java in class Cat");
    }
}
public class _6_Dynamic_method_dispatch {
    public static void main(String[] args) {
//        Animal1 ani1 = new Animal1();
//        ani1.greet();
//        Cat ct = new Cat();
//        ct.name();
//        ct.greet();

        Animal1 lav = new Cat();//it is possible object creating on runtime.
        lav.name();

//        Cat lav1 = new Animal1();//child to parent not possible
//        lav1.name();
    }
}
