public class ch3_ps {
    public static void main(String[] args) {
        /*question 1 --> convert a string to lowercase
        String a = "David Warner is an Australian batsman";
        String b = a.toLowerCase();
        System.out.println(b);
        */

        /*question 2 --> to replace space with underscore
        String c = "David Warner is an Australian batsman";
        String d = c.replace(" ","_");
        System.out.println(d);
        */

        /*question 3 --> to fill in a letter template which looks like below
        letter = "Dear <|name|>, Thanks a lot"
        Replace <|name|> with a string (some name) */
        //String letter = "Dear <|name|>, Thanks a lot ";
        //String e = letter.replace("<|name|>","Raziullah");
        //System.out.println(e);

        /* question 4 --> to detect double and triple spaces in a string
        String detect = "David Warner  is an   Australian batsman";
        int r = detect.indexOf("  ");
        int s = detect.indexOf("   ");
        System.out.println(r);
        System.out.println(s);*/

        /* question 5 --> to fomat the following letter using escape sequence character
        letter = "Dear Harry, This is Java course is nice. Thanks"
         */
        String letter = "Dear Harry,\n\tThis is Java course is nice.\nThanks";
        System.out.println(letter);


    }
}
