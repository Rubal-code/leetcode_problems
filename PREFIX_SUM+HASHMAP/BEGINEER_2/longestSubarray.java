// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer>map=new HashMap<>();
        int prefix_sum=0;
        int max_len=0;
        map.put(0,-1);
        for(int i=0;i<arr.length;i++){
            prefix_sum+=arr[i];
            
            
            // if (prefix_sum-k) seen before
            if(map.containsKey(prefix_sum-k)){
                int len=i-map.get(prefix_sum-k);
                max_len=Math.max(max_len,len);
            }
            if(!map.containsKey(prefix_sum)){
                map.put(prefix_sum,i);
            }
        }
        return max_len;
    }
}
