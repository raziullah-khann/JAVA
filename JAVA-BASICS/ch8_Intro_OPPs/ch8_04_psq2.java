//q2-->Create a class Cellphone with method to print "ringing", "vibrating", ...etc.
class Cellphone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void calling(){
        System.out.println("Lav calling...");
    }
}
public class ch8_04_psq2 {
    public static void main(String[] args) {
        Cellphone Realme6 = new Cellphone();
        Realme6.calling();
        Realme6.vibrate();
        Realme6.ring();
    }
}
