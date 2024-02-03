//Create a class TV which implements TvRemote interface from
// Q6 Create an interface TVRemote and use it to inherit another interface SmartTvRemote and implements.
package ch_11_Abstract;

interface TvRemote{
    void powerOn();
    void powerOff();
}
interface SmartTvRemote extends TVRemote1{
    void connectToInternet();
    void openApp(String appName);
}
class TV implements  TvRemote{


    public void powerOn(){
        System.out.println("power on...");
    };

    public void powerOff() {
        System.out.println("power off...");

    }
    public void connectToInternet(){
        System.out.println("Connect to internet...");

    };
    public void openApp(String appName){
        System.out.println("open app... "+appName);

    };
}

public class _6_PracticeSet_Q7 {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.powerOff();
    }
}


