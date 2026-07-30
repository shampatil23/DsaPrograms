class Solution {
    public int largestAltitude(int[] gain) {
        int largest=0;
        int alt=0;
        for(int i=0; i<gain.length; i++){
           alt=gain[i]+alt;
           largest=Math.max(largest,alt);

            }
           return largest;


  
    }
}