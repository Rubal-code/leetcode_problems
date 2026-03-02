class Solution {
    public int missingNumber(int[] nums) {
        int range=nums.length;
         int actualsum=(range*(range+1))/2;   //actualsum if that element was also present
         int currsum=0;
         for (int i=0;i<nums.length;i++){
            currsum+=nums[i];       // when that elemant is not present
         }
         int ans=actualsum-currsum;
         return ans;
    }     
}