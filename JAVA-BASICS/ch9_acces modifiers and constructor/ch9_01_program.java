class Mydata{
    String s;
    int Rn;
    String En;
    public void main(){
        System.out.println("The name is " +s);
        System.out.println("The roll no is " +Rn);
        System.out.println("The Enrollment no is " +En);
    }
}
public class ch9_01_program {
    public static void main(String[] args) {
        Mydata sc = new Mydata();
        sc.s = "Khan";
        sc.Rn = 12;
        sc.En = "20SOECE11031";
        sc.main();
    }
}
