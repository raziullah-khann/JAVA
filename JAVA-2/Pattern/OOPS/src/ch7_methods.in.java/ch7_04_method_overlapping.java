public class ch7_04_method_overlapping {
    static void foo(){
        System.out.println("Good morning bro! ");
    }
    static void foo(String a){
        System.out.println("Good morning " + a + " bro!");
    }
    static void foo(String a ,int b){
        System.out.println("Good morning " + a + " and " + b +" bro");
    }
    public static void main(String[] args) {
        foo();
        foo("Ram");
        foo("lav",540);
    }
}
