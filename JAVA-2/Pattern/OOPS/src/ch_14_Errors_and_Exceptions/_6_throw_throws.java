package ch_14_Errors_and_Exceptions;
class NegativeRadiusException extends Exception{
    @Override
    public  String toString(){
        return "Radius cannot be negative toString";
    }
    @Override
    public  String getMessage(){
        return "Radius cannot be negative getMessage";
    }
}
public class _6_throw_throws {
    public static double area(int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI*r*r;
        return result;
    }
    public static  double div(int a, int b) throws ArithmeticException{
        // Made by Khan
        int c = a/b;
        return c;
    }
    public static void main(String[] args) {
        //Lav - use div function created by Khan
        try{
//            double a = div(10,0);
//            System.out.println(a);
            double a = area(-5);
            System.out.println(a);
        }catch(Exception e ){
            System.out.println("Exception");
            System.out.println(e);
        }


    }
}
