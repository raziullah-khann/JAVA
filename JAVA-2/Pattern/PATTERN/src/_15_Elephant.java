public class _15_Elephant{
    public static void main(String[]args){
        int rows=5;
        for(int i = 0; i<rows;i++){
            for(int j=1;j<=i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=rows-i; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}