class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int total_sum=0;
        for (int num:nums){
            total_sum+=num;
        }
        int leftsum=0;
        for(int i=0;i<nums.length;i++){
            int right_sum=total_sum-leftsum-nums[i];
            if(leftsum==right_sum){
                return i;
            }
            leftsum+=nums[i];
        }
        return -1;
    }
}