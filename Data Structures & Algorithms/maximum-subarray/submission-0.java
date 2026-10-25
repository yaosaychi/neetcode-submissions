class Solution {
    public int maxSubArray(int[] nums) {
        int best = nums[0];
        int bestsofar = 0;
        for(int i = 0; i< nums.length; i++){
            bestsofar = Math.max(bestsofar, 0);
            bestsofar += nums[i];
            best = Math.max(best, bestsofar);
        }

        return best;
    }
}
