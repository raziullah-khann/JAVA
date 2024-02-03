public class ch2_precedence {
    public static void main(String[] args) {
        float a = 6*7-43/2f;
        System.out.println(a);
        /*
        =42-43/2
        =42-21.5
        =20.5
         */
        double b = 6/2-7*3d;
        System.out.println(b);
        /*
        =3-7*3
        =3-21
        =-18
         */


    }
}
