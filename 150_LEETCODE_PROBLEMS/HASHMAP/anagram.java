class Solution {
    public boolean isAnagram(String s, String t) {
        // // brute force
        // // 1 if length not matches
        // if(s.length()!=t.length()) return false;
        // // 2 Convert t to char array so we can mark used chars
        // char [] tArr=t.toCharArray();
        // // Step 3: For each character in s
        // for(int i=0;i<s.length();i++){
        //     boolean found=false;
        //     // try to find matching character in t
        //     for(int j=0;j<tArr.length;j++){
        //         if(s.charAt(i)==tArr[j]){
        //             found =true;
        //             //mark this character as used
        //             tArr[j]='#';
        //             break;
        //         }
        //     }
        //     if(!found) return false;
        // }
        // return true;
        if(s.length()!=t.length()) return false;
        int []count=new int [26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i) - 'a']++;
        }
        for(int i=0;i<t.length();i++){
            count[t.charAt(i) - 'a']--;
        }
        for(int val:count){
            if(val!=0) return false;
        }
        return true;
    }
}