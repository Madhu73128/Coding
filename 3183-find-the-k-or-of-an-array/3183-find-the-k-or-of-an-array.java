class Solution {
    public int findKOr(int[] nums, int k) {
        int bits[]=new int[31];
        for(int num:nums)
        {
            // int i=0;
            while(num>0)
            {
                for(int i=0;i<31;i++)
                {
                    bits[i]+=num&1;
                    num>>=1;
                }
                // bits[i]+=num&1;
                // num>>=1;
                // i++;
            }
        }
        int res=0;
        // int multiplier=1;
        for(int i=0;i<31;i++)
        {
            if(bits[i]>=k)
            {
                res+=Math.pow(2,i);
                // res+=multiplier;
            }
            // multiplier*=2;
        }       
        return res;
    }
}