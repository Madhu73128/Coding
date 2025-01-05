class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String str=s+s;
        int n=str.length();
        String strr=str.substring(1,n-1);
        return strr.contains(s);
    }
}