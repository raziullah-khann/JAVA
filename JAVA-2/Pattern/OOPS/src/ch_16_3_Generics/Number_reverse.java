package ch_16_3_Generics;

public class Number_reverse {
    public static void main(String[] args) {
        int a = 100;
        String st = "";
        String r = String.valueOf(a);
        System.out.println(a+100);   //-->200
        System.out.println(r+100);  //-->100100
        String s = Integer.toString(a);
        for (int i = 0; i < s.length(); i++) {
            st = s.charAt(i)+st;
        }
        System.out.println(st);
    }
}
