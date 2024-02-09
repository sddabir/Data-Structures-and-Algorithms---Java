public class MatricesPracticeQs{

    //Print the number of 7’s that are inthe 2d array.Example :Input - int[][] array = { {4,7,8},{8,8,7} };Output - 2
    /*
    public static void main (String args[]){
        int matrix[][] = { {4,7,8},{8,8,7} };
        int count = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                if (matrix[i][j] == 7){
                    count++;
                }
            }
        }
        System.out.println("Count of seven is: " + count);
    }
    */


    //Print out the sum of the numbers inthe second row of the “nums” array.Example :Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };Output - 18
    /*
    public static void main (String args[]){
        int nums [][] =  {{1,4,9},{11,4,3},{2,2,3}};
        int sum = 0;
        for (int j = 0; j < nums[0].length;j++){
            sum = sum + nums[1][j];
        }
        System.out.println("Sum of elements in 2nd row is: " + sum);
    }
    */
   
    // Write a program to FindTransposeofa Matrix.What is Transpose?Transpose of a matrix is the process ofswapping therows to columns. For a 2x3 matrix,Matrixa11    a12    a13a21    a22    a23Transposed Matrixa11    a21a12    a22a13    a23
    /*
    public static void main (String args[]){
        int row = 2, col = 3;
        int matrix[][] = { {4,7,8},{8,8,7} };

        printMatrix(matrix);

        int transpose[][] = new int [col] [row];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                transpose[j][i] = matrix[i][j];
            }
        }

        printMatrix(transpose);
    }

    public static void printMatrix(int matrix[][]){
        System.out.println("The matrix is: ");
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
            
    }
    */
}