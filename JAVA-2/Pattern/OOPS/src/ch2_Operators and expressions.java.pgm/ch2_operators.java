public class ch2_operators {
    public static void main(String[] args) {
        //1. Arithmetic operator
        float a = 3;
        float b = 5 +a;
        System.out.println("The value of b is " +b);
        float c = b/a;
        System.out.println("The value of c is " +c);
        double d = (4.4 % 2.2); // return decimal remainder
        System.out.println("The value of d is " +d);

        //2. assignment operator
        int A = 10;
        int B = 3;
        B +=3;
        A *=5;
        System.out.println("The value of B is " +B);
        System.out.println("The value of A is " +A);

        //3. comparison operator
        int x = 4;
        int y = 6;
        int z = 4;
        System.out.println(x==z);
        System.out.println(x>=z);

        //4. Logical operator
        int m = 10;
        int n = 20;
        int o = 10;
        System.out.println(m==o && n>m); // both condition true then return true
        System.out.println(m==n || m==o); // atleast one condition true then return true
        System.out.println( m!=10);

        //5. Bitwise operator--> it is work on binary number
        System.out.println(2&3);
        // & --> dono true to true
        // | --> dono me se koi ek true to true
        // 1-->0
        // 2-->10
        // 3-->11
        // 4-->100 ... so on

    }
}
