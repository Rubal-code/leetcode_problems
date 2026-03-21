class Solution {
    public boolean canJump(int[] nums) {
        int farthest=0;   // farthest index we can reach
        for(int i=0;i<nums.length;i++){
            // if current index is inreachable
            if(i>farthest){
                return false;
            }
            // update the farthest reach
            farthest=Math.max(farthest,nums[i]+i);
            //if we already can reach the last index
            if(farthest>nums.length-1){
                return true;
            }
        }
        return true;
    }
}