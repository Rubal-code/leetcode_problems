class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=nums.length;
        int count=0;
        int prefix_sum=0;
        map.put(0,1);
        for(int num:nums){
            // covert to 1 if odd , 0 if even
            prefix_sum+=(num % 2);
            if(map.containsKey(prefix_sum - k)){
                count+=map.get(prefix_sum - k);
            }
            map.put(prefix_sum,map.getOrDefault(prefix_sum,0)+1);
        }
        return count;
    }
}