class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>>result=new ArrayList<>();
        // step 1 sort first 
        Arrays.sort(nums);

        // step 2 fix one pointer let it i
        for(int i=0;i<nums.length-2;i++){
            // skip duplicates for i
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            // now unfixed variables
            int left=i+1;
            int right=nums.length-1;

            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];

                if(sum==0){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                    // skip dupicates for left
                    while(left < right && nums[left]==nums[left-1]){
                        left++;
                    }
                    // for right
                    while(left<right && nums[right]==nums[right+1]){
                        right--;
                    }
                }
                else if(sum<0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return result;
    }
}