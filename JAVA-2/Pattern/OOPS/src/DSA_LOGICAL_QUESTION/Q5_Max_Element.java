package DSA_LOGICAL_QUESTION;

public class Q5_Max_Element {
    public static void main(String[] args) {
        int [] arr = {-50,10,15,2,7,25,12};
        int max = arr[0];
        for(int ele:arr){
            if(ele>max){
                max=ele;
            }
        }
        System.out.println(max);
    }
}
