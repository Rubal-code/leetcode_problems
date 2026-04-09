class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
        }
        HashSet<Integer>set=new HashSet<>();

        for(int i:nums){
            set.add(i);
        }
        int longest_streak=0;
        for(int i:set){
            if(!set.contains(i-1)){
                int currnum=i;
                int currstreak=1;
                while(set.contains(currnum+1)){
                    currnum++;
                    currstreak++;
                }
                longest_streak=Math.max(longest_streak,currstreak);
                
            }
        
        }
          return longest_streak;
    }
}