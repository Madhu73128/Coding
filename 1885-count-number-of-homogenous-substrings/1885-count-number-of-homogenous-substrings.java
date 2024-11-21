class Solution {
    public int countHomogenous(String s) {
        int n=s.length();
        char currchar=s.charAt(0);
        int currlen=1;
        int res=1;
        int mod=1000000007;
        for(int i=1;i<n;i++)
        {
            if(s.charAt(i)==currchar)
            {
                currlen++;
            }
            else
            {
                currlen=1;
                currchar=s.charAt(i);
            }
            res=res+currlen;
            res=res%mod;
        }
        return res%mod;
    }
}