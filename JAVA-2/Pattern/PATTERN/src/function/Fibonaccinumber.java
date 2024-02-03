package function;

public class Fibonaccinumber {
    public  static  int fibo(int n){
        //Base Condition
        if(n==1 || n==2){
            return n-1;
        }
        else{
            return fibo(n-1) + fibo(n-2);
        }
    }
    public static void main(String[] args) {
        System.out.println(fibo(5));
    }
}
