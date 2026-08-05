class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words=s.split(" ");
           if (pattern.length() != words.length) {
          return false;
           }
        Map<Character,String>mppKey=new  HashMap<>();
        Map<String,Character>mppValue=new HashMap<>();
   


        for(int i=0; i<pattern.length(); i++){
            char original=pattern.charAt(i);
            String mapping=words[i];

                 if(! mppKey.containsKey(original)){
                if(!mppValue.containsKey(mapping)){ 

                      mppKey.put(original,mapping);
                    mppValue.put(mapping,original);
        }
        else{
            
            return false;

        }


    }
        
    else{

        if(!mppKey.get(original).equals(mapping)) {
            return false;
        }
    }
}
    return true;
    }
}