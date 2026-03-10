import java.util.*;

class Solution {
    public int minMeetingRooms(int[][] intervals) {

        // 1. sort meetings by start time
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);

        // 2. min heap to store end times
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // first meeting
        pq.add(intervals[0][1]);

        for(int i = 1; i < intervals.length; i++){

            // if meeting room becomes free
            if(intervals[i][0] >= pq.peek()){
                pq.poll();
            }

            // allocate room
            pq.add(intervals[i][1]);
        }

        return pq.size();
    }
}