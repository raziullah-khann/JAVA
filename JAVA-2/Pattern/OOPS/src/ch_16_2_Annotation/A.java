package ch_16_2_Annotation;

class A {
//    int i=m1();
    public A(){
        System.out.println("Constructor");
    }

    int m1(){
        System.out.println("m1-method");
        return 20;
    }
    {
        System.out.println("instance block");
    }

    public static void main(String[] args) {
        A obj =new A();


    }
}
