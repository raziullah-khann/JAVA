package ch_16_2_Annotation;
@FunctionalInterface
interface Lam1{
    void meth1();
}
class Lambb implements Lam1{
    @Override
    public void meth1(){
        System.out.println("meth1");
    };

}
public class _3_Lambda_Expresion {
    public static void main(String[] args) {
        //Dynamic dispatch
        Lam1 l = new Lambb();
        l.meth1();

        //Lambda Expression
        Lam1 la = ()->{
            System.out.println("I am meth1 ");
        };
        la.meth1();
    }
}
