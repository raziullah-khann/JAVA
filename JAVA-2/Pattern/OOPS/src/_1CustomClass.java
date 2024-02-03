//ek java file me ek se jada public class nhi ho sakta h
class Employee{
    int id;
    String name;
    int salary;

}

public class _1CustomClass {
    public static void main(String[] args) {
        System.out.println("This is custom class:");
        Employee khan = new Employee();
        khan.id= 1;
        khan.name= "Raziullah Khan";
        khan.salary = 37500;
        System.out.println(khan.id);
        System.out.println(khan.name);
        System.out.println(khan.salary);


    }
}
