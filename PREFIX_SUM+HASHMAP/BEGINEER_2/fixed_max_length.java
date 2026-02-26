class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);

        int prefix_sum=0;
        int maxlength=0;

        for(int i=0;i<nums.length;i++){
            //convert 0-->-1
            if(nums[i]==0){
                prefix_sum-=1;
            }
            else{
                prefix_sum+=1;
            }
            if(map.containsKey(prefix_sum)){
                int prevIndex=map.get(prefix_sum);
                maxlength=Math.max(maxlength,i-prevIndex);
            }
            else{
                map.put(prefix_sum,i);
            }
        }
        return maxlength;
    }
}