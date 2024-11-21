class Solution {
    public int numSub(String s) {
        int n=s.length();
        int res=0;
        int currlen=0;
        int mod=1000000007;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='1')
            {
                currlen++;
            }
            else
            {
                currlen=0;
            }
            res+=currlen;
            res%=mod;
        }
        return res;
    }
}