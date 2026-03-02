import java.util.*;

class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int duplicate = -1;
        int missing = -1;
        
        // Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // Check from 1 to n
        for (int i = 1; i <= nums.length; i++) {
            if (!map.containsKey(i)) {
                missing = i;
            } else if (map.get(i) == 2) {
                duplicate = i;
            }
        }
        
        return new int[]{duplicate, missing};
    }
}