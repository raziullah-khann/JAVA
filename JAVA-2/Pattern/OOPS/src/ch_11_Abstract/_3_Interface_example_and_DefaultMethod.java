package ch_11_Abstract;
interface Camera{
    void takeSnap();
    void recordVideo();
}
interface Wifi{
    String [] getNetworks();
    void connectToNetwork(String network);
    private void greet(){
        System.out.println("Welcome khan");
    }
    default void mydefault(){
        greet();
        System.out.println("Welcome default method...");
    }
}
class CellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }

}
class SmartPhone extends CellPhone implements Camera, Wifi {
    public void takeSnap(){
        System.out.println("Taking Snap...");
    };
    public void recordVideo(){
        System.out.println("Taking Video...");
    };
        public void mydefault(){
        System.out.println("Welcome default method cel...");
    }
    public String [] getNetworks(){
        String [] network={"hello","khan","Varun","Vayu"};
        return network;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to "+network);
    }

}
public class _3_Interface_example_and_DefaultMethod {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.pickCall();
        sp.callNumber(1234567890);
        sp.mydefault();
        String [] arr=sp.getNetworks();
        for(String element:arr){
            System.out.println(element);
        }


    }
}
