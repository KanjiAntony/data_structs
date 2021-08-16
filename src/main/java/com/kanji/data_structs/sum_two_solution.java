package com.kanji.data_structs;

/**

* Given an array of integers nums and an integer target, return indices of the two numbers such that 
* they add up to target.

* You may assume that each input would have exactly one solution, and you may not use the same element twice.

* You can return the answer in any order.
* 
* Example 1:

    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 
*/

import java.util.Arrays;

class sum_two_solution {
    
    static int[] numbers = {2,7,11,15};
    static int targ = 9;
    
    
    //using the brute force approach
    public int[] twoSumBruteForce(int[] nums, int target) {
        
        int sum = 0;
        
        for(int i=0; i < nums.length ; i++) {
            
            for(int j = i + 1; j < nums.length; j++) {
                
                sum = nums[i] + nums[j];
                
                if (sum == target) {
                    
                    return new int[] {i,j};
                    
                }
                
            }                
            
            
        }
        
        return null;
        
    }
    
    //using the two pointer approach
    public int[] twoPointerApproach(int[] nums, int target){
        
        //initialise the sum, left pointer and right pointer
        int sum = 0;
        int[] results = new int[2];
        int left_pointer = 0;
        int right_pointer = nums.length - 1; // should start from the end of array
        
        //keep working task when the left pointer is still less than right pointer
        
        while(left_pointer < right_pointer) {
            
            //get the sum
            sum = nums[left_pointer] + nums[right_pointer];
            
            // if the sum is equal to target, we return or print the positions
            if(sum == target) {
                
                return new int[] {left_pointer,right_pointer};
                                
            } else if(sum < target) { 
                
                //if the sum is less than target, we add one to the left pointer
                
                left_pointer++;
                
            } else {
                
                //if the sum is greater than target, we sub one to the right pointer
                right_pointer--;
                
            }
            
        }
        
        return null;
        
    }
    
    public static void main(String[] args) {
        
                
        sum_two_solution sol = new sum_two_solution();
        
        //since we have two nested loops, time complexity is O(n^2), space complexity O(1)
        
        /*int[] print_brute_force_array = sol.twoSumBruteForce(numbers,targ);
        
        System.out.println(Arrays.toString(print_brute_force_array));*/
        
        
        //time complexity is O(n log n)
        int[] print_two_pointer_array = sol.twoPointerApproach(numbers,targ);
        System.out.println(Arrays.toString(print_two_pointer_array));
        
    }
}
