import java.util.Locale;

public class ch3_String_methods {
    public static void main(String[] args) {
        String a = "Khanaaaah";
        System.out.println(a);

        int b = a.length();
        System.out.println(b);  //to find the length of the string

        String c = a.toLowerCase();  // to convert the lower case
        System.out.println(c);

        String d = a.toUpperCase();  // to convert the upper case
        System.out.println(d);

        String sc = "   Ram   ";
        String e = sc.trim();  // to remove the space in the sentence
        System.out.println(e);

        String f = a.substring(2);  //to print subsrting start 2 index goes to so on
        System.out.println(f);

        String g = a.substring(0,4);  // to print new substring start index 0 to end index 4
        System.out.println(g);

        String h = a.replace('a','t');  // replace the character in the string jaha jaha a h waha waha t kar dega
        System.out.println(h);

        String i = a.replace("n","tam");  //replace n with tam
        System.out.println(i);

        boolean st = a.startsWith("K"); // jo out put chahiye usi base pe datatype declare karo
        System.out.println(st); // output true ,original string start k return true

        System.out.println(a.endsWith("n")); //output true  //original string end n return true

        char bd = a.charAt(3);  // to find the character given index number
        System.out.println(bd);  //output n

        int ba = a.indexOf("h");  //to find the index number at given character
        System.out.println(ba);  //output 1
        int bb = a.indexOf("s",2);  //to find the index number at given character
        System.out.println(bb);  //output -1

        int bc = a.lastIndexOf("a");  // jaha pe given characater sabse last me hoga uska index number print karega
        System.out.println(bc);  //output 2

        int be = a.lastIndexOf("h",2);  //jo bhi given character find karna hai ka index number find karega
                                                       //last ke 2 character ko chhod ke
        System.out.println(be);  //output 1

        boolean bf = a.equals("Khan");   //given string original string ke sath match ho gya to true nhi to  false
        System.out.println(bf);  //output true

        boolean bg = a.equalsIgnoreCase("khaN");  //isme case ko ignore karega lower ho ya upper agar value same h to true nhi to false
        System.out.println(bg);  //output true







    }
}
