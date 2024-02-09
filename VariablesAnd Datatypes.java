import java.util.*;

public class javaBasics{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        /*In a program,input3numbers:A,BandC.Youhavetooutputtheaverageofthese 3 numbers.(Hint : Average of N numbers is sum of those numbers divided by N

        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float sum = a + b + c;
        float average = sum/3;
        System.out.println(average);  */


        /*In a program,inputthesideofasquare.You have to output the area of the square.(Hint : area of a square is (side x side)) 
        float side = sc.nextFloat();
        float area = side * side; 
        System.out.println(area);  
        */
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float cost = pencil + pen + eraser;
        System.out.println(cost);
        
    }
}