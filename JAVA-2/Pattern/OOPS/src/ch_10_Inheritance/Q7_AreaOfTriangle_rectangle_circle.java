package ch_10_Inheritance;
import java.util.Scanner;
public class Q7_AreaOfTriangle_rectangle_circle {
    public static void main(String[] args) {
        System.out.println("1. for Area of circle");
        System.out.println("2. for Area of triangle");
        System.out.println("3. for Area of rectangle");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter any of above option: ");
        int num = sc.nextInt();
        switch (num){
            case 1:
                System.out.println("Please enter radius");
                double radius = sc.nextDouble();
                double areaofcircle = Math.PI*Math.pow(radius,2);
                System.out.println("Area of circle is "+areaofcircle);
                break;

            case 2:
                System.out.println("Please enter base and height");
                double base = sc.nextDouble();
                double height = sc.nextDouble();
                double areaoftriangle = (base*height)/2;
                System.out.println("Area of triangle is "+areaoftriangle);
                break;

            case 3:
                System.out.println("Please enter length and breadth");
                double length = sc.nextDouble();
                double breadth = sc.nextDouble();
                double areaofrectangle = length*breadth;
                System.out.println("Area of rectangle is "+areaofrectangle);
                break;

            default:{
                System.out.println("Invalid option");
            }

        }
    }
}
