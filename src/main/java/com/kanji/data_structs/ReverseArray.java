
package com.kanji.data_structs;

/**
 *
 * @author Kanji
 */
public class ReverseArray {
    
    static int[] arr1 = {1,2,3};
    
    
    public void reverse(int[] arr) {
        
        int other =0, temp;
        
        for(int i=0; i < arr.length; i++) {
            
            other = arr.length - i - 1;
            temp = arr[i];
            
            arr[i] = arr[other];
            arr[other] = temp;
            
                        
        }
        
        System.out.println(arr[other]);
        
    }
    
    public static void main(String[] args) {
        
        
        ReverseArray rev = new ReverseArray();
        
        rev.reverse(arr1);
        
    }
    
}
