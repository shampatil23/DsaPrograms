class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result=new StringBuilder();
        int level=0;
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                if(level>0) result.append(s.charAt(i));
                level++;

            }
            else if(s.charAt(i)==')'){
                level--;
                if(level>0) result.append(s.charAt(i));
            }
        }
        return result.toString();

    }
}