package ch_13_Multithreading;
class ConstInThread extends Thread{
//    public ConstInThread(String khan) {
//    }
    public ConstInThread(String name){
        super(name);
    }

    @Override
    public void run() {
//        int id = 34;
        System.out.println("Thank you");
//        while (true){
//            System.out.println("I am a Thread");
//        }


    }
}
public class _3_Constructors_in_thread {
    public static void main(String[] args) {
        ConstInThread cit1 = new ConstInThread("Raziullah");
        ConstInThread cit2 = new ConstInThread("Khan");
        cit1.start();
        cit2.start();
        System.out.println("The id of thread is " +cit1.getId());
        System.out.println("The name of thread is " +cit1.getName());
        System.out.println("The id of thread is " +cit2.getId());
        System.out.println("The name of thread is " +cit2.getName());

    }

}
