class Solution {
    int finddays(int wights[], int capacity){
        int days=1;
        int load=0;
        
        for(int i=0; i<wights.length; i++){
            if(wights[i]+load>capacity){
                days=days+1;
                load=wights[i];
            }
            else{
                load+=wights[i];
            }
        }
        return days;

    }
    public int shipWithinDays(int[] weights, int days) {
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int i=0; i<weights.length; i++){
            low=Math.max(low,weights[i]);
            high=high+weights[i];
        }

        while(low<=high){
            int mid=(low+high)/2;
            int findays=finddays(weights,mid);
            if(findays<=days){
                high=mid-1;
            
            }
            else{
                low=mid+1;
            }
        }
        return low;

        
    }
}