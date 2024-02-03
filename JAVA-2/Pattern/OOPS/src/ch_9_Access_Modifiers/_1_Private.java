package ch_9_Access_Modifiers;
class MyEmoloyee{
    private int id;
    private String name;

    //methods
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
public class _1_Private {
    public static void main(String[] args) {
        MyEmoloyee me = new MyEmoloyee();
//        me.id=17;
//        me.name="Raziullah"; //Thrown an error-->java: id,name has private access in ch_9_Access_Modifiers.MyEmoloyee
        me.setName("Raziullah");
        me.setId(5);
        System.out.println(me.getId());
        System.out.println(me.getName());
    }
}
