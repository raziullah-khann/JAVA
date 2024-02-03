//q5--> Create a class TommyVecetti for rockstar games capable of hitting(print hitting...), running, firing etc.
class TommyVecetti{

        public void hit(){
                System.out.println("Hitting...");
        }
        public void run(){
                System.out.println("Running...");
        }
        public void fire(){
                System.out.println("Firing...");
        }
}
public class ch8_07_psq5{
        public static void main(String[] args) {
        TommyVecetti freefire = new TommyVecetti();
        freefire.fire();
        freefire.hit();
        freefire.run();
        }
}
