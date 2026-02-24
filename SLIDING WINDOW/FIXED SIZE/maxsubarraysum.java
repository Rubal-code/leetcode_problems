class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int maxsum=0;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        maxsum=sum;
        for(int i=k;i<arr.length;i++){
            sum+=arr[i]-arr[i-k];
            maxsum=Math.max(maxsum,sum);
        }
        return maxsum;
    }
}