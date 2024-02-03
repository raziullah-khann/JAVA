package ch_11_Abstract;
interface Camera1{
    void clickPicture();
    void recordVideo();
}
interface Gps{
    void onGps();
    void offGps();
}
interface MediaPlayer{
    void onMusic();
    void offMusic();
}
class CellPhone1 {


    public void callNumber(int number){
        System.out.println("The enter number is "+number);
    };
    void disConnectCall(){
        System.out.println("DisConnect the call");
    };
}
class SmartPhone1 extends CellPhone1 implements Camera1,Gps,MediaPlayer{
    public void clickPicture(){
        System.out.println("Click the picture ");
    }
    public void recordVideo(){
        System.out.println("Record the video ");
    }
    public void onGps(){
        System.out.println("On the gps");
    }
    public void offGps(){
        System.out.println("Off the gps");
    }
    public void onMusic(){
        System.out.println("Please on the music");
    };
    public void offMusic(){
        System.out.println("Please off the music");
    };
    public void smartPhone1Method(){
        System.out.println("I am smartphone1 method...");
    }
}
public class _5_Polymorphism_in_interfaces {
    public static void main(String[] args) {
//        SmartPhone1 sp1 = new SmartPhone1();
//        sp1.clickPicture();
//        sp1.recordVideo();
//        sp1.onGps();
//        sp1.offGps();
//        sp1.onMusic();
//        sp1.smartPhone1Method();
        Camera1 cm1 = new SmartPhone1();
        cm1.clickPicture();
//        cm1.smartPhone1Method();--throw error
    }
}
