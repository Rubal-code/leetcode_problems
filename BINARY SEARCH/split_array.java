class Solution {
    public int splitArray(int[] nums, int k) {
        int left=0;
        int right=0;
        for(int n:nums){
            left=Math.max(left,n);
            right+=n;
        }
        int ans=right;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(ispossible(nums,k,mid)){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }
    private boolean ispossible(int nums[],int k,int maxsum){
        int subarray=1;
        int sum=0;
        for(int n:nums){
            if(sum+n > maxsum){
                subarray++;
                sum=0;
            }
            sum+=n;
        }
        return subarray<=k;
    }
}