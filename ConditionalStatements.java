import java.util.*;

public class ConditionalStatements{
     public static void main (String args []) {
       /* int age = 22;
        if (age >= 18) {
        System.out.println("adult: drive,vote");
     }
        else {
        System.out.println("not an adult");
    }
    */
    /*
    Print the largest of two numbers A and B
    int A = 1; 
    int B = 3;
    if (A >= B){
        System.out.println("A is the largest number.");
    }
    else{
        System.out.println("B is the largest number.");
    }*/
    Scanner sc = new Scanner (System.in);

    /* Check if number is even or odd
    int number = sc.nextInt();
    if (number % 2 ==0){
        System.out.println("EVEN");
    }else{
        System.out.println("ODD");
    }*/
    

    /* Income tax calculator
    int income = sc.nextInt();
    int tax;
    if (income < 500000){
        tax = 0;
    }
    else if (income >= 500000 && income < 1000000){
        tax = (int) (0.2 * income);
    }
    else{
        tax = (int) (0.3* income);
    }
    System.out.print("Your tax is: " + tax); */

    /* Largest of 3 numbers
    int A = 1, B = 3, C = 6;
    if ((A >= B) && (A >= C)){
        System.out.print("A is the largest.");
    }
    else if (B >= C){
        System.out.print("B is the largest");
    }
    else{
        System.out.print("C is the largest");
    } */

    /* ternary operator 
    int number = 4;
    String type = ((number % 2 == 0) ? "even" : "odd");
    System.out.print(type);
    */

    /* Check if student is PASS or FAIL
    int marks = sc.nextInt();
    String result = ((marks >= 33) ? "PASS" : "FAIL");
    System.out.print(result);
    */

    /* Switch Statement
    int number = 2;
    switch (number) {
        case 1 : System.out.print ("One");
                    break;
        case 2 : System.out.print ("Two");
                    break;
        case 3 : System.out.print ("Three");
                    break;
        default : System.out.print ("We wake up");

    }
    */

    /* Calculator using switch statement
    int a = sc.nextInt();
    int b = sc.nextInt();
    char operator = sc.next().charAt(0);
    switch (operator) {
        case '+' : System.out.print (a + b);
                    break;
        case '-' : System.out.print (a - b);
                    break;
        case '*' : System.out.print (a * b);
                    break;
        case '/' : System.out.print (a / b);
                    break;
        case '%' : System.out.print (a % b);
                    break;
        default : System.out.print ("Please enter a valid operator");
    }
    */


// Practice Questions (Conditional Statements)

   /* Write a Java program to get anumber from the user and print whether it is positive or negative
   int number = sc.nextInt();
   if (number > 0){
    System.out.print("Positive");
   }
   else if (number < 0){
    System.out.print("Negative");
   }
   else{
    System.out.print("Zero");
   }
   */

  /* Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever.
  double temp = 103.5;
  if (temp > 100){
    System.out.print("Fever");
  }
  else{
    System.out.print("No fever");
  }
  */

/* 
Write a Java program to input week number (1-7) and print day of week name using switch case.
  int number = sc.nextInt();
  switch(number){
    case 1: System.out.print("Monday");
            break;
    case 2: System.out.print("Tuesday");
            break;
    case 3: System.out.print("Wednesday");
            break;
    case 4: System.out.print("Thursday");
            break;
    case 5: System.out.print("Friday");
            break;
    case 6: System.out.print("Saturday");
            break;
    case 7: System.out.print("Sunday");
            break;
    default: System.out.print("Enter a number from 1-7");
  }
*/

/* Write a Java program that takes a year from the user and print whether that year is a leap year or not
int year = sc.nextInt();
boolean x = (year % 4) == 0;
boolean y = (year % 100) != 0;
boolean z = ((year % 400 == 0) && (year % 100 == 0 ));

if (x && (y || z)){
    System.out.print(year + " is a leap year");
}
else{
    System.out.print (year + " is not a leap year");
}
*/








    




    };
}