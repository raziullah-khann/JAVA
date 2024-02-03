public class ch4_LogicaOperators {
    public static void main(String[] args) {
        System.out.println("LOGICAL AND(&&) OPERATOR");
        //boolean a = true;
        //boolean b = true;
        int a = 4;
        int b = 4;
        int o = 5;
        if(a == b && b== o){                      // all condition true then return true
            System.out.println("answer is true");
        }
        else{
            System.out.println("answer is false");
        }

        System.out.println("LOGICAL OR(||) OPERATOR");
        boolean c = true;
        boolean d = true;
        boolean e = false;
        if(c||d ||e){                  // atleast one condition true then return true
            System.out.println("answer is true");
        }
        else{
            System.out.println("answer is false");
        }

        System.out.println("LOGICAL NOT(!) OPERATOR");  //agar true h to false, false h to true
        boolean s = true;
        boolean t = false;
        System.out.println(!s);
        System.out.println(!t);

    }
}
