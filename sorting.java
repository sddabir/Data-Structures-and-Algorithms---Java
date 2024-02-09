import java.util.*;
public class sorting{
    // Bubble Sort
    /*
    public static void bubbleSort (int arr[]){
        for (int turn = 0; turn < arr.length-1; turn ++){ //n-1 total turns cuz we started from 0 in this case 4 turns 0,1,2,3 
                for (int j = 0; j < arr.length-1-turn; j++){ //n-1-turns
                    if (arr[j] > arr[j+1]){ //check if prev element is larger if yes swap them
                        //swap
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
        }
    }

    public static void printArr (int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main (String args[]){
        int arr[] = {5,4,1,3,2};
        bubbleSort(arr);
        printArr(arr);
    }
    */

    /*
    public static void selectionSort (int arr[]){
        for (int i = 0; i < arr.length-1; i++){ //n-1 turns cuz we started from 0
            int minPos = i; //current min position element
            for (int j = i+1; j < arr.length; j++){
                if (arr[minPos] > arr[j]){
                    minPos = j; //if minPos > j replace minPos with j
                }
            }
            //swap outside the inner loop but inside outer loop as we have to swap only once
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

     public static void printArr (int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main (String args[]){
        int arr[] = {5,4,1,3,2};
        selectionSort(arr);
        printArr(arr);
    }
    */

    /*

    public static void insertionSort(int arr[]){
        for (int i = 1; i < arr.length; i++){
            int curr = arr[i]; //initiate curr element as i
            int prev = i-1;
            //finding out correct position to insert
            while (prev >= 0 && arr[prev] > curr){ //as long as prev element is >= 0 ans prev element is > current element
                arr[prev+1] = arr[prev]; //replace prev element with prev+1
                prev--; //keep on decreasing prev element
            }
            //insertion
            arr[prev+1] = curr; //set curr element as prev + 1
        }
    }

    public static void printArr (int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main (String args[]){
        int arr[] = {5,4,1,3,2};
        insertionSort(arr);
        printArr(arr);
    }

    */

    //inbuilt sort

    /*
    
    public static void printArr (int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main (String args[]){
        int arr[] = {5,4,1,3,2};
        Arrays.sort(arr);
        printArr(arr);
    }

    */

   //sorting selective elements from array 
   /*
    public static void printArr (int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main (String args[]){
        int arr[] = {5,4,1,3,2};
        Arrays.sort(arr, 0, 3); //sorting first 3 elements at index 0,1,2
        printArr(arr);
    }
    */
    
    //sort in descending order
    /*
    public static void printArr (Integer arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main (String args[]){
        Integer arr[] = {5,4,1,3,2};
        Arrays.sort(arr, Collections.reverseOrder()); //sorting first 3 elements at index 0,1,2
        printArr(arr);
    }
    */
    
    /*
    public static void printArr (Integer arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main (String args[]){
        Integer arr[] = {5,4,1,3,2};
        Arrays.sort(arr,0,3,Collections.reverseOrder()); //sorting first 3 elements at index 0,1,2
        printArr(arr);
    }
    */

    /*

    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        //create new array count with elements largest + 1
        int count[] = new int [largest + 1];
        for (int i = 0; i < arr.length; i++){
            count[arr[i]]++;
        }
        //sorting
        int j = 0;
        for (int i=0;i<count.length;i++){
            while (count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArr (int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main (String args[]){
        int arr[] = {5,4,1,3,2};
        countingSort(arr);
        printArr(arr);
    }

    */

    





}