class Solution {
    public int maxArea(int[] nums) {
        //max = right-left * min(nums[left], nums[right])
        //if(nums[left] < nums[right];left++)
        //else(right++);
        // if left >= right we stop.

        int right = nums.length-1;
        int left = 0;
        int max =0;
        while(left < right){
            int cur = (right - left) * Math.min(nums[left], nums[right]);
            max = Math.max(cur, max);
            if(nums[left]< nums[right]) left++;
            else right--;
        }
        return max;
    }
}
