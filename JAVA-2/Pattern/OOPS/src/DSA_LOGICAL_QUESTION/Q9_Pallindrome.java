package DSA_LOGICAL_QUESTION;

public class Q9_Pallindrome {
    public static void main(String[] args) {
        String original="KaaK";
        String reverse = "";
        for (int i = 0; i < original.length(); i++) {
            reverse=original.charAt(i)+reverse;
        }
        System.out.println(reverse);
        if(reverse.equals(original)){
            System.out.println("It is Pallindrome");
        }
        else{
            System.out.println("It is not Pallindrome");
        }
    }
}
