import java.util.*;
public class ArraysI{
    /*
    public static void main (String args[]){
        // creating an array in different ways
        
        int marks[] = new int[50];
        int numbers[] = {1,2,3};
        int moreNumbers[] = {4,5,6};
        String fruits[] = {"apple", "mango", "guava"};

        int marks[] =  new int[100];
        Scanner sc = new Scanner (System.in);

        /* //INPUT
        marks[0] = sc.nextInt(); //phy
        marks[1] = sc.nextInt(); //chem
        marks[2] = sc.nextInt(); //math

        //OUTPUT
        System.out.println ("Phy: " + marks[0]);
        System.out.println ("Chem: " + marks[1]);
        System.out.println ("Math: " + marks[2]);

        //UPDATE
        marks[2] = 98;
        marks[2] = marks[2] + 1;
        System.out.println ("Math: " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2])/3;
        System.out.println("Percentage = " + percentage + "%");

        

        //length of array
        System.out.println("length of array = " + marks.length);

    */

    /*

        public static void updateMarks (int marks[], int nonchangeable){
            nonchangeable = 10;
            for (int i = 0; i < marks.length; i++){
                marks[i] = marks[i] + 1;
            }
        }

        public static void main (String args[]){
            int marks[] = {97,98,99};
            int nonchangeable = 5;
            updateMarks(marks, nonchangeable);
            System.out.println(nonchangeable);

            //print our marks
            for (int i = 0; i < marks.length; i++){
                System.out.print(marks[i] + " ");
            }
            System.out.println();
        }
    */

    //linear search (return the index where specific key is located in an array)
    /* 
        public static int linearSearch(int numbers[], int key){
            for (int i = 0; i < numbers.length; i++){
                if(numbers[i] == key){ //find index of key and return it
                    return i;
                }
            }
            return -1;

        }
        public static void main (String args[]){
            int numbers[] = {2,4,6,8,10,12,14,16};
            int key = 10;
            int index = linearSearch(numbers, key); //call the function and store it in variable
            if (index == -1){ //if outcome is -1 print not found
                System.out.println("NOT FOUND");
            }
            else{ //else print the index where key is located
                System.out.println("Key is located at: " + index);
            }
            
        }
    */

    /* Print the largest and smallest number in an array
        public static int getLargest(int numbers[]){
            int largest = Integer.MIN_VALUE;
            int smallest = Integer.MAX_VALUE;
            for (int i = 0; i < numbers.length; i++){
                if (largest < numbers[i]){
                    largest = numbers[i];
                }
                if (smallest > numbers[i]){
                    smallest = numbers[i];
                }
            }
            System.out.println("Smallest value is: " + smallest);
            return largest;
        }

        public static void main (String args[]){
            int numbers[] = {1,2,6,3,5};
            System.out.println("Largest number in the given set is: " + getLargest(numbers));
        }
    */

    // Binary Search (like we find word in an english dictionary)
    /* Print the index of where given key is located
        public static int binarySearch(int numbers[], int key){
            int start = 0, end = numbers.length - 1; //end will be n-1
            

            while (start <= end){ // as long as start is less than equal to end
                int mid = (start + end)/2; //mid 
                if (numbers[mid] == key){ //if mid = key return mid
                    return mid;
                }
                if (numbers[mid] > key){// if mid > key ,1st half (update end)
                    end = mid - 1;
                }
                else{ // if mid < key, 2nd half (update start)
                    start = mid + 1;
                }
            }
            return -1; //else key doesn't exist in array
        }
        public static void main (String args[]){
            int numbers[] = {2,4,6,8,10,12,14};
            int key = 10;
            System.out.println("Index for the key is: " + binarySearch(numbers,key));
        }
    */

    // Reverse an array
    /*
        public static void reverse (int numbers[]){
            int first = 0, last = numbers.length - 1;
            int temp;
            while (first < last){
                //swap code
                temp = numbers[last];
                numbers[last] = numbers[first];
                numbers[first] = temp;
                first ++; //increase first number
                last --; //decrease last number

            }
        }

        public static void main (String args[]){
            int numbers[] = {2,4,6,8,10};

            reverse(numbers);
            for (int i = 0; i < numbers.length; i++ ){ //loop for printing the array after reversing the array
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
        }
    */

    //print pairs for each number in an array and find total number of pairs
        /*
        public static void printPairs (int numbers[]){
            int totalPairs = 0;
            for (int i = 0; i < numbers.length; i++){
                int curr = numbers[i]; //take a number from array one by one
                for (int j = i + 1; j < numbers.length; j++){ //print it's pair w all numbers starting from  i+1 to n
                    System.out.print("(" + curr + "," + numbers[j] + ")");
                    totalPairs ++;
                }
                System.out.println();
            }
            System.out.print(totalPairs);
                
        }

        public static void main (String args[]){
            int numbers[] = {2,4,6,8,10};
            printPairs(numbers);
        }
        */

       /*

        public static void printSubarrays (int numbers[]){
            int ts = 0;
            for (int i = 0; i < numbers.length; i++){
                int start = i;
                for (int j = i; j < numbers.length; j++){
                    int end = j;
                    for (int k = start; k <= end; k++){
                        System.out.print(numbers[k] + " ");
                    }
                    ts ++;
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println(" Total subarrays = " + ts);
        }
        
        public static void sumOfSubarrays ()
        
        public static void main (String args[]){
            int numbers [] = {2,4,6,8,10};
            printSubarrays(numbers);
        }

        */

    /* //Print max of sum of subarrays of given array
       //Method 1:  Brute force (bad time complexity)

       public static void MaxSumOfSubarrays (int numbers[]){
            int currSum = 0;
            int maxSum = Integer.MIN_VALUE; //intoduce -infinity
            for (int i = 0; i < numbers.length; i++){
                int start = i;
                for (int j = i; j < numbers.length; j++){
                    int end = j;
                    currSum =0; //introduce new variable to store sum of subarray
                    for (int k = start; k <= end; k++){ //loop to print sum of subarray
                        //sum of subarray
                        currSum = currSum + numbers[k];
                    }
                    System.out.println(currSum); //print the sum for each subarray
                    if (maxSum < currSum){ //condition to check which subarray has max sum compare w -infinity
                        maxSum = currSum;
                    }
                }
            }
            System.out.println("Maximum sum is: " + maxSum); //print max sum of subarray
        }


        public static void main (String args[]){
            int numbers [] = {2,4,6,8,10};
            MaxSumOfSubarrays(numbers);
        }
    
    */

    /* // Method 2: Prefix SUm
    // time complexity O(n^2) which is better

    public static void MaxSumOfSubarrays (int numbers[]){
            int currSum = 0;
            int maxSum = Integer.MIN_VALUE; //intoduce -infinity
            int prefix[] = new int [numbers.length]; //create new array called prefix who has capacity to store number of integers = number of integers in prev array numbers

            //calculate prefix array
            prefix[0] = numbers[0]; //integer at 1st index in prefix array = integer at 1st index in numbers array
            for (int i = 1; i < prefix.length; i++){ //therefore start the loop from i = 1 to length of prefix array
                prefix[i] = prefix[i-1] + numbers[i];// it will add sum until previous number of i and sum of numbers array (important formula)
            }
            for (int i = 0; i < numbers.length; i++){
                int start = i;
                for (int j = i; j < numbers.length; j++){
                    int end = j;
                    
                    //ternary operator
                    currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                              //if start = 0 return prefix at end (because if start = 0, prefix[start - 1] = prefix[-1] which doesn't exist)
                              //else return this = prefix[end] - prefix[start - 1]
                    System.out.println(currSum); //print the sum for each subarray
                    if (maxSum < currSum){ //condition to check which subarray has max sum compare w -infinity
                        maxSum = currSum;
                    }
                }
            }
            System.out.println("Maximum sum is: " + maxSum); //print max sum of subarray
        }


        public static void main (String args[]){
            int numbers [] = {2,4,6,8,10};
            MaxSumOfSubarrays(numbers);
        }
    */

    //Method 3: Kadane's algorithm: take negative sum as 0 and compare current sum and max sum simultaneously
    //time complexity is O(n)

    /*
        public static void kadanes (int numbers[]){
            int ms = Integer.MIN_VALUE;
            int cs = 0;
            for (int i = 0; i < numbers.length; i++){ //loop to update cs and check if its negative)
                cs = cs + numbers[i]; //update cs
                if (cs < 0){ //check if negative and return 0 if yes
                    cs = 0;
                }
                ms = Math.max(cs,ms); //update ms with max value between cs and ms
            }
            System.out.println("Maximum sum of subarray is: " + ms);
        }

        public static void main (String args[]){
            int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
            kadanes(numbers);
        }
    */

   //Trapped Rainwater question
   
   /*

    public static int trappedRainwater(int height []){
        int n = height.length;

        //Calculate max left boundary
        int leftMax [] = new int[n];
        leftMax[0] = height[0]; //height of first element in leftMax = height of first element in height
        for (int i = 1; i < n; i++){ //therefore, start loop from i = 1 till i is less than n(length of height array)
            leftMax[i] = Math.max(leftMax[i-1], height[i]); //max from previous element in leftMax array and current height of bar
        }

        //calculate the right max boundary
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1]; //height of last element in rightMax = height of last element in height
        for (int i = n-2; i >= 0; i--){//therefore, start loop from i = n-2 till it is greater than or equal to 0
            rightMax[i] = Math.max(rightMax[i+1], height[i]); // max from next element in rightMax and current height of bar
        }

        int trappedWater = 0;
        //loop

        for (int i = 0; i < n; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]); //waterLevel will be min of leftMax bound and rightMax bound
            trappedWater += waterLevel - height[i]; //trappedWater = (height of waterLevel - height of bar) * width, width = 1
        }
        return trappedWater;

    }
    public static void main (String args[]){
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trappedRainwater(height)); 
    }

    */

// Buuying and selling stocks question - find maximum profit
/*
    public static int buyAndSellStocks (int prices[]){
        int buyPrice = Integer.MAX_VALUE; //set this to +infinity to track lowest buying price
        int maxProfit = 0; //set this ti track maximum profit
        
        for (int i = 0; i < prices.length; i++){
            if (buyPrice < prices[i]){  //profit
                int profit = prices[i] - buyPrice; //today's profit
                maxProfit = Math.max(maxProfit,profit); //update maxProfit with max value between profit and maxProfit
            }
            else{ //when current price is less than buy price, that is there is no chance of profit, then buy the stock so we will get profit later
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main (String args[]){
        int prices[] = {7,1,5,3,6,4};
        System.out.println(buyAndSellStocks(prices));
    }
*/


    




        

 }
