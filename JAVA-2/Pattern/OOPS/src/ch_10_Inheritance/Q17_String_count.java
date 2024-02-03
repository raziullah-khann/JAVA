package ch_10_Inheritance;

public class Q17_String_count {
    public static void main(String[] args) {
        String name = "Raziullahkhan";
        int count=0;
        int len=name.length();
        char find = 'a';
        for(int i=0; i<len; i++) {
            if(name.charAt(i)==find){
                count++;
            }
        }
        System.out.println(count);
    }
}
