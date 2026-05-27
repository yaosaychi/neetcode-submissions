class Solution {
    public int missingNumber(int[] nums) {
        int sum = (nums.length *(nums.length + 1))/2;

        int running = 0;
        for(int n : nums){
            running += n;
        }

        int res = sum - running;
        return res;
    }
}
