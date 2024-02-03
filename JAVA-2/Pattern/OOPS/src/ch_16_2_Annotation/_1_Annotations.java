package ch_16_2_Annotation;
@FunctionalInterface
interface myFunctionalInterface{
    void meth1();
//    void meth2();
}
class Animal{
    public void greet(){
        System.out.println("Good Morning");
    }

    public void name(){
        System.out.println("My name is Animal in class Animal");
    }
}
class NewPhone extends Animal{
    @Override
    public void name(){
        System.out.println("My name is NewPhone in class Animal");
    }
    {
        System.out.println();
    }
    @Deprecated
    public int sum(int a,int b){
        return a+b;
    }
}
public class _1_Annotations {
    public static void main(String[] args) {
        @SuppressWarnings("deperecation")
        Animal a = new Animal();
        a.name();
        NewPhone np = new NewPhone();
        np.name();
        np.sum(5,6);
//        System.out.println(np.sum(5,6));//11
        Animal np1 = new NewPhone();
        np1.name();
//        System.out.println(np1.sum(5,6));//compiler error

    }
}
