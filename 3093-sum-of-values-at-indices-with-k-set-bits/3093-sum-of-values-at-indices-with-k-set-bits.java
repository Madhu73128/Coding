class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum=0;
        for(int i=0;i<nums.size();i++)
        {
            if(bitCount(i)==k)
            {
                sum+=nums.get(i);
            }
        }
        return sum;
    }
    public static int bitCount(int n)
    {
        int count=0;
        while(n>0)
        {
            // if(n%2!=0)
            // {
            //     count+=1;
            // }
            // n/=2;

            // n=n&(n-1);
            // count+=1;
            
            count+=(n&1);
            n>>=1;
        }
        return count;
    }
}