//Creating a class circle to calculate area and Perimeter.
class Circle{
    //data member
    float pie;
    float radius;

    //methods
    public float area(){
        float a = pie*radius*radius;
        return  a;
    }

    public float perimeter(){
        float a = 2*pie*radius;
        return  a;
    }
}

public class _8PracticeSet_Q6 {
    public static void main(String[] args) {
        Circle sc = new Circle();
        sc.radius=10;
        sc.pie=3.14f;
        float a = sc.area();
        float b = sc.perimeter();

        System.out.println("The area  of circle is " +a);
        System.out.println("The perimeter  of circle is " +b);


    }
}
