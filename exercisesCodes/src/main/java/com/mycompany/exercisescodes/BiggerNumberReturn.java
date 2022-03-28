
package com.mycompany.exercisescodes;


public class BiggerNumberReturn {

    public static void main(String[] args) {
        
        int[] tata = {1, 3, 5, 12, 4, 21, 3, 2,49};
        System.out.println(biggerFinder(tata));
    }
    
    public static int biggerFinder(int[] nums ){
        
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                
                if(nums[i] < nums[j]){
                    int holder=0;
                    holder = nums[i];
                    nums[i]=nums[j];
                    nums[j]=nums[i];
                    
                }
            }
        }
        return nums[0];
    }
    
}
