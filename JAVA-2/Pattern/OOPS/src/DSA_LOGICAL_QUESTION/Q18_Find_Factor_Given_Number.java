package DSA_LOGICAL_QUESTION;

public class Q18_Find_Factor_Given_Number {
    public static void main(String[] args) {
        int num=12;
        for (int i = 1; i <=num ; i++) {
            if(num%i==0){
                System.out.println(i);
            }
        }
    }
}
