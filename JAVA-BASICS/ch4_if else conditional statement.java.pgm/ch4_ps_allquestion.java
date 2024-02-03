import java.util.Scanner;

public class ch4_ps_allquestion {
    public static void main(String[] args) {
        /* question 1 -->what is output of this program
        int a= 10;
        if(a==11) {
            System.out.println("I am 11");
        }
        else{
            System.out.println("I am not 11");
        }*/

        /* question 2--> to check fail or pass, if pass the required each sub have atleast 33 marks and overall percentage is atleast 40 ,othewise fail
        System.out.println("Enter your marks");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in Maths");
        int sub1 = sc.nextInt();

        System.out.println("Enter your marks in Physics");
        int sub2 = sc.nextInt();

        System.out.println("Enter your marks in chemistry");
        int sub3 = sc.nextInt();

        float percent = (sub1+sub2+sub3)/3.0f;
        System.out.println("Your overall percentage is " +percent);

        if(percent>=40 && sub1>=33 && sub2>=33 && sub3>=33)
        {
            System.out.println("Congratulation! You are pass!");
        }
        else{
            System.out.println("Sorry! You are fail");
        }*/


        /* question 3-->to calculate income tax
        System.out.println("Income slab in lack");
        Scanner sc = new Scanner(System.in);
        float income = sc.nextFloat();
        if(income>=2.5 && income<5.0){
            System.out.println("Your tax is 5%");
        }
        else if(income >=5.0 && income<10.0){
            System.out.println("Your tax is 20%");
        }
        else if(income>=10.0){
            System.out.println("Your tax is 30%");
        }
        else{
            System.out.println("You are tax free person");
        }*/

        /* question 4-->enter user number get the days
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch(a){
            case 1-> System.out.println("Monday");
            case 2-> System.out.println("Tuesday");
            case 3-> System.out.println("Wednesday");
            case 4-> System.out.println("Thursday");
            case 5-> System.out.println("Friday");
            case 6-> System.out.println("Saturday");
            case 7-> System.out.println("Sunday");
            default-> System.out.println("Invalid input");
        }*/

        /* question 5-->to find leap year or not
        System.out.println("enter your year");
        Scanner sc = new Scanner(System.in);
        int  year = sc.nextInt();
        if(year%4==0 && year%100!=0 ||year%400==0){
            System.out.println("This is leap year");
        }
        else{
            System.out.println("This is not leap year");
        }*/

        System.out.println("Enter your website");
        Scanner sc = new Scanner(System.in);
        String website = sc.next();

        if(website.endsWith(".com")) {
            System.out.println("This ia an commercial website");
        }

        if(website.endsWith(".org")){
            System.out.println("This ia an organization website");
        }

        if(website.endsWith(".in")){
            System.out.println("This ia an indian website");
        }



    }
}
