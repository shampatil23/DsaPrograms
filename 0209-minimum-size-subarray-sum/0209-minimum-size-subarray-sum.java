class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int mincount=Integer.MAX_VALUE;
        int start=0;
        for(int end=0; end<nums.length; end++){
            sum=sum+nums[end];

            while (sum>=target){
                mincount=Math.min(mincount,end-start+1);
                sum=sum-nums[start];
                start++;
            }
            
        }
       return mincount == Integer.MAX_VALUE ? 0 : mincount;
    }
}