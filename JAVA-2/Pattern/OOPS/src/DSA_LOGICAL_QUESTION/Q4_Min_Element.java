package DSA_LOGICAL_QUESTION;

public class Q4_Min_Element {
    public static void main(String[] args) {
        int [] arr = {10,15,2,7,25,12};
        int min =arr[0];
        for(int ele:arr){
            if(ele<min){
                min=ele;
            }

        }
        System.out.println(min);

    }
}
