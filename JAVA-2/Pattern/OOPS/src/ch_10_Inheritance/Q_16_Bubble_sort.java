package ch_10_Inheritance;

public class Q_16_Bubble_sort {
    public static void main(String[] args) {
        int [] arr = {10,15,2,7,25,12};
        System.out.println("Array element after sorting ");

        //sorting logic
        for(int i = 0; i< arr.length;i++){
            for(int j=i+1; j<arr.length; j++){
                int temp=0;
                if(arr[i]>arr[j]){
                    //swap logic
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.println(arr[i]);
        }
    }
}
