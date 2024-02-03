public class ch7_005_diffdiffmethod {
    public static int sum(int a,int b){
        int c=a+b;
        return c;
    }
    public static int sum(int a, int b, int c){

        return a+b+c;
    }
    static int sum(int a, int b, int c ,int d){

        return a+b+c+d;
    }

    public static void main(String[] args) {
        System.out.println("The sum of a and b is " +sum(3,4));
        System.out.println("the sum of a , b and c is " +sum(3,4,5));

    }
}
