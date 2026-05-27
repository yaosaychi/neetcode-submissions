class Solution {
    public boolean isAnagram(String s, String t) {
        char [] se = s.toCharArray();
        char [] te = t.toCharArray();
        Arrays.sort(se);
        Arrays.sort(te);

        return Arrays.equals(se, te);

    }
}
