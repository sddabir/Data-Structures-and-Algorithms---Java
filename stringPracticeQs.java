import java.util.*;
public class stringPracticeQs{
    //Count how many times lowercase vowels occurred in a String entered by the user.
    /*
    public static void main (String args[]){
        String str = new Scanner (System.in).next();
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                count++;
            }
        }
        System.out.println("Number of vowels in given strings are: " + count);

    }
    */

    // Determine if two strings are anagrams of each other. (same length words with same letters but in different order)
    //example: heart, earth
    /*
    public static void main (String args []){
        String str1 = "raceacre";
        String str2 = "care";

        //convert strings to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //check if length of strings is same
        if (str1.length() != str2.length()){
            //not anagrams if lengths are not equal
            System.out.println("The word " + str1 + " and " + str2  + " are not anagrams.");

        }
        else{ //if lengths are equal then proceed
            //convert into char array
            char [] str1CharArray = str1.toCharArray();
            char [] str2CharArray = str2.toCharArray();

            //sort the array in ascending order
            Arrays.sort(str1CharArray);
            Arrays.sort(str2CharArray);

            //check if arrays are equal
            boolean equal = Arrays.equals(str1CharArray,str2CharArray);

            if (equal){
                System.out.println("The words " + str1 + " and " + str2  + " are anagrams.");
            }
            else{
                System.out.println("The words " + str1 + " and " + str2  + " are not anagrams.");
            }
            
        }

    }
    */

    
}