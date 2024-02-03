package ch_11_Abstract;
interface ByCycle{
    int a = 5;

    void speedUp(int n);
    void speedDown(int i);

}
interface Cycle{
    int x=5;
    void breakUp(int n);
    void breakDown(int i);
}
class Aone implements ByCycle,Cycle{

//    int x=10;
    @Override
    public void breakDown(int i) {
        System.out.println("BreakDown...");
    }


    @Override
    public void breakUp(int n) {
        System.out.println("BreakUp...");
    }

    @Override
    public void speedUp(int n) {
        System.out.println("SpeedUp...");
    }
    public void speedDown(int i){
        System.out.println();
    }
}

public class _2_Interface {
    public static void main(String[] args) {
        Aone ab = new Aone();
        ab.breakDown(2);
//        ab.a=45;
        System.out.println(ab.a);
        System.out.println(ab.x);
    }
}
