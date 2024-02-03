import java.util.Scanner;

public class ch7_09_ps {
    //q1--> Write a java method to print multiplication table of a number n.
//    public static void multiplication_table(int a){
//        int b;
//        for(int i =1; i<=10; i++){
//            b=a*i;
//            System.out.println(a + "*" + i + "=" + b);
//        }
//    }
//    public static void main(String[] args) {
//        System.out.println("Enter your number : ");
//        multiplication_table(5);
//    }

    //q2--> Write a program using function to print the following pattern.
//    *
//    **
//    ***
//    ****
//    public static void pattern(int n){
//        for(int i =0; i<n; i++){
//            for(int j=0; j<i+1; j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
//    }
//    public static void main(String[] args) {
//        pattern(4);
//    }

    //q3--> Write a recursive function to calculate sum of first n natural numbers.
//    normal function call
//    public static int sum(int n){
//        int result =0;
//        for(int i=1; i<=n; i++){
//            result=result+i;
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(sum(10));
//    }
    //recursive method
    public static int recursive_sum(int n){
      if (n==1){
          return 1;
      }
      else{
          return n+recursive_sum(n-1);
      }
    }

    public static void main(String[] args) {
        System.out.println(recursive_sum(10));
    }

    //q4--> Write a function to print the following pattern.
//    ****
//    ***
//    **
//    *
//    public static void pattern(int n){
//        for( int i = n; i>0; i--){
//            for(int j= 0; j<i; j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
//    }
//    public static void main(String[] args) {
//        pattern(4);
//    }

    //q5-->Write a function to print n^th term of fibonacci series using recursion.
//    public static int fibonacci_series(int n){
//        if(n==1){
//            return 0;
//        }
//        else if(n==2){
//            return 1;
//        }
//        else{
//            return fibonacci_series(n-1) + fibonacci_series(n-2);
//        }
//    }
//    public static void main(String[] args) {
//        System.out.println(fibonacci_series(5));
//    }

    //q6--> write a function to find an average of a set of number passed as arguments.
//    public static double avg(float...arr){
//        float average;
//        float sum = 0;
//        for(float element:arr){
//            sum=sum+element;
//        }
//        System.out.println(sum);
//        average = (sum/ arr.length);
//        return average;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("The average is " + avg(60,60,60,60,60,60,60,65));
//    }

    //9-->Write a function to convert celsius temperature into fahrenheit.
    //(1C * 9/5) +32=33.8f
//    public static float cel_to_fah( float a){
//        float fahrenheit;
//        fahrenheit = (a * 9/5) + 32;
//        return fahrenheit;
//    }
//    public static void main(String[] args) {
//        System.out.print("Enter your celsius : ");
//        Scanner sc = new Scanner(System.in);
//        float a = sc.nextFloat();
//        System.out.println("The fahrenheit value is " +cel_to_fah(a));
//    }

    //q10-->Write a iterative approach function to calculate sum of first n natural numbers.
//    public static int sum_of_Natural(int n){
//        int sum = 0;
//        for(int i=1;i<=n; i++){
//            sum=sum+i;
//        }
//        return sum;
//    }
//    public static void main(String[] args) {
//        System.out.print("enter your number : ");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        System.out.println("The sum of first n natural number is : " +sum_of_Natural(a));
//    }

}
