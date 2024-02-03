package ch_10_Inheritance;

public class q12 {
    public void display(int x){
        System.out.println("parenat "+x);
    }
    public void display(String x){
        System.out.println("child " +x);
    }
    public static void main(String[] args) {
        q12 q = new q12();
        q.display('d');

    }
}
