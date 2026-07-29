class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0;
        int maxthreshold=0;

        for(int i=0; i<k; i++){
            sum=sum+arr[i];
        }
        if((sum/k)>=threshold){
            maxthreshold++;

        }
        int start=0;
        int end=k;


        while(end<arr.length){
           
            
        sum=sum-arr[start];
        start++;

        sum=sum+arr[end];
        end++;

           if((sum/k)>=threshold){
                 maxthreshold++;
             

        }
          
        

      
        
     
    }
    return maxthreshold;
        
    }
}