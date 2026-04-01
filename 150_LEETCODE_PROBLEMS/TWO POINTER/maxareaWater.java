class Solution {
    public int maxArea(int[] height) {
        int left=0; //leftwall
        int right=height.length-1;//right wall
        int maxarea=0;

        while(left<right){
            if(height[left]<height[right]){
                maxarea=Math.max(maxarea,(right-left)*height[left]);
                left++;
            }
            else if(height[left]>=height[right]){
                maxarea=Math.max(maxarea,(right-left)*height[right]);
                right--;
            }
        }
        return maxarea;
    }
}