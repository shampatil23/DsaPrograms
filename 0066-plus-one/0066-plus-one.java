class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1; i>=0; i--){
            if(digits[i]<9){
                digits[i]++;  //n-1 digit+1
                return digits;  
            }

            digits[i]=0;
       }
            int ans[]=new int [digits.length+1];
             ans[0]=1;    // the 0th location alwase be 1 because 9+1=10 so 0 is initialize alrady and 1 here initialized so [1,0] if ans making 20 it will never possible we dont need to creat an array ... 
            return ans;
     
     

     
    }
}