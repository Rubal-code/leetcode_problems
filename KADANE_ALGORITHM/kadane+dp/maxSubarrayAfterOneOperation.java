class Solution {
    public int maxSumAfterOperation(int[] nums) {
        
        int n = nums.length;

        int noOp = nums[0];                 
        int oneOp = nums[0] * nums[0];      

        int result = oneOp;

        for (int i = 1; i < n; i++) {

            int prevNoOp = noOp;

            noOp = Math.max(nums[i], noOp + nums[i]);

            oneOp = Math.max(
                        Math.max(oneOp + nums[i], 
                                 prevNoOp + nums[i] * nums[i]),
                        nums[i] * nums[i]
                    );

            result = Math.max(result, oneOp);
        }

        return result;
    }
}