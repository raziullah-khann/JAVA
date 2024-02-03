//Write a java program to encrypt a grade by adding 8 to it . decrypt it to show the correct grade.

public class ch2_ps_q2 {
    public static void main(String[] args) {
        //encrypt the grade
        char grade = 'B';
        grade = (char) (grade + 8);
        System.out.println(grade);

        //decrypt the grade
        grade = (char) (grade- 8);
        System.out.println(grade);
    }
}
