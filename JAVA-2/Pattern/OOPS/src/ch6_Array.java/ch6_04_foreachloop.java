public class ch6_04_foreachloop {
    public static void main(String[] args) {
        String[] name = {"ram","shyam","varun","tej","dev"};
        System.out.println(name.length);
        System.out.println("Printing array element for each loop");
        for(String  element :name){
            System.out.println(element);
        }
    }
}
