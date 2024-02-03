public class ch5_10_continue {
    public static void main(String[] args) {
//        for(int i = 1; i<10; i++){
//
//            if(i==3){
//                System.out.println("continue the loop");
//                continue;
//            }
//            System.out.println(i);
//            System.out.println("David warner");
//        }
//
//        int j = 1;
//        while(j<5){
//            j=j+1;
//            if(j==3){
//                System.out.println("Break the loop");
//                continue;
//
//            }
//            System.out.println(j);
//            System.out.println("Johnny Bairstow");
//
//
//        }
//        System.out.println("End the loop");

        int k = 1;
        do {
            k=k+1;

            if(k==2){
                System.out.println("continue the loop");
                continue;

            }
            System.out.println(k);
            System.out.println("Rashid khan");
        }while(k<=10);
        System.out.println("End the loop");
    }
}

