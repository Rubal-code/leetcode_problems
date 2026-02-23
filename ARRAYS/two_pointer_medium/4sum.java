class Solution {
    public List<List<Integer>> fourSum(int[] nums,int target) {
        ArrayList<List<Integer>>result=new ArrayList<>();
        // step 1 sort first 
        Arrays.sort(nums);

        // step 2 fix one pointer let it i
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
            // now unfixed variables
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            if(j>i+1 && nums[j]==nums[j-1]){
                continue;
            }

            int left=j+1;
            int right=nums.length-1;

            while(left<right){
                long sum=(long)nums[i]+nums[j]+nums[left]+nums[right];

                if(sum==target){
                    result.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
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
                else if(sum<target){
                    left++;
                }
                else{
                    right--;
                }
            }

        }
        }
        return result;
    }
}