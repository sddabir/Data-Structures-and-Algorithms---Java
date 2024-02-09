public class ArraysPracticQs{
    //Question 1:Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.Example 1:Input:nums = [1, 2, 3, 1]Output:   true Example 2:Input:nums = [1, 2, 3, 4]Output:   false Example 3:Input:nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]Output:   true Constraints:•1 <= nums .  lengtth <= 105•-109 <= nums [ i ] <= 109
    /*
    public static boolean RepeatedValues(int nums[]){
        for (int i = 0; i < nums.length-1; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main (String args[]){
        int nums[] = {1, 3, 4};
        System.out.println(RepeatedValues(nums));
    }
    */

    //You  are  given  an  array prices where prices[i] is  the  price  of  a  given  stock  on  the ith day.Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0. Example 1:Input:prices = [7, 1, 5, 3, 6,  4]   Output:   5

    /*
    public static int buyAndSellStocks(int prices[]){
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++){
            if (buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                buyPrice = prices[i];
            }     
        }
        return maxProfit;
    }

    public static void main (String args[]){
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(buyAndSellStocks(prices));
    }
    */

   // Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining

   /*

    public static int trappedRainwater(int height[]){
        int n = height.length;
        //calculate leftmax array
        int leftMax[] = new int [n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++){
            leftMax[i] = Math.max(leftMax[i-1],height[i]);
        }
        //calculate rightMax array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for (int i = n-2; i>=0; i--){
            rightMax[i] = Math.max(rightMax[i+1],height[i]);
        }

        int trappedWater = 0;

        for (int i = 0; i < n; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]); //waterlevel =  min of leftmax and right max
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
        

    }

    public static void main (String args[]){
        int height[] = {0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trappedRainwater(height));
    }

    */

    
    
}


    