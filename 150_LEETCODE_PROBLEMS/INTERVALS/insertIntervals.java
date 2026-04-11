class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]>result=new ArrayList<>();
       for(int[]interval:intervals){
        // case 1:new interval comes before and not overlap
        if(newInterval[1] < interval[0]){
            result.add(newInterval);
            newInterval=interval;
        }
        //case 2:new interval comes after and not overlap
        else if(interval[1] < newInterval[0]){
            result.add(interval);
        }
        else{
            // case 3 overlap
            newInterval[0]=Math.min(interval[0],newInterval[0]);
            newInterval[1]=Math.max(interval[1],newInterval[1]);
        }
       }
       result.add(newInterval);
       return result.toArray(new int[result.size()][]);
    }
}