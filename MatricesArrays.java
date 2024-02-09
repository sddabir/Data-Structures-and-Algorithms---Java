import java.util.*;
public class MatricesArrays{
    //function to find tle location of key in 2d matrix 
    /*
    public static boolean search(int matrix[][], int key){
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("found at cell (" + i + "," + j +")");
                    return true; //returns true and prints if matrix[i[j]==key]
                }
            }
        }
        System.out.println("key not found.");
        return false; //returns false if key not found
    }

    //creation of an 2D array
    public static void main (String args[]){
        int matrix [][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length; // matrix[0] will give first row

        //input for array
        Scanner sc = new Scanner (System.in);
        for (int i = 0; i<n; i++){
            for (int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //output
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        search(matrix,5);
    }
    */

    //Print spiral matrix (important question)
    /*
    public static void printSpiral(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1; //n-1
        int endCol = matrix[0].length-1; //n-1

        //if there are odd no of boundaries and we just use sc<ec && sr<er it will not print middle part. So use <= in all conditions.
        //Also, we use && because it will work in case of nXm matrix as well.
        while (startCol <= endCol && startRow <= endRow){ 
            //top
            for (int j = startCol; j<= endCol; j++){ //startRow is fixed and j starts from startCol goes till endCol
                System.out.print(matrix[startRow][j] + " ");
            }
            //right
            for (int i = startRow+1; i<= endRow; i++){ //endCol is fixed and i starts from startRow+1 (4 is already printed) goes till endRow
                System.out.print(matrix[i][endCol] + " ");
            }
            //bottom
            for (int j = endCol - 1; j >= startCol; j--){//endRow is fixed and j starts from endCol-1 (16 is already printed) to startCol
                if (startRow == endRow){ //to avoid repetition
                    break;
                }
                System.out.print(matrix[endRow][j] + " "); 
            }
            //left
            for (int i = endRow - 1; i >= startRow + 1; i--){ //startCol is fixed and i starts from endRow-1 (13 is already printed) to startRow+1 (1 is already printed)
                if (startCol == endCol){ //to avoid repetition
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }
            startCol ++;
            startRow ++;
            endCol --;
            endRow --;
        }
        System.out.println();
    }
    public static void main (String args[]){
        int matrix [][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printSpiral(matrix);
    }
    */

   /*
   //Diagonal Sum (another important question)
   public static int diagonalSum(int matrix [][]){
   //Method1: Brute froce time complexcity = O(n^2)
   
        int sum = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int j= 0; j < matrix[0].length; j++){
                //pd (primary diagonal) property of pd is that every element of pd has i = j that is row = column
                if(i==j){
                    sum = sum + matrix[i][j];
                }
                //sd (secondary diagonal) property of sd is that i + j = n-1 that is row+column = n-1
                else if (i + j == matrix.length-1){
                    sum = sum + matrix[i][j];
                }
            }
        }
        return sum;
    */
    //Method2 time complexity O(n)
    /*
        int sum = 0;
        for (int i = 0; i < matrix.length; i++){
            //pd
            sum = sum + matrix[i][i];
            //sd
            if(i != matrix.length-i-1){ //if i+j = n-1; j = n-1-i. So no need to create extra loop for j
                sum = sum + matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }

    public static void main (String args[]){
        int matrix [][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(diagonalSum(matrix));
    }
    */
    
    public static boolean staircaseSearch(int matrix [][], int key){
        int row = 0, col = matrix[0].length - 1; //Used (0,m-1) cell as starting point
        while(row < matrix.length && col >= 0){ //as long as row < n and col >=0
            if (matrix[row][col] == key){
                System.out.println("Key found at: (" + row + "," + col + ")");
                return true;
            }
            else if (key < matrix[row][col]){ //if key < cell value then move LEFT. so col--
                col--;
            }
            else{ //else (key > cell value) then move BOTTOM. so row++
                row++;
            }
        }
        System.out.println("Key not found.");
        return false; //if not found return false
    }

    public static void main (String args[]){
        int matrix [][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key = 33;
        staircaseSearch(matrix,key);
    }

}