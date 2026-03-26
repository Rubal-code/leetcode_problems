class Solution {
    public int lengthOfLastWord(String s) {
        int length=0;
        int i = s.length() - 1;
        //skip trailing spaces
        while(i>=0 && s.charAt(i)==' '){
            i--;
        }
        // count length of last word
        while(i>=0 && s.charAt(i)!=' '){
            length++;
            i--;
        }
        return length;
    }
}