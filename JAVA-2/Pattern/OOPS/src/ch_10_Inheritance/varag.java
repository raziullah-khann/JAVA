package ch_10_Inheritance;

public class varag {
    public void ds( String ...arr){
        for(int j =0; j<arr.length; j++){
            System.out.println(arr[j]);
        }

    }


    public static void main(String[] args) {
        varag as = new varag();
        as.ds("P","O","O","L");
    }
}
