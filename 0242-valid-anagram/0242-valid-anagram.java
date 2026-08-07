class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer>map=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0; i<s.length(); i++){
            char chs=s.charAt(i);
            char cht=t.charAt(i);
            map.put(chs,map.getOrDefault(chs,0)+1);
            map.put(cht,map.getOrDefault(cht,0)-1);
        }
        for(int i:map.values()){
            if(i!=0){
                return false;
            }

        }
        return true;
    }
}