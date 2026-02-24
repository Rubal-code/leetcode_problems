class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxans=0;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        maxans=sum;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i] - nums[i-k];
            maxans=Math.max(maxans,sum);
        }
        return maxans/k;
    }
}
// We’re sliding the window of size k one element at a time.

// At each step:

// Remove the first element of the old window → nums[i - k]

// Add the new element coming in → nums[i]

// Update the sum

// Compare with maxSum and update if needed.