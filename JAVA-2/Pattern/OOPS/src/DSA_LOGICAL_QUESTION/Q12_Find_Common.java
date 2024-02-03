package DSA_LOGICAL_QUESTION;

public class Q12_Find_Common {
    public static void main(String[] args) {
        int [] arr1 = {10,20,30,40,50};
        int [] arr2 = {10,2,20,13,14};
        int [] arr3 = {9,10,21,22,23,20};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i]==arr2[j]){
                    arr2[j]=arr1[i];
//                    System.out.println(arr2[j]);
                    for (int k = 0; k < arr3.length; k++) {
                        if(arr2[j]==arr3[k]){
                            System.out.println(arr3[k]);
                        }
                    }
                }

            }


        }
//        float x = (78*3)/(8-3)*(12-11);
//        System.out.println(x);
    }
}
