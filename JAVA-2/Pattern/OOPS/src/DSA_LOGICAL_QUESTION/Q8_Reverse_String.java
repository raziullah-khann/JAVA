package DSA_LOGICAL_QUESTION;

public class Q8_Reverse_String {
    public static void main(String[] args) {
        String str = "Raziullah";
        String reverse = "";
        for (int i = 0; i < str.length(); i++) {
//            System.out.print(str.charAt(i)+" ");
//            System.out.print(str.charAt(str.length()-1-i)+" ");
            reverse=str.charAt(i)+reverse;
        }
        System.out.println(reverse);
    }
}
