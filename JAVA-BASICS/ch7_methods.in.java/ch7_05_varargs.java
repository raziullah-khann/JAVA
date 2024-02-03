public class ch7_05_varargs {
    // complicated method
//    public static int sum(int a,int b){
//        int c=a+b;
//        return c;
//    }
//    public static int sum(int a, int b, int c){//static optional hai
//        return a+b+c;
//    }
//    static int sum(int a, int b, int c ,int d){
//        return a+b+c+d;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("The sum of a and b is " +sum(3,4));
//        System.out.println("the sum of a , b and c is " +sum(3,4,5));
//        System.out.println("the sum of a,b,c,d are " +sum(4,56,6,5));
//    }

    //logical method
    public static int sum(int...arr){ //it works int[] arr
        int result=0;
        for (int element:arr) {
            result+=element;

        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(sum(3, 4, 5));
        System.out.println(sum(52,50,580,52,0,520,63));
    }
}
