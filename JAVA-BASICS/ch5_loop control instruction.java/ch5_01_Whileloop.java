public class ch5_01_Whileloop {
    public static void main(String[] args) {
        System.out.println("Simple number print");
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println("While loop using");
        int a = 1;
        while(a<=10) {            //agar pahli baar me condition false ho gya to direct he loop se bahar nikal jayega
            System.out.println(a);
            a++;
        }
        /*System.out.println("Infinity loop");
        while(true){
            System.out.println("khan");
        }*/
    }
}
