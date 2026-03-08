class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=0;
        int right=0;
        for(int w:weights){
            left=Math.max(left,w);
            right+=w;
        }   
        int ans=right;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(ispossible(weights,days,mid)){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }
    private boolean ispossible(int weights[], int days, int capacity){
        int day=1;
        int load=0;
        for(int w:weights){
            if(w+load > capacity){
                day++;
                load=0;
            }
            load+=w;
        }
        return day<=days;
    }
}