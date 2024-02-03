package ch_9_Access_Modifiers;
class MyConstructor{
    private int id;
    private String name;

        public MyConstructor(){
            id=4;
            name="Raziullah";
        }
        public MyConstructor(int id) {
        this.id = id;
        }
        public MyConstructor(int myid,String myName) {
        this.id = myid;
        this.name=myName;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        this.id= i;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name=n ;
    }
}
public class _3_Constructor {
    public static void main(String[] args) {
        MyConstructor con = new MyConstructor();
        System.out.println(con.getId());
        System.out.println(con.getName());
    }
}

