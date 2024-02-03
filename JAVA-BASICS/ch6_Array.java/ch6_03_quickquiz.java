public class ch6_03_quickquiz {
    public static void main(String[] args) {
        // Write a  java program to print the elements of an array in reverse order
        int [] marks = {50, 20, 40 ,78, 45,48};
        System.out.println("The length of the array");
        System.out.println(marks.length);
        System.out.println("the reverse order array element");
        for(int i = marks.length-1; i>=0; i--) {
            System.out.println(marks[i]);
        }
    }
}
