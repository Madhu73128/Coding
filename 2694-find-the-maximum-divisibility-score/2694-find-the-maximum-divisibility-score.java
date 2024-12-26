class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int max=0;
        int mindiv=Integer.MAX_VALUE;
        int res=0;
        for(int d:divisors)
        {
            int count=0;
            for(int n:nums)
            {
                if(n%d==0)
                {
                    count++;
                }
            }
            if(count==res)
            {
                mindiv=Math.min(mindiv,d);
            }
            if(count>res)
            {
                res=count;
                mindiv=d;
            }
            // if((count>=res)||d<mindiv)
            // {
            //     mindiv=d; 
            //     res=count;
            // }//Not Working
        }
        return mindiv;
    }
}
// https://www.youtube.com/watch?v=Aqhrp1nYMqo