class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1=0;
        int count2=0;
        int e1=0;
        int e2=0;
        int n=nums.length;

        for(int i=0;  i<n; i++){
            if(count1==0 && e2!=nums[i]){
                e1=nums[i];
                count1=1;
            }
            else if(count2==0 && e1!=nums[i]){
                e2=nums[i];
                count2=1;
            }

            else if(nums[i]==e1) count1++;
            else if(nums[i]==e2) count2++;

            else{
                count1--;
                count2--;

            }

            
        }
        count1=0;
        count2=0;
        for(int i=0; i<n; i++){
            if(nums[i]==e1){
                count1++;
            }
            else  if(nums[i]==e2){
                count2++;
            }
        }
        ArrayList<Integer>ans=new ArrayList<>();
        int min=(int)(n/3)+1;
        if(count1>=min) ans.add(e1);
        if(count2>=min) ans.add(e2);
       
        return ans;

    }
}