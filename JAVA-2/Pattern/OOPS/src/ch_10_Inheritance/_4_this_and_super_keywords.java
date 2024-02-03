package ch_10_Inheritance;
class this_super{
    public int x;
    //constructor
    this_super(){
        System.out.println("I am a default constructor");
    }
    public this_super(int x){
        this.x=x;
        System.out.println("param " +x);
    }
    //getter
    public int getX(){
        return x;
    }

    //method
    public int returnSomething(){
        return 1;
    }
}
class Lav extends this_super{
    int y;
    //constructor

    Lav(){
        System.out.println("I am a parent default constructor " +y);
    }

    public Lav(int x, int y) {
        super(x);
        this.y = y;
        System.out.println(this.y);
    }

}

public class _4_this_and_super_keywords {
    public static void main(String[] args) {
//        this_super ts = new this_super();
        Lav lv  =  new Lav(5,6);
        System.out.println(lv.getX());
    }
}
