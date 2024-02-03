public class ch7_07_recursion{
    public static int factorial_iterative(int a){int factorial = 1;

        if(a==1 ||a==0){
            return 1;
        }
        else{
            for(int i = 1; i<=a; i++) {
                factorial *= i;}
                   return factorial;
        }
    }
    public static int factorial_recursion(int b){
        //int factorial = 1;
        if(b==1 || b==0){
            return 1;
        }
        else{
             return b*factorial_recursion(b-1);
        }
    }
    public static void main(String[] args) {
        int x = 5;
        System.out.println("The value of factorial is :" +factorial_iterative(x));
        System.out.println("The value of factorial is :" +factorial_recursion(x));
    }
}