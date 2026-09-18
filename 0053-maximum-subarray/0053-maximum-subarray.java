import java.util.*;

class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        
        int maximum=Integer.MIN_VALUE;
        for (int i=0; i<nums.length; i++){
                sum+=nums[i];  
                    maximum = Math.max(sum, maximum);
                    if(sum<0){
                        sum=0;
                    }

                    
                
            }
           
        
        return maximum;
        
    }
}