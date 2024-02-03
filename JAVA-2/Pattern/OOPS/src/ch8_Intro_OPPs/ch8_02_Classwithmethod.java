class Employee1{
    int id;
    String name;
    public void employeeDetails(){
        System.out.println("the employee1 id is " +id);
        System.out.println("The employee1 name is " +name);
    }
    public int getSalary(){
        int salary;
        if(id>10){
            salary=10000;
        }
        else {
            salary= 5000;
        }
        return salary;
    }
}
public class ch8_02_Classwithmethod {
    public static void main(String[] args){
        Employee1 sc = new Employee1();
        Employee1 Shyam = new Employee1();
        System.out.println("This is our custom class");
        sc.id=10;
        sc.name="Ram";
        System.out.println(sc.getSalary());
        sc.employeeDetails();
        Shyam.id=11;
        Shyam.name="Shyam";
        System.out.println(Shyam.getSalary());
        Shyam.employeeDetails();

    }
}
