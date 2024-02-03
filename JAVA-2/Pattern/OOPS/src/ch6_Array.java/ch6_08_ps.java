public class ch6_08_ps {
    public static void main(String[] args) {
        //q1-->Create an array of 5 floats and calculate their sum.
//        float[] number = {10.3f,20.1f,7.3f,4.5f,5.5f};
//        float sum=0;
//        for(int i = 0;i< number.length;i++){
//            System.out.println(number[i]);
//            sum=sum+number[i];
//        }
//        System.out.println(sum);

        //q2-->Write a program to find out wheather a given integer is present or not in tha array.
//        int [] number ={20,34,45,46,56,65,23};
//        int num =65;
//        boolean isAnArray = false;
//        for(int element:number) {
//            if (num == element) {
//                isAnArray = true;
//                break;
//            }
//        }
//        if (isAnArray) {
//            System.out.println("the number is present in the array ");
//            }
//        else {
//            System.out.println("the number is not present in the array ");
//            }
        //q3--> Calculate the average of the marks from an array containing marks of all student in physics using for each loop.
//        float sum= 0;
//        int [] marks={90,85,70,66,55,82,50};
//        for(int element:marks){
//            System.out.println(element);
//            sum = sum+element;
//        }
//        System.out.println("The number of student is in the array " +marks.length);
//        System.out.println("The sum of the all student marks of phtsics " +sum);
//        float average=sum/ marks.length;
//        System.out.println("the average of the total marks of physics is " +average);

        //q4--> Create a java program to add two matrices of size 2*3!.
//        int[][] matrices1={{10,20,20},{25,50,55}};
//        int[][] matrices2={{30,70,56},{45,67,89}};
//        int sum [][]= {{0,0,0},{0,0,0}};
//        for(int i =0; i<matrices1.length; i++){ //no of rows times
//            for(int j =0; j<matrices2[i].length; j++){  //no of columns times
//                sum[i][j]= matrices1[i][j] +matrices2[i][j];
//            }
//        }
//        for (int i=0;i<matrices1.length;i++){ // row number of times
//            for (int j=0;j<matrices1[i].length;j++) { // column number of time
//                System.out.print(sum[i][j] + " ");
//                sum[i][j] = matrices1[i][j] + matrices2[i][j];
//            }
//            System.out.println(""); // Prints a new line
//        }

        //5--> Write a java program to reverse an array.
//        int[] array= {10,20,30,40,50,60,70,80,90,100};//method1
//        for(int i=array.length-1;i>=0;i--){
//            System.out.println(array[i]);
//        }
        //Method2
//        int[] number = {10,11,12,13,14,15,16,17};
//        // now find greatest integer lengthofnumber/2
//        int a = number.length;
//        int n = Math.floorDiv(a,2);
//        int temp;
//        for(int i =0; i<n; i++) {
//            temp = number[i];
//            number[i]=number[a-i-1];
//            number[a-i-1]=temp;
//        }
//        for (int element:number) {
//            System.out.print(element + " " );
//        }

        //6--> Write a java program to find the maximum element in an array.
//        int[] maximum={10,20,30,40,-12,550,60};
//        int max= 0 ;
//        for (int i =0; i<maximum.length; i++){
//            if(maximum[i]>max){
//                max=maximum[i];
//            }
//        }
//        System.out.println("The maximum number is in the array " +max);

        //7-->Write a java program to find the minimum element in an array.
//        int[] minimum={11,45,56,-880,67,80};
//        int min=0;
//        for(int element:minimum){
//            if(element<min){
//                min=element;
//
//            }
//        }
//        System.out.println("The minimum value is : " +min);

        //-->8 Write a java program to find whether an array is sorted or not.
//        int[] sorted={11,45,56,58,67,80};
//        boolean a= true;
//        for (int i =0; i< sorted.length-1; i++) {
//            if(sorted[i]>sorted[i+1]){
//                a=false;
//                //continue;
//                break;
//            }
//        }
//        if(a){
//            System.out.println("the array is sorted");
//        }
//        else{
//            System.out.println("the array is not sorted");
//        }

    }
}
