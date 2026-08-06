class Solution {
   
    public int maxDepth(String s) {
         int currentDepth = 0;
int maxDepth = 0;

for (char ch : s.toCharArray()) {

    if (ch == '(') {
        currentDepth++;
        maxDepth = Math.max(maxDepth, currentDepth);
    }

    if (ch == ')') {
        currentDepth--;
    }
}

return maxDepth;
    }
}