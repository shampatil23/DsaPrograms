class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int lcount=0;
        int mcount=0;
        int pcount=0;

        for(int num:nums){

            if(num<pivot){
                lcount++;
            }
            else if(num>pivot){
                mcount++;
            }
            else{
                pcount++;
            }
        }

         int i=0;
         int j=lcount;
         int k=lcount+pcount;
         int ans[]=new int[nums.length];
        for(int num: nums){
                if(num<pivot){
                ans[i]=num;
                i++;
            }
            else if(num>pivot){
                ans[k]=num;
                k++;
        
            }
            else{
                ans[j]=num;
                j++;
            }
            
        }
        return ans;
        
    }
}