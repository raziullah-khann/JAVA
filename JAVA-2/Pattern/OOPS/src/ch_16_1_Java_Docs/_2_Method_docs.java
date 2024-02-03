package ch_16_1_Java_Docs;

/**
 * This is a good class
 */
public class _2_Method_docs {
    /**
     *
     * @param args These are arguments supplied to the command Line
     */
    public static void main(String[] args) {
        System.out.println("This is main method");
        _2_Method_docs ds = new _2_Method_docs();
    }

    /**
     * Hello this is method this docs created by Raziullah Khan
     * @param i This is first parameter to add
     * @param j This is second parameter to add
     * @return Sum of two numbers
     * @throws  Exception if i is 0
     * @deprecated This method is deprecated Please use + operator
     */
    public int add(int i, int j) throws Exception{
        if(i==0){
            throw new Exception();
        }
        int c;
        c=i+j;
        return c;
    }
}
