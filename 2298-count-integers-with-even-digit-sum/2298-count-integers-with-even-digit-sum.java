class Solution {
    public int countEven(int num) {
        int cnt=0;
        for(int i=1;i<=num;i++)
        {
            if(func(i))
            {
                cnt++;
            }
        }
        return cnt;
    }
    public static boolean func(int number)
    {
        int sum=0;
        while(number!=0)
        {
            int rem=number%10;
            sum+=rem;
            number/=10;
        }
        if(sum%2==0)
        return true;
        return false;
    }
}