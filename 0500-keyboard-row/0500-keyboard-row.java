class Solution {
    public String[] findWords(String[] words) {

        String s1 = "qwertyuiop";
        String s2 ="asdfghjkl";
        String s3 =  "zxcvbnm";
        ArrayList<String> list = new ArrayList<> ();

        for(String word : words){
            String lower = word.toLowerCase();
            char temp = lower.charAt(0);
            String row;
            if(s1.contains(""+ temp)){
                row = s1;
            }
            else if(s2.contains("" + temp)){
                row =s2;
            }
            else {
                row = s3;
            }
            boolean valid = true;
            for(char ch: lower.toCharArray() ){
                if(!row.contains(""+ch)){
                        valid = false;
                        break;
                }
            }
        if(valid){
                     list.add(word);
        }
        } 
return list.toArray(new String[0]);

        }
    }
