class Solution {
    public String reverseWords(String s) {
        //step 1) trim the spaces
        s=s.trim();
        // step 2 ) convert into words
        String[]words=s.split("\\s+");
        // step 3) use stringbuilder for effieciency
        StringBuilder result=new StringBuilder();
        for(int i = words.length-1;i>=0;i--){
            result.append(words[i]);
            if(i!=0){
                result.append(" ");
            }
        }
        return result.toString();
    }
}