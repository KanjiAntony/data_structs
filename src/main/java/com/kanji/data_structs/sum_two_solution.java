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
        int left_pointer = 0;
        int right_pointer = 0;
        
        //keep working task when the left pointer is still less than right pointer
        
    }
    
    public static void main(String[] args) {
        
        sum_two_solution sol = new sum_two_solution();
        
        sol.twoSumBruteForce(numbers,targ);
        
    }
}
