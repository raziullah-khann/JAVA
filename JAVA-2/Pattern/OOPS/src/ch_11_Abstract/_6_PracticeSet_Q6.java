//Q.6 Create an interface TVRemote and use it to inherit another interface SmartTvRemote and implements.

package ch_11_Abstract;
interface TVRemote1{
    void powerOn();
    void powerOff();
    void changeChannel(int channel);
}
interface SmartTVRemote1 extends TVRemote1  {
    void connectToInternet();
    void openApp(String appName);
}
// SmartTV class implementing SmartTVRemote
class SmartTV1 implements SmartTVRemote1 {
    private boolean isPowerOn;
    private int currentChannel;

    public void powerOn() {
        isPowerOn = true;
        System.out.println("Smart TV powered on");
    }

    public void powerOff() {
        isPowerOn = false;
        System.out.println("Smart TV powered off");
    }

    public void changeChannel(int channel) {
        if (isPowerOn) {
            currentChannel = channel;
            System.out.println("Smart TV channel changed to: " + currentChannel);
        } else {
            System.out.println("Smart TV is powered off. Cannot change channel.");
        }
    }

    public void connectToInternet() {
        if (isPowerOn) {
            System.out.println("Smart TV connected to the internet");
        } else {
            System.out.println("Smart TV is powered off. Cannot connect to the internet.");
        }
    }

    public void openApp(String appName) {
        if (isPowerOn) {
            System.out.println("Smart TV opened app: " + appName);
        } else {
            System.out.println("Smart TV is powered off. Cannot open app.");
        }
    }
}
public class _6_PracticeSet_Q6 {
    public static void main(String[] args) {
        SmartTV1 smartTV = new SmartTV1();
        smartTV.powerOn();
        smartTV.changeChannel(5);
        smartTV.connectToInternet();
        smartTV.openApp("Netflix");
        smartTV.powerOff();
        smartTV.changeChannel(7);

    }
}
