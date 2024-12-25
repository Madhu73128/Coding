class Solution {
    public int hammingDistance(int x, int y) {
        int count=0;
        while(x>0||y>0)
        {
            if((x&1)!=(y&1))
            {
                count++;
            }
            x>>=1;
            y>>=1;
        }
        return count;
        // return bitCount(x^y);
    }
    // public static int bitCount(int n)
    // {
    //     int count=0;
    //     while(n>0)
    //     {
    //         // n=n&(n-1);
    //         // count+=1;
    //         count+=(n&1);
    //         n>>=1;
    //     }
    //     return count;
    // }
}
// https://www.youtube.com/watch?v=eeO4btyorq8