package ch_11_Abstract;
interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface{
//    aisa bhi kar sakte hai par oops ka principle hai DRY--Do not repeat yourself
//    isliye hum extends kar lete hai
//    void meth1();
//    void meth2();
    void meth3();
    void meth4();
}
class MySampleClass implements childSampleInterface{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}
public class _4_Inheritance_in_Interface {
    public static void main(String[] args) {
        MySampleClass msc = new MySampleClass();
        msc.meth1();
    }
}
