class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String>ans=new ArrayList<>();
        if(nums.length==0) return ans;
        int start=nums[0];//beginning of the range
        for(int i=0;i<nums.length;i++){
            // check if its end of the range
            if(i==nums.length-1 || nums[i]+1 != nums[i+1]){
                int end=nums[i];
                if(start==end){
                    ans.add(start+"");
                }
                else{
                    ans.add(start+"->"+end);
                }
                // start new range
                if(i+1 < nums.length){
                    start=nums[i+1];
                }
            }
        }
        return ans;
    }
}