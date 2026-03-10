class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[1]-b[1]); // Combining intervals → sort by START    
                                                 //Choosing intervals → sort by END  this is sort by end
        int remove=0;
        int prevend=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0] < prevend){
                remove++;
            }
            else{
                prevend=intervals[i][1];
            }
        }
        return remove;
    }
}