package ch_13_Multithreading;
class Book implements Runnable{
    private String name;
    public Book(String name){
        this.name=name;
    }
    @Override
    public void run(){
        System.out.println("I am runnable");
    }


}
public class _4_Thread_Runnable {
    public static void main(String[] args) {
        Book b = new Book("Ram");
        Thread t1 = new Thread(b,"Thread-Ram");
        t1.start();
        System.out.println(t1.getId());
        System.out.println(t1.getName());

    }
}
