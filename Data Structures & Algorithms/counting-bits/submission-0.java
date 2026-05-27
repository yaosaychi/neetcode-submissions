class Solution {
    public int[] countBits(int n) {
        int [] nums = new int[n+1];
        for(int i = 0; i <= n; i++){
            int bit = Integer.bitCount(i);
            nums[i] = bit;
        }

        return nums;
    }
}
