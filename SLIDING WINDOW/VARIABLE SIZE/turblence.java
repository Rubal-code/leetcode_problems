class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int n = arr.length;
        if (n == 1) return 1;

        int left = 0;
        int maxLength = 1;

        for (int right = 1; right < n; right++) {

            if (arr[right] == arr[right - 1]) {
                left = right;
            }
            else if (right == 1 ||
                (arr[right] > arr[right - 1] && arr[right - 1] < arr[right - 2]) ||
                (arr[right] < arr[right - 1] && arr[right - 1] > arr[right - 2])) {

                maxLength = Math.max(maxLength, right - left + 1);
            }
            else {
                left = right - 1;
                maxLength = Math.max(maxLength, 2);   //  THIS LINE FIXES YOUR BUG  because when turbulence breaks there will be atleat two elements right and right -1 will be present
            }
        }

        return maxLength;
    }
}