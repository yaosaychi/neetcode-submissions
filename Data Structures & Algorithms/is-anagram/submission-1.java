class Solution {
    public boolean isAnagram(String s, String t) {
        char [] ns = s.toCharArray();
        char [] nt = t.toCharArray();
        Arrays.sort(ns);
        Arrays.sort(nt);

        return Arrays.toString(ns).equals(Arrays.toString(nt));

        

        
    }
}
