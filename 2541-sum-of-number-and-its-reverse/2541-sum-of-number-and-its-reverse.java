class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        for(int i=0;i<=num;i++)
        {
            if(i+rev(i)==num)
            {
                return true;
            }
        }
        return false;
    }
    public static int rev(int number)
    {
        int rev=0;
        while(number!=0)
        {
            rev=rev*10+number%10;
            number/=10;
        }
        return rev;
    }
}