class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int numsXor=0;
        for(int num:nums)
        {
            numsXor^=num;
        }

        int maxXor=(1<<maximumBit)-1;//Math.pow(2,maximumBit)-1;

        int n=nums.length;
        int res[]=new int[n];
        for(int i=0;i<n;i++)
        {
            res[i]=numsXor^maxXor;
            numsXor^=nums[n-i-1];
        }
        return res;
    }
}
//https://www.youtube.com/watch?v=bGq2qViaO4U