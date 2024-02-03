public class T1_question14 {
        public void chr_to_str(){
                char [] arr = {'R','a','z','i','u','l','l','a','h'};
                String a = String.copyValueOf(arr);
                System.out.println("Our array is after applying copyValueOf() method: " +a);
        }
        public void str_conc(){
                String name1 = "Raziullah";
                String name2 = "khan";
                System.out.println("The string concrete is " +name1+name2);
        }
        public void string_method(){
                String name1 = "Raziullah";
                String name2 = "khan";
                String name3 = "    Hello   ";
                System.out.println("To find length of our string " +name1.length());
                System.out.println("To convert lowercase " + name1.toLowerCase());
                System.out.println("To convert into upper case " +name1.toUpperCase());
                System.out.println("To trim the white space after and before string " +name3.trim());
                System.out.println("Return substring " +name1.substring(2));
                System.out.println("Return substring " +name1.substring(1,1));
                System.out.println("To replace old word into new word " +name2.replace("j","s"));
                System.out.println("To detect our string start given instruction or not " +name1.startsWith("R"));
                System.out.println("To detect our string end given instruction or not " +name2.endsWith("s"));
                System.out.println("To find character given index number " +name1.charAt(4));
                System.out.println("To find index number given character " +name1.indexOf("z"));
                System.out.println("To find index number number start given index number " +name1.indexOf("s",4));
                System.out.println("To search last index number to given character " +name1.lastIndexOf("a"));
                System.out.println("To search index number with given portion " +name1.lastIndexOf("a",3));
        }
        public static void main(String[] args) {
                //char [] arr = {'R','a','j','a','n'};
                //String a = String.copyValueOf(arr);
                //System.out.println("Our array is after applying copyValueOf() method: " +a);
                String sc = new String();
                T1_question14 bc = new T1_question14();
                bc.chr_to_str();
                bc.string_method();
                bc.str_conc();


        }
}
