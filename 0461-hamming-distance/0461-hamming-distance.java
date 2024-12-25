class Solution {
    public int hammingDistance(int x, int y) {
        return bitCount(x^y);
    }
    public static int bitCount(int n)
    {
        int count=0;
        while(n>0)
        {
            // n=n&(n-1);
            // count+=1;
            count+=(n&1);
            n>>=1;
        }
        return count;
    }
}