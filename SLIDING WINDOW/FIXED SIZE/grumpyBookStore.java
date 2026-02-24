class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n=customers.length;
        int BaseSatisfied=0;

        //step 1 count already satisfied customers
        for(int i=0;i<n;i++){
            if(grumpy[i]==0){
                BaseSatisfied+=customers[i];
            }
        }
        //step 2: Sliding window to find max extra customers
        int extra=0;
        // first window
        for(int i=0;i<minutes;i++){
            if(grumpy[i]==1){
                extra+=customers[i];
            }
        }
        int maxextra=extra;
        for(int i=minutes;i<n;i++){
            //add new element
            if(grumpy[i]==1){
                extra+=customers[i];
            }
            //remove old element
            if(grumpy[i-minutes]==1){
                extra-=customers[i-minutes];
            }
            maxextra=Math.max(maxextra,extra);
        }
        return BaseSatisfied + maxextra;
    }
}