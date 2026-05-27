class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int a:
             nums) {
            set.add(a);
        }
        return set.size() != nums.length;
    }
}