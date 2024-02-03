package DSA_LOGICAL_QUESTION;
public class Q7_Missing_element {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,6};
        int sum=0;
        int total=0;
        System.out.println("length "+arr.length);
        for (int i = 1; i <= arr.length+1 ; i++) {
            total=total+i;
        }
        for(int i=0; i< arr.length; i++){
            sum=sum+arr[i];
        }
        System.out.println("sum "+sum);
        System.out.println("total "+total);
        int result=total-sum;
        System.out.println("missing "+result);
    }

}
