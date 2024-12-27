class Solution {
    public int totalHammingDistance(int[] nums)
    {
        int res=0;
        int n=nums.length;
        for(int i=0;i<32;i++)
        {
            int setBitsCnt=0;
            for(int num:nums)
            {
                if((num&(1<<i))==(1<<i))
                {
                    setBitsCnt++;
                }
            }
            res+=setBitsCnt*(n-setBitsCnt);
        }
        return res;
    }
    // https://www.youtube.com/watch?v=V5Z1TcW42R0&t=312s
    // {
    //     int n=nums.length;
    //     int count=0;
    //     for(int i=0;i<n-1m;i++)
    //     {
    //         for(int j=i+1;j<n;j++)
    //         {
    //             count+=bitCount(i^j);
    //         }
    //     }   
    //     return count;
    // } 
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
    //{
    // Not Working
    //     int n=nums.length;
    //     int count=0;
    //     for(int i=0;i<n-1;i++)
    //     {
    //         for(int j=i+1;j<n;j++)
    //         {
    //             count+=hammingDistance(i,j);
    //         }
    //     }   
    //     return count;
    // }
    // public static int hammingDistance(int x,int y)
    // {
    //     int count=0;
    //     while(x>0||y>0)
    //     {
    //         if((x&1)!=(y&1))
    //         {
    //             count++;
    //         }
    //         x>>=1;
    //         y>>=1;
    //     }
    //     return count;
    // }
}