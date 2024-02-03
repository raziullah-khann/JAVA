package ch_10_Inheritance;

public class Q11_Count_Prime_number {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,6,7,8,9,10,11,12,13,14};
        int countPrime,countNotPrime;
        int n=arr.length;
        int count=0;
        for(int i=2; i<n; i++){
            if(arr[i]%i==0){
                    count=count+1;
            }

        }
        System.out.println("Total prime number is "+count);
    }
}
