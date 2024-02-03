// create a class employee with following properties and methods:
//-- Salary(property int)
//--getSalary(method returning int)
//--name(property String)
//--getName(method returning int)
//--setName(method changing name)
class Employee2{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public String setName(String n){
        return name = n;
    }

}
public class ch8_03_psq1 {
    public static void main(String[] args) {
        Employee2 obj = new Employee2();
        obj.salary = 10000;
        obj.name = "Khan";
        System.out.println(obj.getSalary());
        System.out.println(obj.getName());
        System.out.println(obj.setName("Lav"));

    }
}
