package com.kanji.data_structs;

class sum_two_solution {
    
    static int[] numbers = {2,7,11,15};
    static int targ = 9;
    
    
    //using the brute force approach
    public static void twoSumBruteForce(int[] nums, int target) {
        
        int sum = 0;
        
        for(int i=0; i < nums.length ; i++) {
            
            for(int j = i + 1; j < nums.length; j++) {
                
                sum = nums[i] + nums[j];
                
                if (sum == target) {
                    
                    System.out.println("Positions "+ i + " , "+ j);
                    
                }
                
            }                
            
            
        }
        
        //return arr;
        
    }
    
    //using the two pointer approach
    public void twoPointerApproach(int[] nums, int target){
        
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
                
                System.out.println(left_pointer+","+right_pointer);
                break;
                                
            } else if(sum < target) { 
                
                //if the sum is less than target, we add one to the left pointer
                
                left_pointer++;
                
            } else {
                
                //if the sum is greater than target, we sub one to the right pointer
                right_pointer--;
                
            }
            
        }
        
        //System.out.println(results.);
        
    }
    
    public static void main(String[] args) {
        
        sum_two_solution sol = new sum_two_solution();
        
        //since we have two nested loops, time complexity is O(n^2), space complexity O(1)
        //sol.twoSumBruteForce(numbers,targ);
        
        //time complexity is O(n log n)
        sol.twoPointerApproach(numbers, targ);
        
    }
}
