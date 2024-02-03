//Create a class Employee with following properties and methods.
//salary(property int).getSalary(method returning int),name(property String),getName(method returning String),setName(method change name).
class Employeee{
    int salary;
    String name;


    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public String setName(String n){
        n=name;
        return n;
    }

}
public class _3PracticeSet_Q1 {
    public static void main(String[] args) {
        Employeee emp = new Employeee();
        emp.name="Rahul";
        emp.salary =1500;
        int a = emp.getSalary();
        System.out.println("The salary is " + a);
        String b = emp.getName();
        System.out.println("The name is " + b);
        String c = emp.setName("Ram");
        System.out.println("The setName is " + c);

    }
}
