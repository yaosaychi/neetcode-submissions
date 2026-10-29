class Solution {
    public static HashMap<Integer, Integer> memo = new HashMap<>();
    public int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int res = climbStairs(n - 1) + climbStairs(n - 2);

        

        memo.put(n, res);

        return memo.get(n);
    }
}
