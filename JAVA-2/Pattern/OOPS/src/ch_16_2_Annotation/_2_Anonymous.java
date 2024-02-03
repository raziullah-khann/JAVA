package ch_16_2_Annotation;
interface Anonymous{
    void meth1();
    void meth2();
}
class Lamb implements Anonymous{
    @Override
    public void meth1(){
        System.out.println("I am meth1");
    }
    @Override
    public void meth2(){
         System.out.println("I am meth2");
    }
}
public class _2_Anonymous {
    public static void main(String[] args) {
        Anonymous m = new Lamb();
        m.meth1();
        Anonymous a = new Anonymous() {
            @Override
            public void meth1() {
                System.out.println("I am meth1 of anonymous class");

            }

            @Override
            public void meth2() {
                System.out.println("I am meth2 of anonymous class");

            }
        };
        a.meth1();

    }
}
