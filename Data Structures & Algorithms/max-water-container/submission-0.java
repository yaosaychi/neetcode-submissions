class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int result;
        int j = heights.length-1;
        int i =0;
        while(i != j){
            result = (j-i)* Math.min(heights[i], heights[j]);
            if(heights[i] < heights[j]){
                i++;
            }else{
                j--;
            }
            if(result > max){
                max = result;
            }
        }
        return max;
    }
}
