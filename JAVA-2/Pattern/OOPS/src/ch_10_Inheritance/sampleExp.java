package ch_10_Inheritance;
class sample{
    private int a;

    // default constructor
    sample(){
        System.out.println("I am default constructor");
    }
    sample(int a){
        this.a =a;
    }
    public String toString(){
        return ("Value of a = "+a);
    }
}
public class sampleExp {
    public static void main(String[] args) {
        sample obj=new sample(50);
        sample obj1=new sample();
        System.out.println(obj);
        System.out.println(obj1);
    }

}
