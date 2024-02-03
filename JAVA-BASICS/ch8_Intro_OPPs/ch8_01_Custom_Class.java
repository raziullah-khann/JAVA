class Employee{
    int id;
    String name;
    int no;
}
public class ch8_01_Custom_Class{
    public static void main(String[] args) {
        System.out.println("This is our custom class ");
        Employee harry =new Employee();
        harry.id=12;
        harry.name="Rahul";
        harry.no=10;
        System.out.println(harry.id);
        System.out.println(harry.name);
        System.out.println(harry.no);
    }
}