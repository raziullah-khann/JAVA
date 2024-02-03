public class ch5_09_break {
    public static void main(String[] args) {
//        for(int i = 1; i<10; i++){
//            System.out.println(i);
//            System.out.println("David warner");
//            if(i==3){
//                System.out.println("Break the loop");
//                break;
//            }
//        }
//
        int j = 1;
        while(j<=10){
            System.out.println(j);
            System.out.println("Johnny Bairstow");
            if(j==2){
                System.out.println("Break the loop");
                break;
            }
            j=j+1;
        }
        System.out.println("End the loop");

//        int k = 1;
//        do {
//            System.out.println(k);
//            System.out.println("Rashid khan");
//            if(k==2){
//                System.out.println("Break the loop");
//                break;
//            }
//                k=k+1;
//        }while(k<=10);
//        System.out.println("End the loop");
    }
}
