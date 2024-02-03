package ch_9_Access_Modifiers;
class EmpCon{
    private int id;
    private int salary;
    private String name;

    public EmpCon(){
        id=2;
        name="Lav";
        salary=5000;

    }
    public EmpCon(int id){
        this.id=id;
    }
    public EmpCon(int id, int salary){

    }
    public EmpCon(int id, int salary, String name){

    }

    //methods get and set1
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setName(String n){
        this.name=n;
    }
    public String setName(){
        return name;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public int getSalary(){
        return salary;
    }
}
public class _4_Constructor_Quick_Quiz {
    public static void main(String[] args) {
        EmpCon ec = new EmpCon();
        System.out.println(ec.getSalary());
    }
}