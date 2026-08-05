class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0 || strs==null){
            return "";

        }
        String prefix=strs[0];
        for(int i=1; i<strs.length; i++){
           String next=strs[i];
           int len=Math.min(prefix.length(),next.length());
           String temp="";
           
           for(int j=0;j<len;j++){
            if(prefix.charAt(j)==next.charAt(j)){
                temp+=prefix.charAt(j);
            }
            else{
                break;
            }

           }
           prefix=temp;
           if(prefix==""){
            return "";
           }
           
        }
        return prefix;
    }
}