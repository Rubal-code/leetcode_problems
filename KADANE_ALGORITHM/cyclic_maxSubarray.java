class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currentmax=nums[0];
        int maxsum=nums[0];

        int currentmin=nums[0];
        int minsum=nums[0];

        
        int total_sum=nums[0];
        for(int i=1;i<nums.length;i++){
            // normal kadane maximum subarray
            currentmax=Math.max(nums[i],nums[i]+currentmax);
            maxsum=Math.max(currentmax,maxsum);

            //reverse kadane minimum subarray
            currentmin=Math.min(nums[i],nums[i]+currentmin);
            minsum=Math.min(currentmin,minsum);
            // for cycle you have to calculate total also
            total_sum+=nums[i];
        }
        // edge case if all numbers are negative
        if(maxsum<0){
            return maxsum;
        }
        return Math.max(maxsum,total_sum-minsum);// total_sum-minsum for cycle case
    }
}