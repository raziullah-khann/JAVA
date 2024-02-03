package DSA_LOGICAL_QUESTION;

public class Q17_Count_PrimeNo_In_Array {
    public static void main(String[] args) {
//        int [] arr = {1,2,3,4,5,6,7,8,9,10,12,16,20};
        int [] arr = {1,2,3,5,8,10};
//        int count=0;
//        int count2=0;
//            for (int i = 0; i < arr.length ; i++) {
//                if(arr[i] >1) {
//                    int j=2;
//                    if (arr[i] % j == 0) {
////                        j++;
//                        j=j+i;
////                        if(arr[i]==2){
////                            count2+=1;
////                        }
////                        count++;
//                    }
//                    else{
//                        count++;
//                    }
//                }
//            }
//        System.out.println(count);



        int count =0;
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]>1){
                boolean flag = true;
                for (int i = 2; i < arr[j]-1; i++) {
                    if (arr[j] % i == 0) {
                        flag = false;
                    }
                }
                if (flag) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
