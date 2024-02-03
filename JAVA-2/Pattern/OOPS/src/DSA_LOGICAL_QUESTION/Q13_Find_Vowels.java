package DSA_LOGICAL_QUESTION;

public class Q13_Find_Vowels {
    public static void main(String[] args) {
//        String str = "Khan";
        String str = "LAvkumar";
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a' ||str.charAt(i)=='e' || str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u'
                    ||str.charAt(i)=='A' ||str.charAt(i)=='E' || str.charAt(i)=='I' ||str.charAt(i)=='O' ||str.charAt(i)=='U'){
                count=count+1;
                System.out.println("It is vowel "+str.charAt(i));
            }
            else{
                System.out.println("It is not vowel "+str.charAt(i));
            }
        }
        System.out.println(count);
    }
}
