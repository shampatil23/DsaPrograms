class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        int minv=Integer.MAX_VALUE;

        while(low<=high){
            int mid=(low+high)/2;
            if(nums[low]<=nums[mid])
            {
                minv=Math.min(minv,nums[low]);
                low=mid+1;

            }
            else{
                minv=Math.min(minv,nums[mid]);
                high=mid-1;
            }
        }
        return minv;
    }
}