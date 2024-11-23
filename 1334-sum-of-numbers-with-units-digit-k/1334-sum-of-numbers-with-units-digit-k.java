class Solution 
{
    public int minimumNumbers(int num, int k) 
    {
        if(num==0)
        return 0;
        for(int x=1;x<=10;x++)
        {
            if(k*x%10==num%10)
            {
                if(k*x>num)
                return -1;
                return x;
            }
        }
        return -1;
    }   
}