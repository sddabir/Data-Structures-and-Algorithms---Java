import java.util.*;
public class MatricesArrays{
    //creation of an 2D array
    public static void main (String args[]){
        int matrix [][] = new int[n][m];
        int n = matrix.length; m = matrix[0].length;
        Scanner sc = new scanner (System.in);
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
    }
}