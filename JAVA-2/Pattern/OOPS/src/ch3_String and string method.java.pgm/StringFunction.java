import java.util.Locale;

public class StringFunction {
    public static void main(String[] args) {
        String a = "Welcome to the World";//0
        System.out.println(a);

        int b = a.length();  //1
        System.out.println(b);
               //  OR
        //System.out.println(a.length());

        //String c = a.toLowerCase();  //2
        //System.out.println(c);
            //OR
        System.out.println(a.toLowerCase());

        String d = a.toUpperCase();  //3
        System.out.println(d);

        String A = "     Ram is a boy     "; //4
        String e = A.trim();
        System.out.println(e);

        String f = a.substring(5);  //5
        System.out.println(f);

        String g = a.substring(3,20); //6
        System.out.println(g);

        String h = a.replace("o","s");  //7
        System.out.println(h);

        boolean i = a.startsWith("We");  //8
        System.out.println(i);

        boolean j = a.endsWith("ram");  //9
        System.out.println(j);

        char k = a.charAt(8);   //10
        System.out.println(k);
        //OR
        System.out.println(a.charAt(3));

        int l = a.indexOf("e");  //11
        System.out.println(l);
        int ll = a.indexOf("z");  //11
        System.out.println(ll);

        int m = a.indexOf("e",5);  //12
        System.out.println(m);  //output 6
        int n = a.indexOf("me",2);  //12  //pahle word ko dekhega jaise ki isme m hai baki aage wale ko ignore karega
        System.out.println(n);  //output 5

        int o = a.lastIndexOf("l");  //13
        System.out.println("last index " +o);  //output 18

        int p = a.lastIndexOf("o",3);  //14
        System.out.println("the last index " +p);  //output 1

        boolean q = a.equals("rahul");  //15
        System.out.println(q);  //outpur false

        boolean r = a.equalsIgnoreCase("welcome to the world");  //16
        System.out.println(r);  //output true


    }
}
