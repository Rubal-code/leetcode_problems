class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        int n=nums.length;
        ArrayList<Integer>list=new ArrayList<>();
        while(i<n){
            int correctIndex=nums[i]-1;
            if(nums[i]!=nums[correctIndex]){
                int temp=nums[i];
                nums[i]=nums[correctIndex];
                nums[correctIndex]=temp;
            }
            else{
                i++;
            }
        }                   // nums = [1,2,3,4,3,2,7,8] after cyclic sort 
        for(i=0;i<n;i++){
            if(nums[i] != i+1){     // jo elemt galt positoion pe hai
                list.add(i+1);
            }
        }
        return list;
    }
}