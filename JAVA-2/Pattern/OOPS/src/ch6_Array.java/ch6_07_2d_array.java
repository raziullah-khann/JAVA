public class ch6_07_2d_array {
    public static void main(String[] args) {
        String[][] name ={ {"ram","shyam","tej","sohan","vasu"},{"dhanus","dev","ged"}};
        for(String []element: name){
            for(String data: element)
            System.out.println(data);
        }
    }
}
