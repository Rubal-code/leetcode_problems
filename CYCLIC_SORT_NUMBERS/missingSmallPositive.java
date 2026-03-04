class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;

        // 1. Cyclic Sort: Place each number 'x' at index 'x - 1'
        for (int i = 0; i < n; i++) {
            // Check if arr[i] is in the valid range [1, n]
            // AND if it is not already in its correct position
            while (arr[i] > 0 && arr[i] <= n && arr[i] != arr[arr[i] - 1]) {
                // Swap arr[i] with the value at its target index
                int targetIdx = arr[i] - 1;
                int temp = arr[i];
                arr[i] = arr[targetIdx];
                arr[targetIdx] = temp;
            }
        }

        // 2. Scan the array to find the first index 'i' where arr[i] != i + 1
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1; // This is the smallest missing positive
            }
        }

        // 3. If all numbers from 1 to n are present, return n + 1
        return n + 1;
    }
}