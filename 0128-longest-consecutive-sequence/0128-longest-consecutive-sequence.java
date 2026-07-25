import java. util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        int longest=1;
        

        HashSet<Integer>set=new HashSet<>();
         for(int num :nums){
            set.add(num);
         }

         for(int el : set){
            if(!set.contains(el-1)){
                 int x=el;
                int count=1;
                

            while(set.contains(x+1)){
                 x=x+1;
                count++;

            }
            longest=Math.max(longest,count);
         }
         }
         return longest;
    }
}