class Solution {
    public boolean isPalindrome(String s) {
        String  ns = s.replaceAll("[^a-zA-Z0-9]", "");
        ns =  ns.strip().toLowerCase();
        int left = 0;
        int right = ns.length()-1;
        while(left < right){
            if(ns.charAt(left) == ns.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }
}
