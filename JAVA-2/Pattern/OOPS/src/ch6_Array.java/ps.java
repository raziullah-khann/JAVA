public class ps {
    public static void main(String[] args) {
       //question 2--> To find out given number is present in the array or not!
//        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
//        boolean isInArray = false;
//        float num = 45.57f;
//        for(float i = 0; i<marks.length;i++){
//            if(num==i){
//                isInArray = true;
//                break;
//            }
//        }
//        if(isInArray){
//            System.out.println("The value is present in the array");
//        }
//        else{
//            System.out.println("The value is not present in the array");
//        }
        int [][] mat1 = {{1, 2, 3},
                {4, 5, 6}};
        int [][] mat2 = {{2, 6, 13},
                {3, 7, 1}};
        int [][] result = {{0, 0, 0},
                {0, 0, 0}};

        for (int i=0;i<mat1.length;i++){ // row number of times
            for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        // Printing the elements of a 2-D Array
        for (int i=0;i<mat1.length;i++){ // row number of times
            for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(""); // Prints a new line
        }
    }
}
