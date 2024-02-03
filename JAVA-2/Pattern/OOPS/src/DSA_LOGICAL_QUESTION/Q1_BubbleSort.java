package DSA_LOGICAL_QUESTION;

public class Q1_BubbleSort {
    public static void main(String[] args) {
        int arr[] = {12, 13, 14, 15, 10};
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
            System.out.print(arr[i] + " ");

//    output:runtime error
//            12,13,14,15,10
//            10,12,13,14,15
//             None of these

        }

    }
}
