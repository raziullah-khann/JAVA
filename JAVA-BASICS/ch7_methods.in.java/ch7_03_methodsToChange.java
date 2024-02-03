public class ch7_03_methodsToChange {
    static void change (int a){
        a=45;
    }
    static void change2(int [] arr){
        arr[0]=80;
    }
    static void change3(){

    }
    public static void main(String[] args) {
       //case1: changing the integer
        int x =60;  // single value  bas 60 isiliye change nhi hua hai
        change(x);
        System.out.println("The value integer is " +x);
        //case1: changing the Array
        int[] marks = {10,20,30,40,50,90};  // ek reference hai isme multiple valur h isiliye change ho gya hai
        change2(marks);
        System.out.println("The value  array is : " + marks[0]);
    }
}
