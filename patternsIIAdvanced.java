import java.util.*;
public class patternsIIAdvanced{

/* Print Hollow Rectangle Pattern
*****
*   *
*   *
*****

    public static void hollow_rectangle(int totRows, int totCols){
        for (int i =1 ; i <= totRows; i++){ //outer loop for rows
            for (int j = 1; j <= totCols; j++){ //inner loop for columns
            // cell = (i,j)
                if (i == 1 || i == totRows || j == 1 || j == totCols){ //boundary cells condition
                    System.out.print("*"); // if a boundary cell print *
                }
                else{ // if not a boundary cell print blank space
                    System.out.print(" ");
                }
            }
            System.out.println(); // when 1 row is done move on to next i.e when j exceeds totCols
        }
    }

    public static void main (String args[]){
        hollow_rectangle(4,5); //4 rows, 5 cols
    }
*/

/* Print inverted rotated half pyramid pattern
   *
  **
 ***
****

    public static void inverted_rotated_half_pyramid(int n){
        for (int i = 1; i <= n ; i++){ //number of lines/rows (i)
            for (int j = 1; j <= n-i; j++){ //condition to print spaces, if line (i) = 2 spaces = n-2
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){ //condition to print stars, if line = 2 stars = 2
                System.out.print("*");
            }
            //when set of space and stars for one line is done move tp next line
        System.out.println();
        }
    }

    public static void main (String args[]){
        inverted_rotated_half_pyramid(4);
    }
*/

/* Print inverted rotated half pyramid pattern with numbers
12345
1234
123
12
1

    public static void inverted_rotated_half_pyramid_numbers(int n){
        for ( int i = 1; i <= n; i++){
            for (int j = 1; j <= n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
    public static void main (String args[]){
        inverted_rotated_half_pyramid_numbers(5);
    }
*/

/* Print a FlOYD'S Triangle
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 

    public static void floyds_triangle (int n){
        int counter = 1;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void main (String args[]){
        floyds_triangle(5);
    }
*/

/* Print 0-1 Triangle
1
01
101
0101

    public static void zero_one_triangle (int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                if ((i + j)%2 == 0){ //it's even so print 1
                    System.out.print("1");
                }
                else{ //odd so print 0
                    System.out.print("0");
                }
            }
            //move to next line after one row is done
            System.out.println();
        }
    }

    public static void main (String args[]){
        zero_one_triangle(4);
    }
*/

/* Print BUTTERFLY Pattern
*      *
**    **
***  ***
********
********
***  ***
**    **
*      *

    public static void butterfly (int n){
        //1st half
        for (int i = 1; i <= n; i++){
            //stars = i
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }

            //spaces = 2*(n-1)
            for (int j = 1; j <= 2*(n-i); j++){
                System.out.print(" ");
            }

            //stars = i
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for (int i = n; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }

            //spaces = 2*(n-1)
            for (int j = 1; j <= 2*(n-i); j++){
                System.out.print(" ");
            }

            //stars = i
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main (String ars[]){
        butterfly(4);
    }

*/

/* Print SOLID RHOMBUS pattern
     *****
   *****
  *****
 *****
*****

    public static void solid_rhombus (int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n-i; j++){  //spaces = n-i
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++){  //stars = n
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){
        solid_rhombus(5);
    }
*/

/* Print HOLLOW RHOMBUS
    *****
   *   *
  *   *
 *   *
*****

    public static void hollow_rhombus(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n-i; j++){ //print spaces first = n-i
                System.out.print(" ");
            }
            //hollow rectangle code for stars
            for (int j = 1; j <= n; j++){
                if (i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main (String args[]){
        hollow_rhombus(5);
    }
*/

/* Print DIAMOND Pattern
   *
  ***
 *****
*******
*******
 *****
  ***
   *

    public static void diamond (int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for (int i = n; i >= 1; i--){
            for (int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        diamond(4);
    }
*/



}