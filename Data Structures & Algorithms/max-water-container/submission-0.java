class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int left = 0;
        int right = n-1;
        int currentResult=0;
        int maxResult=0;

        while(left<right){
            int width = right - left;
            int height = heights[right]<heights[left]?heights[right]:heights[left];
            currentResult = width*height;
            if(currentResult>maxResult){
                maxResult=currentResult;
            }
            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }
        }

        return maxResult;
    }
}
