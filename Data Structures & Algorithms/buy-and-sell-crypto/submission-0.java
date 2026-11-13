class Solution {
    public int maxProfit(int[] nums) {
        // we must buy before we can sell.
        // so if we buy; check to see if there is a day lower than our buy.
        // if not we return zero since we didn't sell

        //now if we find a day less than our buy, we switch buy days.
        //however if we encounter a day greater our current buy we sell noting the profit.
        int buy = nums[0];
        int current = 0;
        int best =0;
        int sell =0;
        for(int i =1; i < nums.length; i++){
            if(nums[i] < buy){
                buy = nums[i];
            }

            else if (nums[i] > buy){
                current = nums[i] - buy;
                sell = i;

            }
            best = Math.max(best, current);
        }
        return best;
    }
}
