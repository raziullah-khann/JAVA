package ch_10_Inheritance;

public class Q10_Count_odd_even {
    public static void main(String[] args) {
        int [] arr= {2,5,7,9,12,17};
        int n= arr.length;
        int numberOfOdd=0,numberOfEven=0;
        for(int i = 0; i<n; i++){
            if(arr[i]%2==0){
                numberOfEven +=1;
            }
            else{
                numberOfOdd +=1;

            }
        }
        System.out.println("Total number of even number in an array is "+numberOfEven);
        System.out.println("Total number of odd number in an array is "+numberOfOdd);
    }

}
