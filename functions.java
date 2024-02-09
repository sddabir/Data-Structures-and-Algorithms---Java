
import java.util.*;
public class functions{
    /* Functions syntax
    public static void printHW(){   //create a function that prints HW 3X
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }
    
    public static void main(String args[]){ //calling the function
    printHW();
    }
    */

   /* Syntax using parameters

    public static void calculateSum(int num1, int num2){ //create function to calculate sum with variables num1 and num2
        int sum = num1 + num2;
        System.out.println("sum is: " + sum);
   }

    public static void main(String args[]){ //calling the function
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculateSum(a,b); //use parameters a and b as num1 and num2 respectively
   }
   */

   // can do in another way too
   /*
    public static int calculateSum(int num1, int num2){ //create function to calculate sum with variables num1 and num2 and give it the type int
        int sum = num1 + num2; // variable sum here and in main function are different as they are in different functions
        // num1 and num2 are paramters or formal parameters
        return sum; //returns sum 
    }

    public static void main(String args[]){ //calling the function
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a,b);//use parameters a and b as num1 and num2 respectively and call the function
        // a and b are arguments or actual parameters
        System.out.println("Sum is: " + sum);
    }
   */

  //swapping function
  /*
    public static void swap (int a, int b){
    //swap code
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main (String args[]){
    //swap - values exchange
        int a = 5;
        int b = 10;
        swap(a, b); // call swap
    }
  */
 
 /* Product of 2 numbers using function
    public static int multiply(int a, int b){
        int product = a*b;
        return product;
    }
    public static void main(String args[]){
        int a = 3;
        int b = 5;
        int prod = multiply(a,b);
        System.out.println("a * b = " + prod);
        prod = multiply(10,20);
        System.out.println("a * b = " + prod);   
    }
 */
 
 /* Factorial of number using function
    public static int factorial(int n){
        int f = 1;

        for (int i = 1; i <= n; i++){
            f = f * i;
        }
        return f; //factorial of n
    }

    public static void main(String args[]){
        System.out.println(factorial(4));
    }
*/

/* Binomial coeff using factorial function

    public static int factorial(int n){
        int f = 1;

        for (int i = 1; i <= n; i++){
            f = f * i;
        }
        return f; //factorial of n
    }

    public static int binCoeff(int n, int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n - r);

        int binCoeff = n_fact/(r_fact * nmr_fact);
        return binCoeff;
    }

    public static void main(String args[]){
        System.out.print(binCoeff(5,2));
    }
*/

/*
// function overloading

    // function to calculate sum of 2 nums

    public static int sum(int a, int b){
        return a + b;
    }
    // function to calculate sum of 3 nums

    public static int sum(int a, int b, int c){
        return a + b + c;
    }
    
    public static void main (String args[]){
        System.out.println(sum(5,2));
        System.out.println(sum(5,2,1));
    }
*/

/* Function overloading using Data Types
    public static int sum (int a, int b){ //sum of 2 ints
        return a + b;
    }
    public static float sum (float a, float b){ // sum of 2 floats
        return a + b;
    }
    public static void main (String args[]){
        System.out.println(sum(5,2));
        System.out.println(sum(5.2f,1.2f));
    }
*/

/* Check if prime or not
    public static boolean isPrime (int n){
        boolean isPrime = true;
        //corner case for n =2
        if(n == 2){
            return true;
        }
        for (int i =2; i <= n-1; i++){
            if (n % i == 0){
                isPrime = false;
            }
        }
        return isPrime;
    }

    public static void main(String args[]){
        System.out.println(isPrime(12));
    }
    */

    //can also do this way
/*
    public static boolean isPrime(int n){
        if (n == 2){
            return true;
        }
        for (int i = 2; i <= n-1; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }


    public static void main(String args[]){
        System.out.println(isPrime(3));
    }   
*/

/*  Optimized approach to find prime
    public static boolean isPrime(int n){
        if (n == 2){
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }


    public static void main(String args[]){
        System.out.println(isPrime(16));
    }
*/

/* Print all prime numbers in given range 2 to n
    public static boolean isPrime(int n){
        if (n == 2){
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void primesInRange(int n){
        for (int i = 2; i <= n; i++){
            if (isPrime(i)){ //true
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]){
        primesInRange(20); //range 2 to 20
    }
*/

/* Convert from binary to decimal
    public static void binToDec(int binNum){
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        while (binNum > 0){ //loop will go on as long as binNum is greater than 0
            int lastDigit = binNum % 10; //to find last digit
            decNum = decNum + (lastDigit * (int)Math.pow(2,pow)); //to convert in decimal
            pow ++; //increase the power
            binNum = binNum/10; //decrease the binNum by removing last digit
        }
        System.out.print("Decimal of " + myNum + " is: " + decNum); //introduce new variable myNum which is = binNum cuz if we add binNum here it will print 0
    }

    public static void main(String args[]){
        binToDec(101);
    }
*/

/* Convert decimal to binary
    public static void decToBin (int decNum){
        int myNum = decNum;
        int pow = 0;
        int binNum = 0;
        while (decNum > 0){ //loop will go on as long as decNum is greater than 0
            int rem = decNum % 2; //find rem after dividing decNum by 2
            binNum = binNum + (rem * (int)Math.pow(10,pow)); //convert in binary
            pow ++; // keep on increasing the power
            decNum = decNum/2; //keep dividing decNum by 2
        }
        System.out.print("Binary of " + myNum + " is: " + binNum);
    }

    public static void main(String args[]){
        decToBin(12);
    }
*/

    // Practice Questions

/* Return average of three numbers

    public static double average (double a, double b, double c){
        return (a + b + c)/3;
    }

    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your first number: ");
        double a = sc.nextDouble();
        System.out.println("Enter your second number: ");
        double b = sc.nextDouble();
        System.out.println("Enter your third number: ");
        double c = sc.nextDouble();
        System.out.println("Average of three numbers is: " + average(a, b, c));

    }
*/
/* Write a Java method to compute the averageof three numbers.
    public static boolean isEven (int n){
        if (n % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your number: ");
        int n = sc.nextInt();
        System.out.println(isEven(n));
    }
*/

/* Write a Java program to check if a number is a palindrome in Java?( 121isapalindrome, 321 is not)Anumberiscalledapalindromeifthenumberisequaltothereverseofanumbere.g.,121isapalindromebecausethereverseof121is121itself.Ontheotherhand,321isnotapalindrome because the reverse of 321 is 123, which is not equal to 321

    public static void main (String args[]){
        System .out.println("Please enter a number: ");
        Scanner sc = new Scanner (System.in);
        int palindrome = sc.nextInt();
        if (revOfNum(palindrome)){
            System.out.println("Number : " + palindrome + "is a palindrome.");
        }
        else{
            System.out.println("Number : " + palindrome + "is not a palindrome.");
        }
    }
    public static boolean revOfNum(int n){
        int palindrome = n; //copied number in a variable
        int rev = 0;

        while (palindrome != 0){
            int lastDigit = n%10;
            rev = (rev * 10) + lastDigit;
            palindrome = palindrome/10;
        }

        if (n == rev){ //if number = reverse than it's a palindrome
            return true;
        }
        return false;

     }

*/

/* Write a Java method to compute the sum of the digits in an integer

public static void main (String args[]){
    System.out.println("Enter a number: ");
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    System.out.println("Sum of integers in " + n + " = " + sumOfInt(n));
}

public static double sumOfInt (int number){
    int sum = 0;
    while (number > 0){
        int lastDigit = number % 10;
        number = number/10;
        sum = sum + lastDigit;

    }
    return sum;
}
*/

    
        
    

   





     
}