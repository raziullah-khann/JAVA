package DSA_LOGICAL_QUESTION;

public class first_and_last_element {
    public static void main(String[] args) {
        int [] arr = {5,7,7,8,8,10};
        int tar_ele = 50;
        for (int i = 0; i < arr.length; i++) {
            if(tar_ele==arr[i]){
                System.out.println(i);
                break;
            }
        }

        for (int i = arr.length-1; i >=0; i--) {
            if(tar_ele==arr[i]){
                System.out.println(i);
                break;
            }
        }

        for (int x:arr) {
            if(tar_ele!=x){
                System.out.println("-1");
            }
            break;
        }




    }
}
