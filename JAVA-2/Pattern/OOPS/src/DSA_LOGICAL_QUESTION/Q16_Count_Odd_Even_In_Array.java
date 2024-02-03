package DSA_LOGICAL_QUESTION;

public class Q16_Count_Odd_Even_In_Array {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10,12,16,20};
        int oddCount=0;
        int evenCount=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 ==0 ) {
//                System.out.println(arr[i]);
                evenCount++;
            }
            else{
//                System.out.println(arr[i]);
                oddCount++;
            }
        }
        System.out.println("Total odd number is "+oddCount+" Total Even number is "+evenCount);
    }
}
