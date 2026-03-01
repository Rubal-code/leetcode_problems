class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int currentmax=nums[0];
        int maxsum=nums[0];

        int currentmin=nums[0];
        int minsum=nums[0];

        if(nums.length<=1){
            return Math.abs(nums[0]);
        }
        for(int i=1;i<nums.length;i++){
            currentmax=Math.max(nums[i],currentmax+nums[i]);
            maxsum=Math.max(maxsum,currentmax);

            currentmin=Math.min(nums[i],currentmin+nums[i]);
            minsum=Math.min(minsum,currentmin);
            
        }
        return Math.abs(minsum) > Math.abs(maxsum) ? Math.abs(minsum) : Math.abs(maxsum);
    }
}