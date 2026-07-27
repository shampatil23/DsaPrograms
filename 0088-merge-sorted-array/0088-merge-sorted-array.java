class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int end=m+n;
        int start=0;  
        while(m<end){
            nums1[m]=nums2[start];
            m++;
            start++;
        }      
        Arrays.sort(nums1) ;  
   }

}