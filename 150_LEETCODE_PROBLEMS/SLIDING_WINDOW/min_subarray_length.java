class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min_length=Integer.MAX_VALUE;
        int left=0;
        int sum=0;
        
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(target<=sum){
                min_length=Math.min(min_length,right-left+1);
                sum-=nums[left];
                left++;
            }
        }
        
        return (min_length==Integer.MAX_VALUE) ? 0 : min_length;
    }
}