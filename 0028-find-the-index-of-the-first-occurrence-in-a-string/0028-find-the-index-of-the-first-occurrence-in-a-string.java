class Solution {
    public int strStr(String haystack, String needle) {
        int m=haystack.length();
        int n=needle.length();
        for(int i=0;i<=m-n;i++)
        {
            if(haystack.substring(i,i+n).equals(needle))
            return i;
        }
        return -1;
    }
}
// https://www.youtube.com/watch?v=OWaZ6AosS30