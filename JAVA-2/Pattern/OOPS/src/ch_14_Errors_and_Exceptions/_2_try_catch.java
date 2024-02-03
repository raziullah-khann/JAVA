package ch_14_Errors_and_Exceptions;

public class _2_try_catch {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        //without try
//        int c = a/b;
//        System.out.println("The result of c is " + c);
        //with try
        try{
            int c = a/b;
            System.out.println("The result of c is " + c);
        }catch (Exception e){
            System.out.println("I am not calculate this case");
            System.out.println(e);
        }
        System.out.println("End of the program");
    }
}
