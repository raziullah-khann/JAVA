class Employee1{
    int id;
    String name;
    int age;

    int salary;

    public void getDetails(){
        System.out.println("My id is: " +this.id);
        System.out.println("My name is: " +this.name);
        System.out.println("My age is: " +this.age);

    }

    public int getSalary(){
        return  salary;
    }

}
public class _2Custom_Class_With_Method {
    public static void main(String[] args) {
        System.out.println("This is your custom class with method:");
        Employee1 Razi = new Employee1();
        Employee1 lav = new Employee1();
        Razi.id=23;
        Razi.name = "Raziullah";
        Razi.age = 21;
        Razi.salary=5000;
        lav.id= 30;
        lav.name = "Lav";
        lav.age = 20;
        System.out.println("This is Raziullah Details");
        Razi.getDetails();
        System.out.println("This is Lav Details");
        lav.getDetails();
        int a= Razi.getSalary();
        System.out.println(a);

    }
}
