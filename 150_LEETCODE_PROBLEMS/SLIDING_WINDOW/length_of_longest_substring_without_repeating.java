class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int left=0;
        int maxlength=0;
        HashSet<Character>set=new HashSet<>();
        for(int right=0;right<n;right++){

            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxlength=Math.max(maxlength,right-left+1);
            
        }
        return maxlength;

        //brute force
    //     int longest=0;
    //     for(int i =0;i<s.length();i++){
    //         for(int j=i;j<s.length();j++){
    //             if(allUnique(s,i,j)){
    //                 longest=Math.max(longest,j-i+1);
    //             }
    //         }
    //     }
    //     return longest;
    // }    
    //     private boolean allUnique(String s , int start ,int end){
    //         boolean[]visited=new boolean[256];
    //         for(int i=start;i<=end;i++){
    //             if(visited[s.charAt(i)]){
    //                 return false;
    //             }
    //             visited[s.charAt(i)]=true;
    //         }
    //         return true;
    //     }
    }
}