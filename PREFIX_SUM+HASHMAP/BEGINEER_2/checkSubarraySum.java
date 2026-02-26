class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        int prefix_sum=0;
        map.put(0,-1);
        for(int i=0;i<n;i++){
            prefix_sum+=nums[i];
            int remainder=prefix_sum % k;
            if(map.containsKey(remainder)){
                int prevIndex=map.get(remainder);
                if(i-prevIndex >= 2){
                    return true;
                }
            }
            else{
                map.put(remainder,i);
            }
        }
        return false;
    }
}