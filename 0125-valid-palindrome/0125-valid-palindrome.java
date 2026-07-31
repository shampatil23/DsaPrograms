class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        String strr=s.toLowerCase();
        String str = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int right=str.length()-1;
        boolean flag=true;
        while(left<=right){
            if(str.charAt(left)!=str.charAt(right)){
                flag=false ;
            }
            left++;
            right--;

        }
        return flag;
    }
}