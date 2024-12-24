class Solution {
    public int numberOfSteps(int num) {
        // int count=0;
        // while(num>0)
        // {
        //     if(num%2==0)
        //     {
        //         num/=2;
        //     }
        //     else
        //     {
        //         num-=1;
        //     }
        //     count++;
        // }
        // return count;
        int count=0;
        while(num>0)
        {
            if((num&1)==0)
            {
                num>>=1;
            }
            else
            {
                // num^=1;
                // num=1^num;
                num=(num>>1)<<1;
            }
            count++;
        }
        return count;
    }
}