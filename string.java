import java.util.*;
public class string{
    /*
    public static void main (String args[]){
        
        char arr[] = {'a','b','c'};
        String str = "abcd";
        String str2 = "xyz@#1234";

        Scanner sc = new Scanner (System.in);
        String name;
        name = sc.nextLine();
        System.out.println(name);
    }


        String fname = "Shri";
        String lname = "Dabir";
        String fullname = fname + " " + lname; //concat
        System.out.println(fullname.length()); //length function
        System.out.println(fullname.charAt(0)); //char at 0th index


    }
    */

    //print all letters in a string
    /*
    public static void printLetters(String str){
        for (int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main (String args[]){
        String fname = "Shri";
        String lname = "Dabir";
        String fullname = fname + " " + lname; 
        printLetters(fullname);
    }
    */

    //check if string is a palindrome (same word if reversed)
    /*
    public static boolean isPalindrome(String str){
        for (int i = 0; i < str.length()/2; i++){
            int n = str.length();
            if (str.charAt(i) != str.charAt(n-i-1)){
                //not a palindrome
                return false;
            }
        }
        return true;
    }

    public static void main (String args[]){
        String str = "racecar";
        System.out.println(isPalindrome(str));
    }
    */

    //Get shortest path of person trvelling from 0,0 to given path WNEENESENNN (person is moving by 1 unit)
    /*
    public static float getShortestPath(String path){
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++){
            char dir = path.charAt(i); //variable to check direction char
            //south
            if (dir == 'S'){
                y--; //if south person will go down hence y--. Similarly other directions
            }
            else if (dir == 'N'){
                y++;
            }
            else if (dir =='W'){
                x--;
            }
            else{
                x++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2); //distance formula
    }

    public static void main (String args[]){
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
    */

    //comparing strings using .equals
    /*
    public static void main (String args[]){
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String ("Tony");
        if (s1==s2){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
        if (s1==s3){ //will print not equal here because we used == therefore use .equals
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
        if (s1.equals(s3)){ // use .equals
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
    }
    */

    //creating our own substring function
    /*
    public static String substring (String str, int si, int ei){
        String substr = "";
        for (int i = si; i < ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main (String args[]){
        String str = "HelloWorld";
        System.out.println(substring(str,0,5));
    }
    */

    //inbuilt substring function in java
    /*
    public static void main (String args[]){
        String str = "HelloWorld";
        System.out.println(str.substring(0,5));
    }
    */

   //returns the largest string (lexicographically) from set of strings 
   /*
    public static void main (String args[]){
        String fruits[] = {"apple", "mango", "banana"};
        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++){
            if(largest.compareTo(fruits[i]) < 0){ //if compareTo returns -ve value than first string is largest if it returns +ve value than second is largest and if 0 both are equal
                largest = fruits[i]; //replace largest with element larger than fruits[0]
            }
        }
        System.out.println(largest);
    }
    */

    //How to use StringBuilder
    /*
    public static void main (String args[]){
        StringBuilder sb = new StringBuilder (""); //creates new empty string sb
        for (char ch = 'a'; ch <= 'z'; ch++){
            sb.append(ch); //appends ch in empty string sb one by one
        }
        System.out.println(sb);
        System.out.println(sb.length());
    }
    */

    //Convert first letter of every word of given string to Uppercase
    /*
    public static String toUpperCase (String str){
        StringBuilder sb = new StringBuilder ("");
        char ch = Character.toUpperCase(str.charAt(0)); //convert first element to uppercase
        sb.append(ch);

        for (int i = 1; i < str.length(); i++){ //starts from i = 1 cuz we already converted first element to uppercase
            if (str.charAt(i) == ' ' && i < str.length()-1){ //if current element in loop is empty space and its position is < n-1 append it
                sb.append(str.charAt(i));
                i++; 
                sb.append(Character.toUpperCase(str.charAt(i))); //convert it tio uppercase and append it
            }
            else{
                sb.append(str.charAt(i)); //else just append it normally
            }
        }
        return sb.toString(); //convert sb into string
    }

    public static void main (String args[]){
        String str = "my name is shri";
        System.out.println(toUpperCase(str));
    }
    */

    //String Compression
    //for example "aaabbcccdd" = "a3b2c3d2"
    /*
    public static String compress (String str){
        StringBuilder sb = new StringBuilder ("");
        for (int i = 0; i < str.length(); i++){
            Integer count = 1; //Integer as object cuz later we will convert it to string using toString
            while (i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){ //as long as i is < n-1 and current element = next element
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count > 1){
                sb.append(count.toString()); //convert count to string
            }
        }
        return sb.toString();
    }

    public static void main (String args[]){
        String str = "aaabbcccdd";
        System.out.println(compress(str));
    }
    */

    //intern() function in string (checks if string is already present if yes, reference is returned)
    /*
    public static void main (String args[]){
        String str1 = new String ("Shri").intern();
        String str2 = new String ("Shri").intern();
        String str3 = new String ("Shri");
        System.out.println(str1==str2);
        System.out.println(str1==str3);

    }
    */

    //StringBuffer class creates mutable string
    /*
    public static void main (String args[]){
        StringBuffer sb = new StringBuffer ();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        sb.insert(1,"Java"); //inserts string at 1 position
        sb.replace(1,3,"Java"); //replaces string
        sb.delete(1,7);
        sb.reverse();
        String message = sb.toString();
        System.out.println(message);
    }
    */
}

