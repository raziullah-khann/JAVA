package ch_14_Errors_and_Exceptions;

public class _7_Finally_Block {
    public static int greet(){
        try {
            int a = 4;
            int b = 7;
            int c = a/b;
            return c;
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("I am a finally block");
        }
        return -1;
    }
    public static void main(String[] args) {
        int a = greet();
        System.out.println(a);

        int d = 7;
        int f = 5;
        while (true){
            try{
                System.out.println(d/f);
            }catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("I am a finally value of e = "+f);
            }
            f--;
        }

//        //kya try ke sath catch lagana jaruri hai --yes it is possible to have a try block without a catch block by using finally block
        try{
            System.out.println(50/3);
        }
        finally {
            System.out.println("Yes it is a finally");
        }
//        System.out.println(7/6);




    }
}
