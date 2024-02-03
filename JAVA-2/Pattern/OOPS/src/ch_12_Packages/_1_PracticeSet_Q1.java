package ch_12_Packages;
class Calculator{
    public void calculate(int a, int b){
        System.out.println("Your result is " + a+b);
    }
}
class SciCalculator{
    public void calculate(int a, int b){
        System.out.println("Your result is " + Math.sin(a+b));
    }
}
class HybridCalculator{
    public void calculate(int a, int b){
        System.out.println("Your result is " + Math.cos(a+b));
    }
}
public class _1_PracticeSet_Q1 {
    public static void main(String[] args) {
        System.out.println("I am a main method...");
        Calculator c = new Calculator();
        c.calculate(4,5);
        SciCalculator sc = new SciCalculator();
        sc.calculate(4,5);
        HybridCalculator hc = new HybridCalculator();
        hc.calculate(4,5);
    }

}
