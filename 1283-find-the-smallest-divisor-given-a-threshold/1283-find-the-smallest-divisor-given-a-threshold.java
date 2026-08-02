class Solution {
    int thresholdf(int[]nums,int mid ,int threshold){
        int sum=0;
        for(int i=0; i<nums.length; i++){

             sum+=Math.ceil((double)nums[i]/(double)mid);
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
      int low=1;
     int maxi=Integer.MIN_VALUE;
      for (int i=0; i<nums.length; i++){
         maxi=Math.max(maxi,nums[i]);
      }
       int high=maxi;
      while(low<=high){
        int mid=low+(high-low)/2;

        if(thresholdf(nums,mid,threshold)<=threshold){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
      

      }

      return low;
    }
}