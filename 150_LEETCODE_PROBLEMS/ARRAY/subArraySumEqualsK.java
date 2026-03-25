class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int count=0;//to count subarrays
        int prefix_sum=0;
        map.put(0,1);//important case when the prefix_sum-k=0 , we may miss one subarray
        for(int num:nums){
            prefix_sum+=num;
            if(map.containsKey(prefix_sum-k)){
                count+=map.get(prefix_sum-k);
            }
            map.put(prefix_sum,map.getOrDefault(prefix_sum,0)+1);
        }
        return count;
    }
}