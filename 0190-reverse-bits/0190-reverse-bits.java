public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) 
    {
        int res=0;
        for(int i=31;i>=0;i--)
        {
            if((n&1)==1)//if current bit of current number is set bit then
            {
                res+=1<<i;//make corresponding bit from the reverse as set bit by multiplying and adding to res
            }
            n>>=1;//divide
        }
        return res;
    }
}