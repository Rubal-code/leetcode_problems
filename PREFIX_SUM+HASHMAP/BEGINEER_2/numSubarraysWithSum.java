class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=nums.length;
        int prefix_sum=0;
        int count=0;
        map.put(0,1);   // when ever thers is frequncy ques this is the base and for longest/shortest length the base case will be (0,-1)
        for(int i=0;i<n;i++){
            prefix_sum+=nums[i];
            if(map.containsKey(prefix_sum-goal)){
                count+=map.get(prefix_sum-goal);
            }
            map.put(prefix_sum,map.getOrDefault(prefix_sum,0)+1);
        }
        return count;
    }
}