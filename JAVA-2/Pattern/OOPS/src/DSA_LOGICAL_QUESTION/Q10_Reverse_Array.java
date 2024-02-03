package DSA_LOGICAL_QUESTION;

public class Q10_Reverse_Array {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        int l=arr.length;
        int [] rev= new int[l];
        for (int i = arr.length-1; i >=0  ; i--) {
//            System.out.println(arr[i]);
            rev[i]=arr[i];
            System.out.println(rev[i]);
        }
    }
}
