public class ch6_05_md_array {
    public static void main(String[] args) {
        int flats [][]= new int[2][3];
        flats [0][0]=10;
        flats [0][1]=11;
        flats [0][2]=12;
        flats [1][1]=14;
        flats [1][0]=13;
        flats [1][2]=15;

//        System.out.println(flats[1][2]);
//        System.out.println(flats.length);
//        for(int i = 0; i<flats.length; i++){
//            for (int j = 0; j< flats[i].length; j++){
//                System.out.print(flats[i][j]);
//                System.out.println("");
//            }
//            System.out.println("\n");
        for(int [] element:flats){
            for(int data:element){
                System.out.println(data);
            }
        }
    }
}
