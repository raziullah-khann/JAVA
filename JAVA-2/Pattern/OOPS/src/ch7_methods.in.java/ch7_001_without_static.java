public class ch7_001_without_static {
    int myans(int x,int y){
        int z;
        if(x>y){
            z = x+y;
            return z;
        }
        else{
            z=x*y;
            return z;
        }
    }
    public static void main(String[] args) {
        int r,s,t;
        r=45;
        s=69;
        ch7_001_without_static obj = new ch7_001_without_static();
        t = obj.myans(r,s);
        System.out.println(t);

    }
}

