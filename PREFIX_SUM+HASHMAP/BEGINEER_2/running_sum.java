class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int ans[]=new int [n];
        int prefix_sum=0;
        
        for(int i=0;i<n;i++){
            prefix_sum+=nums[i];
            ans[i]=prefix_sum;
        }
        return ans;
    }
}