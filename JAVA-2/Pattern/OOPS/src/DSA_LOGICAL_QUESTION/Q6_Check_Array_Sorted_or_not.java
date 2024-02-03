package DSA_LOGICAL_QUESTION;

public class Q6_Check_Array_Sorted_or_not {
    public static void main(String[] args) {
        int [] arr = {1,2,10,50,60};
        boolean sorted=false;
        for(int i=0; i< arr.length; i++){
//            System.out.println(arr[i+1]);
            if(arr[i]>arr[i+1]){
                sorted=false;
                break;
            }
            else{
                sorted=true;
//                break;
            }
        }
        if(sorted){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }
}
