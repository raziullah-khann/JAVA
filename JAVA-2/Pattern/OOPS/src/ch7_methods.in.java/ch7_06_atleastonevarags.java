public class ch7_06_atleastonevarags {
    public static int sum(int a,int...arr){
        int result =a;
        for (int element:arr) {
            result+=element;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(sum(3,4,5));
        System.out.println(sum(4,6,7,8,9));
    }
}

