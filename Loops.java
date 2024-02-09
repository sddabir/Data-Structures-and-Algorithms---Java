import java.util.*;
public class Loops {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
// while loop

/* Print numbers 1-10
        int counter = 1;
        while (counter <= 10){
            System.out.println(counter);
            counter++;
        }
*/
/* Print numbers ranging from 1 to n
         int range = sc.nextInt();
         int counter = 1;
         while (counter <= range){
             System.out.println(counter + " ");
             counter++;
        }
*/
 /* print sum of n natural numbers
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= n){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
*/

// for Loop

        /* Print Hello World 10X
        for (int i = 1; i <= 10; i++){
            System.out.println("Hello World");
        }
        */
       
       /* Print Square Pattern
       for (int line = 1; line <= 4; line++){
        System.out.println("****");
       }
       */
       
       /* Print reverse of a number
       int n = 10899;
       while (n > 0){
        int lastDigit = n % 10;
        System.out.print(lastDigit);
        n = n/10;
       }
       System.out.println();
       */

       /* Reverse the given number
       int n = 10899;
       int rev = 0;
       while (n > 0){
        int lastDigit = n % 10;
        rev = (rev * 10) + lastDigit;
        n = n/10;
       }
       System.out.print(rev);
       */

      // do while Loop
      /* Print HW 10x using do while loop
      int counter = 1;
      do{
        System.out.println("Hello World");
        counter ++;
      } while (counter <= 10);
      */

    //break Statement
    /* Print numbers 1-5 and as soon as it reaches 3 break out of the loop  
    for (int i = 1; i <= 5; i++){
        if(i ==3){
            break;
        }
        System.out.println(i);
      }
    System.out.println("Out of the loop");
    */

   /* Print numbers n but break put of the loop as soon as user enters a number which is multiple of 10
   do{
    System.out.println("Enter your number: ");
    int n = sc.nextInt();
    if (n % 10 == 0){
        break;
    }
    System.out.print(n);
   } while (true);
   */

    // Continue Statement
    /* Print 1-5 except 3
    for (int i = 1; i <= 5; i++){
        if (i==3){
            continue;
        }
        System.out.println(i);
    }
    */

   /* Display all numbers entered by user except multiples of 10
   do{
    System.out.println ("Enter your number: ");
    int n = sc.nextInt();
    if (n % 10 ==0){
        continue;
    }
    System.out.println("Number was: " + n);
   }while(true);
   */
  
/* Check if a number entered by user is prime number 
  System.out.println("Enter your number: ");
  int n = sc.nextInt();
  boolean isPrime = true;
  if (n == 2){
    System.out.println(n + " is a prime number"); // because i started from 2 so we need to clarify that if n=2 n is prime; put everything else in 'else' command
  }
  else{
    for (int i = 2; i <= n-1; i++){ // to optimize this code for large numbers make this change i <= Math.sqrt(n)
    if (n % i ==0){
        isPrime = false; //n has multiple i which is not equal to 1 or n
    }
  }
  if (isPrime == true){
    System.out.println (n + " is a prime number");
  }
  else{
    System.out.println (n + " is not a prime number");
    }
  }
  */
  
 /* Write a program that reads a set of integers,and then prints the sum of the even and odd integers
  int number;
  int evenSum = 0;
  int oddSum = 0;
  int choice;
  do{
    System.out.print("Enter the number: ");
    number = sc.nextInt();

    if (number % 2 == 0){
        evenSum += number;
    }
    else{
        oddSum += number;
    }
      System.out.println("Do you want to continue? Enter 1 if yes: ");
    choice = sc.nextInt();
  }while(choice == 1);

  System.out.println("Sum of even integers is: " + evenSum);
  System.out.println("Sum of odd integers is: " + oddSum);
  */

/* Find factorial of given number
 int number; //to hold number
 int factorial = 1; //to hold factorial

 System.out.println("Enter a positive integer: ");
 number = sc.nextInt();

 for (int i = 1; i <= number; i++){
  factorial *= i;
 }
 System.out.println("Factorial of " + number + " is: " + factorial);

 */

/* print multiplication table of given number
int number;
System.out.println("Enter a number: ");
number = sc.nextInt();
for (int i = 1; i <= 10; i++){
  System.out.println(number + " * " + i + " = " + number * i);
}
*/







    }
}
