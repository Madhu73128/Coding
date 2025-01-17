class Solution {
    public boolean validPalindrome(String s) {
        int p1=0,p2=s.length()-1;
        int cnt=0;
        while(p1<=p2)
        {
            if(s.charAt(p1)==s.charAt(p2))
            {
                p1++;
                p2--;
            }
            else
            {
                cnt++;
                p1++;
            }
        }
        if(cnt<=1)
        return true;
        p1=0;p2=s.length()-1;cnt=0;
        while(p1<=p2)
        {
            if(s.charAt(p1)==s.charAt(p2))
            {
                p1++;
                p2--;
            }
            else
            {
                cnt++;
                p2--;
            }
        }
        if(cnt<=1)
        return true;
        return false;
    }
}