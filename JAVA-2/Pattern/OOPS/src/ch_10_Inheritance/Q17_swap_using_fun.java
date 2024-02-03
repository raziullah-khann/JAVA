package ch_10_Inheritance;
public class Q17_swap_using_fun {
    public void swap(int ... arr){
        int temp, a,b;
        temp=arr[0];
        arr[0]=arr[1];
        arr[1]=temp;




//        System.out.println("The value of " +arr[0]);
//        System.out.println(arr[1]);

    }


    public static void main(String[] args) {
        Q17_swap_using_fun s = new Q17_swap_using_fun();
        int a = 4;
        int b = 5;
        s.swap(a,b);
        System.out.println(a);
        System.out.println(b);
    }
}
