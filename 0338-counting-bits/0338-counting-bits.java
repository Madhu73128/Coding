class Solution {
    public int[] countBits(int n) {
        // int res[]=new int[n+1];
        // for(int i=0;i<=n;i++)
        // {
        //     res[i]=bitCount(i);
        // }
        // return res;
        int res[]=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            if(i==0||i==1)
            res[i]=i;
            else
            res[i]=res[i%2]+res[i/2];
        }
        return res;
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