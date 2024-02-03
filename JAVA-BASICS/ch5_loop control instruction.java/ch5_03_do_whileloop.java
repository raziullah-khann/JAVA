public class ch5_03_do_whileloop {
    public static void main(String[] args) {
        int a = 0;
        do{
            System.out.println(a);
            a++;
        }while(a<5);

        System.out.println("Example of do while loop");
        // condition false example
        int b = 10;
        do{                          //condition false ho ya true atleast ek bar do while loop chalega he
            System.out.println(b);
            b++;
        }while(b<5);
    }
}
